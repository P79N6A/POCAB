const webpack = require('webpack');
const writeFilePlugin = require('write-file-webpack-plugin');
const webpackMerge = require('webpack-merge');
const BrowserSyncPlugin = require('browser-sync-webpack-plugin');
const ForkTsCheckerWebpackPlugin = require('fork-ts-checker-webpack-plugin');
const FriendlyErrorsWebpackPlugin = require('friendly-errors-webpack-plugin');
const SimpleProgressWebpackPlugin = require('simple-progress-webpack-plugin');
const WebpackNotifierPlugin = require('webpack-notifier');
const path = require('path');

const utils = require('./utils.js');
const commonConfig = require('./webpack.common.js');

const ENV = 'development';

module.exports = (options) => webpackMerge(commonConfig({ env: ENV }), {
    devtool: 'eval-source-map',
    devServer: {
        contentBase: './target/www',
        proxy: [{
            context: [
                '/api',
                '/user',
                '/logout'
            ],
            target: 'http://127.0.0.1:8088',
            secure: false
        }],
        stats: options.stats,
        watchOptions: {
            ignored: /node_modules/
        }
    },
    entry: {
        polyfills: './src/polyfills',
        global: './src/assets/css/cardif-ui-style.css',
        main: './src/main'
    },
    output: {
        path: utils.root('target/www'),
        filename: '[name].bundle.js',
        chunkFilename: '[id].chunk.js'
    },
    module: {
        rules: [{
            test: /\.ts$/,
            enforce: 'pre',
            loader: 'tslint-loader',
            exclude: ['/node_modules/', new RegExp('reflect-metadata\\' + path.sep + 'Reflect\\.ts')]
        },
        {
            test: /\.ts$/,
            use: [
                'angular2-template-loader',
                {
                    loader: 'cache-loader',
                    options: {
                      cacheDirectory: path.resolve('target/cache-loader')
                    }
                },
                {
                    loader: 'thread-loader',
                    options: {
                        // there should be 1 cpu for the fork-ts-checker-webpack-plugin
                        workers: require('os').cpus().length - 1
                    }
                },
                {
                    loader: 'ts-loader',
                    options: {
                        transpileOnly: true,
                        happyPackMode: true
                    }
                },
                'angular-router-loader'
            ],
            exclude: ['/node_modules/']
        },
        {
            test: /\.css$/,
            use: ['to-string-loader', 'css-loader'],
            exclude: /(vendor\.css|cardif-ui-style\.css)/
        },
        {
            test: /(vendor\.css|cardif-ui-style\.css)/,
            use: ['style-loader', 'css-loader']
        }]
    },
    stats: options.stats,
    plugins: [
        new SimpleProgressWebpackPlugin({
                format: options.stats === 'minimal' ? 'compact' : 'expanded'
            }),
        new FriendlyErrorsWebpackPlugin(),
        new ForkTsCheckerWebpackPlugin(),
        new BrowserSyncPlugin({
            host: 'localhost',
            port: 4200,
            socket: {
                clients: {
                    heartbeatTimeout: 60000
                }
            }
        }, {
            reload: false
        }),
        new webpack.ContextReplacementPlugin(
            /angular(\\|\/)core(\\|\/)/,
            path.resolve(__dirname, './src')
        ),
        new writeFilePlugin(),
        new webpack.WatchIgnorePlugin([
            utils.root('src/test'),
        ]),
        new WebpackNotifierPlugin({
            title: 'Angular-Archetype'
        })
    ].filter(Boolean),
    mode: 'development'
});
