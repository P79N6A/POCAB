/**
 * @license
 * Copyright Google Inc. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at https://angular.io/license
 */
/// <amd-module name="tsickle/src/fileoverview_comment_transformer" />
import * as ts from 'typescript';
/**
 * A transformer that ensures the emitted JS file has an \@fileoverview comment that contains an
 * \@suppress {checkTypes} annotation by either adding or updating an existing comment.
 */
export declare function transformFileoverviewCommentFactory(diagnostics: ts.Diagnostic[]): () => (sourceFile: ts.SourceFile) => ts.SourceFile;
