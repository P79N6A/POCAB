/**
 * @license
 * Copyright Google Inc. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at https://angular.io/license
 */
/// <amd-module name="tsickle/src/jsdoc_transformer" />
/**
 * @fileoverview jsdoc_transformer contains the logic to add JSDoc comments to TypeScript code.
 *
 * One of tsickle's features is to add Closure Compiler compatible JSDoc comments containing type
 * annotations, inheritance information, etc., onto TypeScript code. This allows Closure Compiler to
 * make better optimization decisions compared to an untyped code base.
 *
 * The entry point to the annotation operation is jsdocTransformer below. It adds synthetic comments
 * to existing TypeScript constructs, for example:
 *     const x: number = 1;
 * Might get transformed to:
 *     /.. \@type {number} ./
 *     const x: number = 1;
 * Later TypeScript phases then remove the type annotation, and the final emit is JavaScript that
 * only contains the JSDoc comment.
 *
 * To handle certain constructs, this transformer also performs AST transformations, e.g. by adding
 * CommonJS-style exports for type constructs, expanding `export *`, parenthesizing casts, etc.
 */
import * as ts from 'typescript';
import { AnnotatorHost } from './annotator_host';
import * as jsdoc from './jsdoc';
import { ModuleTypeTranslator } from './module_type_translator';
declare type HasTypeParameters = ts.InterfaceDeclaration | ts.ClassLikeDeclaration | ts.TypeAliasDeclaration | ts.SignatureDeclaration;
/** Adds an \@template clause to docTags if decl has type parameters. */
export declare function maybeAddTemplateClause(docTags: jsdoc.Tag[], decl: HasTypeParameters): void;
/**
 * Adds heritage clauses (\@extends, \@implements) to the given docTags for decl. Used by
 * jsdoc_transformer and externs generation.
 */
export declare function maybeAddHeritageClauses(docTags: jsdoc.Tag[], mtt: ModuleTypeTranslator, decl: ts.ClassLikeDeclaration | ts.InterfaceDeclaration): void;
/** Removes comment metacharacters from a string, to make it safe to embed in a comment. */
export declare function escapeForComment(str: string): string;
/**
 * Removes any type assertions and non-null expressions from the AST before TypeScript processing.
 *
 * Ideally, the code in jsdoc_transformer below should just remove the cast expression and
 * replace it with the Closure equivalent. However Angular's compiler is fragile to AST
 * nodes being removed or changing type, so the code must retain the type assertion
 * expression, see: https://github.com/angular/angular/issues/24895.
 *
 * tsickle also cannot just generate and keep a `(/.. @type {SomeType} ./ (expr as SomeType))`
 * because TypeScript removes the parenthesized expressions in that syntax, (reasonably) believing
 * they were only added for the TS cast.
 *
 * The final workaround is then to keep the TypeScript type assertions, and have a post-Angular
 * processing step that removes the assertions before TypeScript sees them.
 *
 * TODO(martinprobst): remove once the Angular issue is fixed.
 */
export declare function removeTypeAssertions(): ts.TransformerFactory<ts.SourceFile>;
/**
 * jsdocTransformer returns a transformer factory that converts TypeScript types into the equivalent
 * JSDoc annotations.
 */
export declare function jsdocTransformer(host: AnnotatorHost, tsOptions: ts.CompilerOptions, moduleResolutionHost: ts.ModuleResolutionHost, typeChecker: ts.TypeChecker, diagnostics: ts.Diagnostic[]): (context: ts.TransformationContext) => ts.Transformer<ts.SourceFile>;
export {};
