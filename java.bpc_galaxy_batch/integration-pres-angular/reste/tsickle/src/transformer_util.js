/**
 * @license
 * Copyright Google Inc. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at https://angular.io/license
 */
var __assign = (this && this.__assign) || function () {
    __assign = Object.assign || function(t) {
        for (var s, i = 1, n = arguments.length; i < n; i++) {
            s = arguments[i];
            for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p))
                t[p] = s[p];
        }
        return t;
    };
    return __assign.apply(this, arguments);
};
var __read = (this && this.__read) || function (o, n) {
    var m = typeof Symbol === "function" && o[Symbol.iterator];
    if (!m) return o;
    var i = m.call(o), r, ar = [], e;
    try {
        while ((n === void 0 || n-- > 0) && !(r = i.next()).done) ar.push(r.value);
    }
    catch (error) { e = { error: error }; }
    finally {
        try {
            if (r && !r.done && (m = i["return"])) m.call(i);
        }
        finally { if (e) throw e.error; }
    }
    return ar;
};
var __spread = (this && this.__spread) || function () {
    for (var ar = [], i = 0; i < arguments.length; i++) ar = ar.concat(__read(arguments[i]));
    return ar;
};
(function (factory) {
    if (typeof module === "object" && typeof module.exports === "object") {
        var v = factory(require, exports);
        if (v !== undefined) module.exports = v;
    }
    else if (typeof define === "function" && define.amd) {
        define("tsickle/src/transformer_util", ["require", "exports", "typescript"], factory);
    }
})(function (require, exports) {
    "use strict";
    Object.defineProperty(exports, "__esModule", { value: true });
    var ts = require("typescript");
    /** @return true if node has the specified modifier flag set. */
    function hasModifierFlag(declaration, flag) {
        return (ts.getCombinedModifierFlags(declaration) & flag) !== 0;
    }
    exports.hasModifierFlag = hasModifierFlag;
    /** @return true if node has the specified modifier flag set. */
    function isAmbient(node) {
        var current = node;
        while (current) {
            if (hasModifierFlag(current, ts.ModifierFlags.Ambient)) {
                return true;
            }
            current = current.parent;
        }
        return false;
    }
    exports.isAmbient = isAmbient;
    /** Returns true if fileName is a .d.ts file. */
    function isDtsFileName(fileName) {
        return fileName.endsWith('.d.ts');
    }
    exports.isDtsFileName = isDtsFileName;
    /** Returns the string contents of a ts.Identifier. */
    function getIdentifierText(identifier) {
        // NOTE: 'escapedText' on an Identifier may be escaped if it starts with '__'. The alternative,
        // getText(), cannot be used on synthesized nodes, so unescape the identifier below.
        return unescapeName(identifier.escapedText);
    }
    exports.getIdentifierText = getIdentifierText;
    /** Returns a dot-joined qualified name (foo.bar.Baz). */
    function getEntityNameText(name) {
        if (ts.isIdentifier(name)) {
            return getIdentifierText(name);
        }
        return getEntityNameText(name.left) + '.' + getIdentifierText(name.right);
    }
    exports.getEntityNameText = getEntityNameText;
    /**
     * Converts an escaped TypeScript name into the original source name.
     */
    function unescapeName(name) {
        // See the private function unescapeIdentifier in TypeScript's utilities.ts.
        var str = name;
        if (str.startsWith('___'))
            return str.substring(1);
        return str;
    }
    exports.unescapeName = unescapeName;
    /**
     * ts.createNotEmittedStatement will create a node, but the comments covered by its text range are
     * never emittedm except for very specific special cases (/// comments).
     *
     * createNotEmittedStatementWithComments creates a not emitted statement and adds comment ranges
     * from the original statement as synthetic comments to it, so that they get retained in the output.
     */
    function createNotEmittedStatementWithComments(sourceFile, original) {
        var replacement = ts.createNotEmittedStatement(original);
        // NB: synthetic nodes can have pos/end == -1. This is handled by the underlying implementation.
        var leading = ts.getLeadingCommentRanges(sourceFile.text, original.pos) || [];
        var trailing = ts.getTrailingCommentRanges(sourceFile.text, original.end) || [];
        replacement =
            ts.setSyntheticLeadingComments(replacement, synthesizeCommentRanges(sourceFile, leading));
        replacement =
            ts.setSyntheticTrailingComments(replacement, synthesizeCommentRanges(sourceFile, trailing));
        return replacement;
    }
    exports.createNotEmittedStatementWithComments = createNotEmittedStatementWithComments;
    /**
     * Converts `ts.CommentRange`s into `ts.SynthesizedComment`s.
     */
    function synthesizeCommentRanges(sourceFile, parsedComments) {
        var synthesizedComments = [];
        parsedComments.forEach(function (_a, commentIdx) {
            var kind = _a.kind, pos = _a.pos, end = _a.end, hasTrailingNewLine = _a.hasTrailingNewLine;
            var commentText = sourceFile.text.substring(pos, end).trim();
            if (kind === ts.SyntaxKind.MultiLineCommentTrivia) {
                commentText = commentText.replace(/(^\/\*)|(\*\/$)/g, '');
            }
            else if (kind === ts.SyntaxKind.SingleLineCommentTrivia) {
                if (commentText.startsWith('///')) {
                    // triple-slash comments are typescript specific, ignore them in the output.
                    return;
                }
                commentText = commentText.replace(/(^\/\/)/g, '');
            }
            synthesizedComments.push({ kind: kind, text: commentText, hasTrailingNewLine: hasTrailingNewLine, pos: -1, end: -1 });
        });
        return synthesizedComments;
    }
    exports.synthesizeCommentRanges = synthesizeCommentRanges;
    /**
     * Creates a non emitted statement that can be used to store synthesized comments.
     */
    function createNotEmittedStatement(sourceFile) {
        var stmt = ts.createNotEmittedStatement(sourceFile);
        ts.setOriginalNode(stmt, undefined);
        ts.setTextRange(stmt, { pos: 0, end: 0 });
        ts.setEmitFlags(stmt, ts.EmitFlags.CustomPrologue);
        return stmt;
    }
    exports.createNotEmittedStatement = createNotEmittedStatement;
    /**
     * This is a version of `ts.visitEachChild` that works that calls our version
     * of `updateSourceFileNode`, so that typescript doesn't lose type information
     * for property decorators.
     * See https://github.com/Microsoft/TypeScript/issues/17384
     *
     * @param sf
     * @param statements
     */
    function visitEachChild(node, visitor, context) {
        if (node.kind === ts.SyntaxKind.SourceFile) {
            var sf = node;
            return updateSourceFileNode(sf, ts.visitLexicalEnvironment(sf.statements, visitor, context));
        }
        return ts.visitEachChild(node, visitor, context);
    }
    exports.visitEachChild = visitEachChild;
    /**
     * This is a version of `ts.updateSourceFileNode` that works
     * well with property decorators.
     * See https://github.com/Microsoft/TypeScript/issues/17384
     * TODO(#634): This has been fixed in TS 2.5. Investigate removal.
     *
     * @param sf
     * @param statements
     */
    function updateSourceFileNode(sf, statements) {
        if (statements === sf.statements) {
            return sf;
        }
        // Note: Need to clone the original file (and not use `ts.updateSourceFileNode`)
        // as otherwise TS fails when resolving types for decorators.
        sf = ts.getMutableClone(sf);
        sf.statements = statements;
        return sf;
    }
    exports.updateSourceFileNode = updateSourceFileNode;
    // Copied from TypeScript
    function isTypeNodeKind(kind) {
        return (kind >= ts.SyntaxKind.FirstTypeNode && kind <= ts.SyntaxKind.LastTypeNode) ||
            kind === ts.SyntaxKind.AnyKeyword || kind === ts.SyntaxKind.NumberKeyword ||
            kind === ts.SyntaxKind.ObjectKeyword || kind === ts.SyntaxKind.BooleanKeyword ||
            kind === ts.SyntaxKind.StringKeyword || kind === ts.SyntaxKind.SymbolKeyword ||
            kind === ts.SyntaxKind.ThisKeyword || kind === ts.SyntaxKind.VoidKeyword ||
            kind === ts.SyntaxKind.UndefinedKeyword || kind === ts.SyntaxKind.NullKeyword ||
            kind === ts.SyntaxKind.NeverKeyword || kind === ts.SyntaxKind.ExpressionWithTypeArguments;
    }
    exports.isTypeNodeKind = isTypeNodeKind;
    /**
     * Creates a string literal that uses single quotes. Purely cosmetic, but increases fidelity to the
     * existing test suite.
     */
    function createSingleQuoteStringLiteral(text) {
        var stringLiteral = ts.createLiteral(text);
        // tslint:disable-next-line:no-any accessing TS internal API.
        stringLiteral.singleQuote = true;
        return stringLiteral;
    }
    exports.createSingleQuoteStringLiteral = createSingleQuoteStringLiteral;
    /** Creates a not emitted statement with the given text as a single line comment. */
    function createSingleLineComment(original, text) {
        var comment = {
            kind: ts.SyntaxKind.SingleLineCommentTrivia,
            text: ' ' + text,
            hasTrailingNewLine: true,
            pos: -1,
            end: -1,
        };
        return ts.setSyntheticTrailingComments(ts.createNotEmittedStatement(original), [comment]);
    }
    exports.createSingleLineComment = createSingleLineComment;
    /** Creates a not emitted statement with the given text as a single line comment. */
    function createMultiLineComment(original, text) {
        var comment = {
            kind: ts.SyntaxKind.MultiLineCommentTrivia,
            text: ' ' + text,
            hasTrailingNewLine: true,
            pos: -1,
            end: -1,
        };
        return ts.setSyntheticTrailingComments(ts.createNotEmittedStatement(original), [comment]);
    }
    exports.createMultiLineComment = createMultiLineComment;
    /**
     * debugWarn logs a debug warning.
     *
     * These should only be used for cases where tsickle is making a questionable judgement about what
     * to do. By default, tsickle does not report any warnings to the caller, and warnings are hidden
     * behind a debug flag, as warnings are only for tsickle to debug itself.
     */
    function reportDebugWarning(host, node, messageText) {
        if (!host.logWarning)
            return;
        host.logWarning(createDiagnostic(node, messageText, /* textRange */ undefined, ts.DiagnosticCategory.Warning));
    }
    exports.reportDebugWarning = reportDebugWarning;
    /**
     * Creates and reports a diagnostic by adding it to the given array.
     *
     * This is used for errors and warnings in tsickle's input. Emit errors (the default) if tsickle
     * cannot emit a correct result given the input. Emit warnings for questionable input if there's a
     * good chance that the output will work.
     *
     * For typical tsickle users, errors are always reported and break the compilation operation,
     * warnings will only be emitted for first party code (and break the compilation there), but wil be
     * ignored for third party code.
     *
     * @param textRange pass to overrride the text range from the node with a more specific range.
     */
    function reportDiagnostic(diagnostics, node, messageText, textRange, category) {
        if (category === void 0) { category = ts.DiagnosticCategory.Error; }
        diagnostics.push(createDiagnostic(node, messageText, textRange, category));
    }
    exports.reportDiagnostic = reportDiagnostic;
    function createDiagnostic(node, messageText, textRange, category) {
        var start, length;
        if (textRange) {
            start = textRange.pos;
            length = textRange.end - textRange.pos;
        }
        else {
            // Only use getStart if node has a valid pos, as it might be synthesized.
            start = node.pos >= 0 ? node.getStart() : 0;
            length = node.end - node.pos;
        }
        return {
            file: node.getSourceFile(),
            start: start,
            length: length,
            messageText: messageText,
            category: category,
            code: 0,
        };
    }
    /**
     * A replacement for ts.getLeadingCommentRanges that returns the union of synthetic and
     * non-synthetic comments on the given node, with their text included. The returned comments must
     * not be mutated, as their content might or might not be reflected back into the AST.
     */
    function getAllLeadingComments(node) {
        var allRanges = [];
        var nodeText = node.getFullText();
        var cr = ts.getLeadingCommentRanges(nodeText, 0);
        if (cr)
            allRanges.push.apply(allRanges, __spread(cr.map(function (c) { return (__assign({}, c, { text: nodeText.substring(c.pos, c.end) })); })));
        var synthetic = ts.getSyntheticLeadingComments(node);
        if (synthetic)
            allRanges.push.apply(allRanges, __spread(synthetic));
        return allRanges;
    }
    exports.getAllLeadingComments = getAllLeadingComments;
});
//# sourceMappingURL=data:application/json;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoidHJhbnNmb3JtZXJfdXRpbC5qcyIsInNvdXJjZVJvb3QiOiIiLCJzb3VyY2VzIjpbIi4uLy4uLy4uLy4uL3NyYy90cmFuc2Zvcm1lcl91dGlsLnRzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBOzs7Ozs7R0FNRzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7OztJQUVILCtCQUFpQztJQUVqQyxnRUFBZ0U7SUFDaEUsU0FBZ0IsZUFBZSxDQUFDLFdBQTJCLEVBQUUsSUFBc0I7UUFDakYsT0FBTyxDQUFDLEVBQUUsQ0FBQyx3QkFBd0IsQ0FBQyxXQUFXLENBQUMsR0FBRyxJQUFJLENBQUMsS0FBSyxDQUFDLENBQUM7SUFDakUsQ0FBQztJQUZELDBDQUVDO0lBRUQsZ0VBQWdFO0lBQ2hFLFNBQWdCLFNBQVMsQ0FBQyxJQUFhO1FBQ3JDLElBQUksT0FBTyxHQUFzQixJQUFJLENBQUM7UUFDdEMsT0FBTyxPQUFPLEVBQUU7WUFDZCxJQUFJLGVBQWUsQ0FBQyxPQUF5QixFQUFFLEVBQUUsQ0FBQyxhQUFhLENBQUMsT0FBTyxDQUFDLEVBQUU7Z0JBQ3hFLE9BQU8sSUFBSSxDQUFDO2FBQ2I7WUFDRCxPQUFPLEdBQUcsT0FBTyxDQUFDLE1BQU0sQ0FBQztTQUMxQjtRQUNELE9BQU8sS0FBSyxDQUFDO0lBQ2YsQ0FBQztJQVRELDhCQVNDO0lBRUQsZ0RBQWdEO0lBQ2hELFNBQWdCLGFBQWEsQ0FBQyxRQUFnQjtRQUM1QyxPQUFPLFFBQVEsQ0FBQyxRQUFRLENBQUMsT0FBTyxDQUFDLENBQUM7SUFDcEMsQ0FBQztJQUZELHNDQUVDO0lBRUQsc0RBQXNEO0lBQ3RELFNBQWdCLGlCQUFpQixDQUFDLFVBQXlCO1FBQ3pELCtGQUErRjtRQUMvRixvRkFBb0Y7UUFDcEYsT0FBTyxZQUFZLENBQUMsVUFBVSxDQUFDLFdBQVcsQ0FBQyxDQUFDO0lBQzlDLENBQUM7SUFKRCw4Q0FJQztJQUVELHlEQUF5RDtJQUN6RCxTQUFnQixpQkFBaUIsQ0FBQyxJQUFtQjtRQUNuRCxJQUFJLEVBQUUsQ0FBQyxZQUFZLENBQUMsSUFBSSxDQUFDLEVBQUU7WUFDekIsT0FBTyxpQkFBaUIsQ0FBQyxJQUFJLENBQUMsQ0FBQztTQUNoQztRQUNELE9BQU8saUJBQWlCLENBQUMsSUFBSSxDQUFDLElBQUksQ0FBQyxHQUFHLEdBQUcsR0FBRyxpQkFBaUIsQ0FBQyxJQUFJLENBQUMsS0FBSyxDQUFDLENBQUM7SUFDNUUsQ0FBQztJQUxELDhDQUtDO0lBRUQ7O09BRUc7SUFDSCxTQUFnQixZQUFZLENBQUMsSUFBaUI7UUFDNUMsNEVBQTRFO1FBQzVFLElBQU0sR0FBRyxHQUFHLElBQWMsQ0FBQztRQUMzQixJQUFJLEdBQUcsQ0FBQyxVQUFVLENBQUMsS0FBSyxDQUFDO1lBQUUsT0FBTyxHQUFHLENBQUMsU0FBUyxDQUFDLENBQUMsQ0FBQyxDQUFDO1FBQ25ELE9BQU8sR0FBRyxDQUFDO0lBQ2IsQ0FBQztJQUxELG9DQUtDO0lBRUQ7Ozs7OztPQU1HO0lBQ0gsU0FBZ0IscUNBQXFDLENBQ2pELFVBQXlCLEVBQUUsUUFBaUI7UUFDOUMsSUFBSSxXQUFXLEdBQUcsRUFBRSxDQUFDLHlCQUF5QixDQUFDLFFBQVEsQ0FBQyxDQUFDO1FBQ3pELGdHQUFnRztRQUNoRyxJQUFNLE9BQU8sR0FBRyxFQUFFLENBQUMsdUJBQXVCLENBQUMsVUFBVSxDQUFDLElBQUksRUFBRSxRQUFRLENBQUMsR0FBRyxDQUFDLElBQUksRUFBRSxDQUFDO1FBQ2hGLElBQU0sUUFBUSxHQUFHLEVBQUUsQ0FBQyx3QkFBd0IsQ0FBQyxVQUFVLENBQUMsSUFBSSxFQUFFLFFBQVEsQ0FBQyxHQUFHLENBQUMsSUFBSSxFQUFFLENBQUM7UUFDbEYsV0FBVztZQUNQLEVBQUUsQ0FBQywyQkFBMkIsQ0FBQyxXQUFXLEVBQUUsdUJBQXVCLENBQUMsVUFBVSxFQUFFLE9BQU8sQ0FBQyxDQUFDLENBQUM7UUFDOUYsV0FBVztZQUNQLEVBQUUsQ0FBQyw0QkFBNEIsQ0FBQyxXQUFXLEVBQUUsdUJBQXVCLENBQUMsVUFBVSxFQUFFLFFBQVEsQ0FBQyxDQUFDLENBQUM7UUFDaEcsT0FBTyxXQUFXLENBQUM7SUFDckIsQ0FBQztJQVhELHNGQVdDO0lBRUQ7O09BRUc7SUFDSCxTQUFnQix1QkFBdUIsQ0FDbkMsVUFBeUIsRUFBRSxjQUFpQztRQUM5RCxJQUFNLG1CQUFtQixHQUE0QixFQUFFLENBQUM7UUFDeEQsY0FBYyxDQUFDLE9BQU8sQ0FBQyxVQUFDLEVBQW9DLEVBQUUsVUFBVTtnQkFBL0MsY0FBSSxFQUFFLFlBQUcsRUFBRSxZQUFHLEVBQUUsMENBQWtCO1lBQ3pELElBQUksV0FBVyxHQUFHLFVBQVUsQ0FBQyxJQUFJLENBQUMsU0FBUyxDQUFDLEdBQUcsRUFBRSxHQUFHLENBQUMsQ0FBQyxJQUFJLEVBQUUsQ0FBQztZQUM3RCxJQUFJLElBQUksS0FBSyxFQUFFLENBQUMsVUFBVSxDQUFDLHNCQUFzQixFQUFFO2dCQUNqRCxXQUFXLEdBQUcsV0FBVyxDQUFDLE9BQU8sQ0FBQyxrQkFBa0IsRUFBRSxFQUFFLENBQUMsQ0FBQzthQUMzRDtpQkFBTSxJQUFJLElBQUksS0FBSyxFQUFFLENBQUMsVUFBVSxDQUFDLHVCQUF1QixFQUFFO2dCQUN6RCxJQUFJLFdBQVcsQ0FBQyxVQUFVLENBQUMsS0FBSyxDQUFDLEVBQUU7b0JBQ2pDLDRFQUE0RTtvQkFDNUUsT0FBTztpQkFDUjtnQkFDRCxXQUFXLEdBQUcsV0FBVyxDQUFDLE9BQU8sQ0FBQyxVQUFVLEVBQUUsRUFBRSxDQUFDLENBQUM7YUFDbkQ7WUFDRCxtQkFBbUIsQ0FBQyxJQUFJLENBQUMsRUFBQyxJQUFJLE1BQUEsRUFBRSxJQUFJLEVBQUUsV0FBVyxFQUFFLGtCQUFrQixvQkFBQSxFQUFFLEdBQUcsRUFBRSxDQUFDLENBQUMsRUFBRSxHQUFHLEVBQUUsQ0FBQyxDQUFDLEVBQUMsQ0FBQyxDQUFDO1FBQzVGLENBQUMsQ0FBQyxDQUFDO1FBQ0gsT0FBTyxtQkFBbUIsQ0FBQztJQUM3QixDQUFDO0lBakJELDBEQWlCQztJQUVEOztPQUVHO0lBQ0gsU0FBZ0IseUJBQXlCLENBQUMsVUFBeUI7UUFDakUsSUFBTSxJQUFJLEdBQUcsRUFBRSxDQUFDLHlCQUF5QixDQUFDLFVBQVUsQ0FBQyxDQUFDO1FBQ3RELEVBQUUsQ0FBQyxlQUFlLENBQUMsSUFBSSxFQUFFLFNBQVMsQ0FBQyxDQUFDO1FBQ3BDLEVBQUUsQ0FBQyxZQUFZLENBQUMsSUFBSSxFQUFFLEVBQUMsR0FBRyxFQUFFLENBQUMsRUFBRSxHQUFHLEVBQUUsQ0FBQyxFQUFDLENBQUMsQ0FBQztRQUN4QyxFQUFFLENBQUMsWUFBWSxDQUFDLElBQUksRUFBRSxFQUFFLENBQUMsU0FBUyxDQUFDLGNBQWMsQ0FBQyxDQUFDO1FBQ25ELE9BQU8sSUFBSSxDQUFDO0lBQ2QsQ0FBQztJQU5ELDhEQU1DO0lBRUQ7Ozs7Ozs7O09BUUc7SUFDSCxTQUFnQixjQUFjLENBQzFCLElBQWEsRUFBRSxPQUFtQixFQUFFLE9BQWlDO1FBQ3ZFLElBQUksSUFBSSxDQUFDLElBQUksS0FBSyxFQUFFLENBQUMsVUFBVSxDQUFDLFVBQVUsRUFBRTtZQUMxQyxJQUFNLEVBQUUsR0FBRyxJQUFxQixDQUFDO1lBQ2pDLE9BQU8sb0JBQW9CLENBQUMsRUFBRSxFQUFFLEVBQUUsQ0FBQyx1QkFBdUIsQ0FBQyxFQUFFLENBQUMsVUFBVSxFQUFFLE9BQU8sRUFBRSxPQUFPLENBQUMsQ0FBQyxDQUFDO1NBQzlGO1FBRUQsT0FBTyxFQUFFLENBQUMsY0FBYyxDQUFDLElBQUksRUFBRSxPQUFPLEVBQUUsT0FBTyxDQUFDLENBQUM7SUFDbkQsQ0FBQztJQVJELHdDQVFDO0lBRUQ7Ozs7Ozs7O09BUUc7SUFDSCxTQUFnQixvQkFBb0IsQ0FDaEMsRUFBaUIsRUFBRSxVQUFzQztRQUMzRCxJQUFJLFVBQVUsS0FBSyxFQUFFLENBQUMsVUFBVSxFQUFFO1lBQ2hDLE9BQU8sRUFBRSxDQUFDO1NBQ1g7UUFDRCxnRkFBZ0Y7UUFDaEYsNkRBQTZEO1FBQzdELEVBQUUsR0FBRyxFQUFFLENBQUMsZUFBZSxDQUFDLEVBQUUsQ0FBQyxDQUFDO1FBQzVCLEVBQUUsQ0FBQyxVQUFVLEdBQUcsVUFBVSxDQUFDO1FBQzNCLE9BQU8sRUFBRSxDQUFDO0lBQ1osQ0FBQztJQVZELG9EQVVDO0lBRUQseUJBQXlCO0lBQ3pCLFNBQWdCLGNBQWMsQ0FBQyxJQUFtQjtRQUNoRCxPQUFPLENBQUMsSUFBSSxJQUFJLEVBQUUsQ0FBQyxVQUFVLENBQUMsYUFBYSxJQUFJLElBQUksSUFBSSxFQUFFLENBQUMsVUFBVSxDQUFDLFlBQVksQ0FBQztZQUM5RSxJQUFJLEtBQUssRUFBRSxDQUFDLFVBQVUsQ0FBQyxVQUFVLElBQUksSUFBSSxLQUFLLEVBQUUsQ0FBQyxVQUFVLENBQUMsYUFBYTtZQUN6RSxJQUFJLEtBQUssRUFBRSxDQUFDLFVBQVUsQ0FBQyxhQUFhLElBQUksSUFBSSxLQUFLLEVBQUUsQ0FBQyxVQUFVLENBQUMsY0FBYztZQUM3RSxJQUFJLEtBQUssRUFBRSxDQUFDLFVBQVUsQ0FBQyxhQUFhLElBQUksSUFBSSxLQUFLLEVBQUUsQ0FBQyxVQUFVLENBQUMsYUFBYTtZQUM1RSxJQUFJLEtBQUssRUFBRSxDQUFDLFVBQVUsQ0FBQyxXQUFXLElBQUksSUFBSSxLQUFLLEVBQUUsQ0FBQyxVQUFVLENBQUMsV0FBVztZQUN4RSxJQUFJLEtBQUssRUFBRSxDQUFDLFVBQVUsQ0FBQyxnQkFBZ0IsSUFBSSxJQUFJLEtBQUssRUFBRSxDQUFDLFVBQVUsQ0FBQyxXQUFXO1lBQzdFLElBQUksS0FBSyxFQUFFLENBQUMsVUFBVSxDQUFDLFlBQVksSUFBSSxJQUFJLEtBQUssRUFBRSxDQUFDLFVBQVUsQ0FBQywyQkFBMkIsQ0FBQztJQUNoRyxDQUFDO0lBUkQsd0NBUUM7SUFFRDs7O09BR0c7SUFDSCxTQUFnQiw4QkFBOEIsQ0FBQyxJQUFZO1FBQ3pELElBQU0sYUFBYSxHQUFHLEVBQUUsQ0FBQyxhQUFhLENBQUMsSUFBSSxDQUFDLENBQUM7UUFDN0MsNkRBQTZEO1FBQzVELGFBQXFCLENBQUMsV0FBVyxHQUFHLElBQUksQ0FBQztRQUMxQyxPQUFPLGFBQWEsQ0FBQztJQUN2QixDQUFDO0lBTEQsd0VBS0M7SUFFRCxvRkFBb0Y7SUFDcEYsU0FBZ0IsdUJBQXVCLENBQUMsUUFBaUIsRUFBRSxJQUFZO1FBQ3JFLElBQU0sT0FBTyxHQUEwQjtZQUNyQyxJQUFJLEVBQUUsRUFBRSxDQUFDLFVBQVUsQ0FBQyx1QkFBdUI7WUFDM0MsSUFBSSxFQUFFLEdBQUcsR0FBRyxJQUFJO1lBQ2hCLGtCQUFrQixFQUFFLElBQUk7WUFDeEIsR0FBRyxFQUFFLENBQUMsQ0FBQztZQUNQLEdBQUcsRUFBRSxDQUFDLENBQUM7U0FDUixDQUFDO1FBQ0YsT0FBTyxFQUFFLENBQUMsNEJBQTRCLENBQUMsRUFBRSxDQUFDLHlCQUF5QixDQUFDLFFBQVEsQ0FBQyxFQUFFLENBQUMsT0FBTyxDQUFDLENBQUMsQ0FBQztJQUM1RixDQUFDO0lBVEQsMERBU0M7SUFFRCxvRkFBb0Y7SUFDcEYsU0FBZ0Isc0JBQXNCLENBQUMsUUFBaUIsRUFBRSxJQUFZO1FBQ3BFLElBQU0sT0FBTyxHQUEwQjtZQUNyQyxJQUFJLEVBQUUsRUFBRSxDQUFDLFVBQVUsQ0FBQyxzQkFBc0I7WUFDMUMsSUFBSSxFQUFFLEdBQUcsR0FBRyxJQUFJO1lBQ2hCLGtCQUFrQixFQUFFLElBQUk7WUFDeEIsR0FBRyxFQUFFLENBQUMsQ0FBQztZQUNQLEdBQUcsRUFBRSxDQUFDLENBQUM7U0FDUixDQUFDO1FBQ0YsT0FBTyxFQUFFLENBQUMsNEJBQTRCLENBQUMsRUFBRSxDQUFDLHlCQUF5QixDQUFDLFFBQVEsQ0FBQyxFQUFFLENBQUMsT0FBTyxDQUFDLENBQUMsQ0FBQztJQUM1RixDQUFDO0lBVEQsd0RBU0M7SUFFRDs7Ozs7O09BTUc7SUFDSCxTQUFnQixrQkFBa0IsQ0FDOUIsSUFBOEMsRUFBRSxJQUFhLEVBQUUsV0FBbUI7UUFDcEYsSUFBSSxDQUFDLElBQUksQ0FBQyxVQUFVO1lBQUUsT0FBTztRQUM3QixJQUFJLENBQUMsVUFBVSxDQUFDLGdCQUFnQixDQUM1QixJQUFJLEVBQUUsV0FBVyxFQUFFLGVBQWUsQ0FBQyxTQUFTLEVBQUUsRUFBRSxDQUFDLGtCQUFrQixDQUFDLE9BQU8sQ0FBQyxDQUFDLENBQUM7SUFDcEYsQ0FBQztJQUxELGdEQUtDO0lBRUQ7Ozs7Ozs7Ozs7OztPQVlHO0lBQ0gsU0FBZ0IsZ0JBQWdCLENBQzVCLFdBQTRCLEVBQUUsSUFBYSxFQUFFLFdBQW1CLEVBQUUsU0FBd0IsRUFDMUYsUUFBc0M7UUFBdEMseUJBQUEsRUFBQSxXQUFXLEVBQUUsQ0FBQyxrQkFBa0IsQ0FBQyxLQUFLO1FBQ3hDLFdBQVcsQ0FBQyxJQUFJLENBQUMsZ0JBQWdCLENBQUMsSUFBSSxFQUFFLFdBQVcsRUFBRSxTQUFTLEVBQUUsUUFBUSxDQUFDLENBQUMsQ0FBQztJQUM3RSxDQUFDO0lBSkQsNENBSUM7SUFFRCxTQUFTLGdCQUFnQixDQUNyQixJQUFhLEVBQUUsV0FBbUIsRUFBRSxTQUFpQyxFQUNyRSxRQUErQjtRQUNqQyxJQUFJLEtBQUssRUFBRSxNQUFjLENBQUM7UUFDMUIsSUFBSSxTQUFTLEVBQUU7WUFDYixLQUFLLEdBQUcsU0FBUyxDQUFDLEdBQUcsQ0FBQztZQUN0QixNQUFNLEdBQUcsU0FBUyxDQUFDLEdBQUcsR0FBRyxTQUFTLENBQUMsR0FBRyxDQUFDO1NBQ3hDO2FBQU07WUFDTCx5RUFBeUU7WUFDekUsS0FBSyxHQUFHLElBQUksQ0FBQyxHQUFHLElBQUksQ0FBQyxDQUFDLENBQUMsQ0FBQyxJQUFJLENBQUMsUUFBUSxFQUFFLENBQUMsQ0FBQyxDQUFDLENBQUMsQ0FBQztZQUM1QyxNQUFNLEdBQUcsSUFBSSxDQUFDLEdBQUcsR0FBRyxJQUFJLENBQUMsR0FBRyxDQUFDO1NBQzlCO1FBQ0QsT0FBTztZQUNMLElBQUksRUFBRSxJQUFJLENBQUMsYUFBYSxFQUFFO1lBQzFCLEtBQUssT0FBQTtZQUNMLE1BQU0sUUFBQTtZQUNOLFdBQVcsYUFBQTtZQUNYLFFBQVEsVUFBQTtZQUNSLElBQUksRUFBRSxDQUFDO1NBQ1IsQ0FBQztJQUNKLENBQUM7SUFFRDs7OztPQUlHO0lBQ0gsU0FBZ0IscUJBQXFCLENBQUMsSUFBYTtRQUVqRCxJQUFNLFNBQVMsR0FBb0QsRUFBRSxDQUFDO1FBQ3RFLElBQU0sUUFBUSxHQUFHLElBQUksQ0FBQyxXQUFXLEVBQUUsQ0FBQztRQUNwQyxJQUFNLEVBQUUsR0FBRyxFQUFFLENBQUMsdUJBQXVCLENBQUMsUUFBUSxFQUFFLENBQUMsQ0FBQyxDQUFDO1FBQ25ELElBQUksRUFBRTtZQUFFLFNBQVMsQ0FBQyxJQUFJLE9BQWQsU0FBUyxXQUFTLEVBQUUsQ0FBQyxHQUFHLENBQUMsVUFBQSxDQUFDLElBQUksT0FBQSxjQUFLLENBQUMsSUFBRSxJQUFJLEVBQUUsUUFBUSxDQUFDLFNBQVMsQ0FBQyxDQUFDLENBQUMsR0FBRyxFQUFFLENBQUMsQ0FBQyxHQUFHLENBQUMsSUFBRSxFQUFoRCxDQUFnRCxDQUFDLEdBQUU7UUFDekYsSUFBTSxTQUFTLEdBQUcsRUFBRSxDQUFDLDJCQUEyQixDQUFDLElBQUksQ0FBQyxDQUFDO1FBQ3ZELElBQUksU0FBUztZQUFFLFNBQVMsQ0FBQyxJQUFJLE9BQWQsU0FBUyxXQUFTLFNBQVMsR0FBRTtRQUM1QyxPQUFPLFNBQVMsQ0FBQztJQUNuQixDQUFDO0lBVEQsc0RBU0MiLCJzb3VyY2VzQ29udGVudCI6WyIvKipcbiAqIEBsaWNlbnNlXG4gKiBDb3B5cmlnaHQgR29vZ2xlIEluYy4gQWxsIFJpZ2h0cyBSZXNlcnZlZC5cbiAqXG4gKiBVc2Ugb2YgdGhpcyBzb3VyY2UgY29kZSBpcyBnb3Zlcm5lZCBieSBhbiBNSVQtc3R5bGUgbGljZW5zZSB0aGF0IGNhbiBiZVxuICogZm91bmQgaW4gdGhlIExJQ0VOU0UgZmlsZSBhdCBodHRwczovL2FuZ3VsYXIuaW8vbGljZW5zZVxuICovXG5cbmltcG9ydCAqIGFzIHRzIGZyb20gJ3R5cGVzY3JpcHQnO1xuXG4vKiogQHJldHVybiB0cnVlIGlmIG5vZGUgaGFzIHRoZSBzcGVjaWZpZWQgbW9kaWZpZXIgZmxhZyBzZXQuICovXG5leHBvcnQgZnVuY3Rpb24gaGFzTW9kaWZpZXJGbGFnKGRlY2xhcmF0aW9uOiB0cy5EZWNsYXJhdGlvbiwgZmxhZzogdHMuTW9kaWZpZXJGbGFncyk6IGJvb2xlYW4ge1xuICByZXR1cm4gKHRzLmdldENvbWJpbmVkTW9kaWZpZXJGbGFncyhkZWNsYXJhdGlvbikgJiBmbGFnKSAhPT0gMDtcbn1cblxuLyoqIEByZXR1cm4gdHJ1ZSBpZiBub2RlIGhhcyB0aGUgc3BlY2lmaWVkIG1vZGlmaWVyIGZsYWcgc2V0LiAqL1xuZXhwb3J0IGZ1bmN0aW9uIGlzQW1iaWVudChub2RlOiB0cy5Ob2RlKTogYm9vbGVhbiB7XG4gIGxldCBjdXJyZW50OiB0cy5Ob2RlfHVuZGVmaW5lZCA9IG5vZGU7XG4gIHdoaWxlIChjdXJyZW50KSB7XG4gICAgaWYgKGhhc01vZGlmaWVyRmxhZyhjdXJyZW50IGFzIHRzLkRlY2xhcmF0aW9uLCB0cy5Nb2RpZmllckZsYWdzLkFtYmllbnQpKSB7XG4gICAgICByZXR1cm4gdHJ1ZTtcbiAgICB9XG4gICAgY3VycmVudCA9IGN1cnJlbnQucGFyZW50O1xuICB9XG4gIHJldHVybiBmYWxzZTtcbn1cblxuLyoqIFJldHVybnMgdHJ1ZSBpZiBmaWxlTmFtZSBpcyBhIC5kLnRzIGZpbGUuICovXG5leHBvcnQgZnVuY3Rpb24gaXNEdHNGaWxlTmFtZShmaWxlTmFtZTogc3RyaW5nKTogYm9vbGVhbiB7XG4gIHJldHVybiBmaWxlTmFtZS5lbmRzV2l0aCgnLmQudHMnKTtcbn1cblxuLyoqIFJldHVybnMgdGhlIHN0cmluZyBjb250ZW50cyBvZiBhIHRzLklkZW50aWZpZXIuICovXG5leHBvcnQgZnVuY3Rpb24gZ2V0SWRlbnRpZmllclRleHQoaWRlbnRpZmllcjogdHMuSWRlbnRpZmllcik6IHN0cmluZyB7XG4gIC8vIE5PVEU6ICdlc2NhcGVkVGV4dCcgb24gYW4gSWRlbnRpZmllciBtYXkgYmUgZXNjYXBlZCBpZiBpdCBzdGFydHMgd2l0aCAnX18nLiBUaGUgYWx0ZXJuYXRpdmUsXG4gIC8vIGdldFRleHQoKSwgY2Fubm90IGJlIHVzZWQgb24gc3ludGhlc2l6ZWQgbm9kZXMsIHNvIHVuZXNjYXBlIHRoZSBpZGVudGlmaWVyIGJlbG93LlxuICByZXR1cm4gdW5lc2NhcGVOYW1lKGlkZW50aWZpZXIuZXNjYXBlZFRleHQpO1xufVxuXG4vKiogUmV0dXJucyBhIGRvdC1qb2luZWQgcXVhbGlmaWVkIG5hbWUgKGZvby5iYXIuQmF6KS4gKi9cbmV4cG9ydCBmdW5jdGlvbiBnZXRFbnRpdHlOYW1lVGV4dChuYW1lOiB0cy5FbnRpdHlOYW1lKTogc3RyaW5nIHtcbiAgaWYgKHRzLmlzSWRlbnRpZmllcihuYW1lKSkge1xuICAgIHJldHVybiBnZXRJZGVudGlmaWVyVGV4dChuYW1lKTtcbiAgfVxuICByZXR1cm4gZ2V0RW50aXR5TmFtZVRleHQobmFtZS5sZWZ0KSArICcuJyArIGdldElkZW50aWZpZXJUZXh0KG5hbWUucmlnaHQpO1xufVxuXG4vKipcbiAqIENvbnZlcnRzIGFuIGVzY2FwZWQgVHlwZVNjcmlwdCBuYW1lIGludG8gdGhlIG9yaWdpbmFsIHNvdXJjZSBuYW1lLlxuICovXG5leHBvcnQgZnVuY3Rpb24gdW5lc2NhcGVOYW1lKG5hbWU6IHRzLl9fU3RyaW5nKTogc3RyaW5nIHtcbiAgLy8gU2VlIHRoZSBwcml2YXRlIGZ1bmN0aW9uIHVuZXNjYXBlSWRlbnRpZmllciBpbiBUeXBlU2NyaXB0J3MgdXRpbGl0aWVzLnRzLlxuICBjb25zdCBzdHIgPSBuYW1lIGFzIHN0cmluZztcbiAgaWYgKHN0ci5zdGFydHNXaXRoKCdfX18nKSkgcmV0dXJuIHN0ci5zdWJzdHJpbmcoMSk7XG4gIHJldHVybiBzdHI7XG59XG5cbi8qKlxuICogdHMuY3JlYXRlTm90RW1pdHRlZFN0YXRlbWVudCB3aWxsIGNyZWF0ZSBhIG5vZGUsIGJ1dCB0aGUgY29tbWVudHMgY292ZXJlZCBieSBpdHMgdGV4dCByYW5nZSBhcmVcbiAqIG5ldmVyIGVtaXR0ZWRtIGV4Y2VwdCBmb3IgdmVyeSBzcGVjaWZpYyBzcGVjaWFsIGNhc2VzICgvLy8gY29tbWVudHMpLlxuICpcbiAqIGNyZWF0ZU5vdEVtaXR0ZWRTdGF0ZW1lbnRXaXRoQ29tbWVudHMgY3JlYXRlcyBhIG5vdCBlbWl0dGVkIHN0YXRlbWVudCBhbmQgYWRkcyBjb21tZW50IHJhbmdlc1xuICogZnJvbSB0aGUgb3JpZ2luYWwgc3RhdGVtZW50IGFzIHN5bnRoZXRpYyBjb21tZW50cyB0byBpdCwgc28gdGhhdCB0aGV5IGdldCByZXRhaW5lZCBpbiB0aGUgb3V0cHV0LlxuICovXG5leHBvcnQgZnVuY3Rpb24gY3JlYXRlTm90RW1pdHRlZFN0YXRlbWVudFdpdGhDb21tZW50cyhcbiAgICBzb3VyY2VGaWxlOiB0cy5Tb3VyY2VGaWxlLCBvcmlnaW5hbDogdHMuTm9kZSk6IHRzLlN0YXRlbWVudCB7XG4gIGxldCByZXBsYWNlbWVudCA9IHRzLmNyZWF0ZU5vdEVtaXR0ZWRTdGF0ZW1lbnQob3JpZ2luYWwpO1xuICAvLyBOQjogc3ludGhldGljIG5vZGVzIGNhbiBoYXZlIHBvcy9lbmQgPT0gLTEuIFRoaXMgaXMgaGFuZGxlZCBieSB0aGUgdW5kZXJseWluZyBpbXBsZW1lbnRhdGlvbi5cbiAgY29uc3QgbGVhZGluZyA9IHRzLmdldExlYWRpbmdDb21tZW50UmFuZ2VzKHNvdXJjZUZpbGUudGV4dCwgb3JpZ2luYWwucG9zKSB8fCBbXTtcbiAgY29uc3QgdHJhaWxpbmcgPSB0cy5nZXRUcmFpbGluZ0NvbW1lbnRSYW5nZXMoc291cmNlRmlsZS50ZXh0LCBvcmlnaW5hbC5lbmQpIHx8IFtdO1xuICByZXBsYWNlbWVudCA9XG4gICAgICB0cy5zZXRTeW50aGV0aWNMZWFkaW5nQ29tbWVudHMocmVwbGFjZW1lbnQsIHN5bnRoZXNpemVDb21tZW50UmFuZ2VzKHNvdXJjZUZpbGUsIGxlYWRpbmcpKTtcbiAgcmVwbGFjZW1lbnQgPVxuICAgICAgdHMuc2V0U3ludGhldGljVHJhaWxpbmdDb21tZW50cyhyZXBsYWNlbWVudCwgc3ludGhlc2l6ZUNvbW1lbnRSYW5nZXMoc291cmNlRmlsZSwgdHJhaWxpbmcpKTtcbiAgcmV0dXJuIHJlcGxhY2VtZW50O1xufVxuXG4vKipcbiAqIENvbnZlcnRzIGB0cy5Db21tZW50UmFuZ2VgcyBpbnRvIGB0cy5TeW50aGVzaXplZENvbW1lbnRgcy5cbiAqL1xuZXhwb3J0IGZ1bmN0aW9uIHN5bnRoZXNpemVDb21tZW50UmFuZ2VzKFxuICAgIHNvdXJjZUZpbGU6IHRzLlNvdXJjZUZpbGUsIHBhcnNlZENvbW1lbnRzOiB0cy5Db21tZW50UmFuZ2VbXSk6IHRzLlN5bnRoZXNpemVkQ29tbWVudFtdIHtcbiAgY29uc3Qgc3ludGhlc2l6ZWRDb21tZW50czogdHMuU3ludGhlc2l6ZWRDb21tZW50W10gPSBbXTtcbiAgcGFyc2VkQ29tbWVudHMuZm9yRWFjaCgoe2tpbmQsIHBvcywgZW5kLCBoYXNUcmFpbGluZ05ld0xpbmV9LCBjb21tZW50SWR4KSA9PiB7XG4gICAgbGV0IGNvbW1lbnRUZXh0ID0gc291cmNlRmlsZS50ZXh0LnN1YnN0cmluZyhwb3MsIGVuZCkudHJpbSgpO1xuICAgIGlmIChraW5kID09PSB0cy5TeW50YXhLaW5kLk11bHRpTGluZUNvbW1lbnRUcml2aWEpIHtcbiAgICAgIGNvbW1lbnRUZXh0ID0gY29tbWVudFRleHQucmVwbGFjZSgvKF5cXC9cXCopfChcXCpcXC8kKS9nLCAnJyk7XG4gICAgfSBlbHNlIGlmIChraW5kID09PSB0cy5TeW50YXhLaW5kLlNpbmdsZUxpbmVDb21tZW50VHJpdmlhKSB7XG4gICAgICBpZiAoY29tbWVudFRleHQuc3RhcnRzV2l0aCgnLy8vJykpIHtcbiAgICAgICAgLy8gdHJpcGxlLXNsYXNoIGNvbW1lbnRzIGFyZSB0eXBlc2NyaXB0IHNwZWNpZmljLCBpZ25vcmUgdGhlbSBpbiB0aGUgb3V0cHV0LlxuICAgICAgICByZXR1cm47XG4gICAgICB9XG4gICAgICBjb21tZW50VGV4dCA9IGNvbW1lbnRUZXh0LnJlcGxhY2UoLyheXFwvXFwvKS9nLCAnJyk7XG4gICAgfVxuICAgIHN5bnRoZXNpemVkQ29tbWVudHMucHVzaCh7a2luZCwgdGV4dDogY29tbWVudFRleHQsIGhhc1RyYWlsaW5nTmV3TGluZSwgcG9zOiAtMSwgZW5kOiAtMX0pO1xuICB9KTtcbiAgcmV0dXJuIHN5bnRoZXNpemVkQ29tbWVudHM7XG59XG5cbi8qKlxuICogQ3JlYXRlcyBhIG5vbiBlbWl0dGVkIHN0YXRlbWVudCB0aGF0IGNhbiBiZSB1c2VkIHRvIHN0b3JlIHN5bnRoZXNpemVkIGNvbW1lbnRzLlxuICovXG5leHBvcnQgZnVuY3Rpb24gY3JlYXRlTm90RW1pdHRlZFN0YXRlbWVudChzb3VyY2VGaWxlOiB0cy5Tb3VyY2VGaWxlKTogdHMuTm90RW1pdHRlZFN0YXRlbWVudCB7XG4gIGNvbnN0IHN0bXQgPSB0cy5jcmVhdGVOb3RFbWl0dGVkU3RhdGVtZW50KHNvdXJjZUZpbGUpO1xuICB0cy5zZXRPcmlnaW5hbE5vZGUoc3RtdCwgdW5kZWZpbmVkKTtcbiAgdHMuc2V0VGV4dFJhbmdlKHN0bXQsIHtwb3M6IDAsIGVuZDogMH0pO1xuICB0cy5zZXRFbWl0RmxhZ3Moc3RtdCwgdHMuRW1pdEZsYWdzLkN1c3RvbVByb2xvZ3VlKTtcbiAgcmV0dXJuIHN0bXQ7XG59XG5cbi8qKlxuICogVGhpcyBpcyBhIHZlcnNpb24gb2YgYHRzLnZpc2l0RWFjaENoaWxkYCB0aGF0IHdvcmtzIHRoYXQgY2FsbHMgb3VyIHZlcnNpb25cbiAqIG9mIGB1cGRhdGVTb3VyY2VGaWxlTm9kZWAsIHNvIHRoYXQgdHlwZXNjcmlwdCBkb2Vzbid0IGxvc2UgdHlwZSBpbmZvcm1hdGlvblxuICogZm9yIHByb3BlcnR5IGRlY29yYXRvcnMuXG4gKiBTZWUgaHR0cHM6Ly9naXRodWIuY29tL01pY3Jvc29mdC9UeXBlU2NyaXB0L2lzc3Vlcy8xNzM4NFxuICpcbiAqIEBwYXJhbSBzZlxuICogQHBhcmFtIHN0YXRlbWVudHNcbiAqL1xuZXhwb3J0IGZ1bmN0aW9uIHZpc2l0RWFjaENoaWxkKFxuICAgIG5vZGU6IHRzLk5vZGUsIHZpc2l0b3I6IHRzLlZpc2l0b3IsIGNvbnRleHQ6IHRzLlRyYW5zZm9ybWF0aW9uQ29udGV4dCk6IHRzLk5vZGUge1xuICBpZiAobm9kZS5raW5kID09PSB0cy5TeW50YXhLaW5kLlNvdXJjZUZpbGUpIHtcbiAgICBjb25zdCBzZiA9IG5vZGUgYXMgdHMuU291cmNlRmlsZTtcbiAgICByZXR1cm4gdXBkYXRlU291cmNlRmlsZU5vZGUoc2YsIHRzLnZpc2l0TGV4aWNhbEVudmlyb25tZW50KHNmLnN0YXRlbWVudHMsIHZpc2l0b3IsIGNvbnRleHQpKTtcbiAgfVxuXG4gIHJldHVybiB0cy52aXNpdEVhY2hDaGlsZChub2RlLCB2aXNpdG9yLCBjb250ZXh0KTtcbn1cblxuLyoqXG4gKiBUaGlzIGlzIGEgdmVyc2lvbiBvZiBgdHMudXBkYXRlU291cmNlRmlsZU5vZGVgIHRoYXQgd29ya3NcbiAqIHdlbGwgd2l0aCBwcm9wZXJ0eSBkZWNvcmF0b3JzLlxuICogU2VlIGh0dHBzOi8vZ2l0aHViLmNvbS9NaWNyb3NvZnQvVHlwZVNjcmlwdC9pc3N1ZXMvMTczODRcbiAqIFRPRE8oIzYzNCk6IFRoaXMgaGFzIGJlZW4gZml4ZWQgaW4gVFMgMi41LiBJbnZlc3RpZ2F0ZSByZW1vdmFsLlxuICpcbiAqIEBwYXJhbSBzZlxuICogQHBhcmFtIHN0YXRlbWVudHNcbiAqL1xuZXhwb3J0IGZ1bmN0aW9uIHVwZGF0ZVNvdXJjZUZpbGVOb2RlKFxuICAgIHNmOiB0cy5Tb3VyY2VGaWxlLCBzdGF0ZW1lbnRzOiB0cy5Ob2RlQXJyYXk8dHMuU3RhdGVtZW50Pik6IHRzLlNvdXJjZUZpbGUge1xuICBpZiAoc3RhdGVtZW50cyA9PT0gc2Yuc3RhdGVtZW50cykge1xuICAgIHJldHVybiBzZjtcbiAgfVxuICAvLyBOb3RlOiBOZWVkIHRvIGNsb25lIHRoZSBvcmlnaW5hbCBmaWxlIChhbmQgbm90IHVzZSBgdHMudXBkYXRlU291cmNlRmlsZU5vZGVgKVxuICAvLyBhcyBvdGhlcndpc2UgVFMgZmFpbHMgd2hlbiByZXNvbHZpbmcgdHlwZXMgZm9yIGRlY29yYXRvcnMuXG4gIHNmID0gdHMuZ2V0TXV0YWJsZUNsb25lKHNmKTtcbiAgc2Yuc3RhdGVtZW50cyA9IHN0YXRlbWVudHM7XG4gIHJldHVybiBzZjtcbn1cblxuLy8gQ29waWVkIGZyb20gVHlwZVNjcmlwdFxuZXhwb3J0IGZ1bmN0aW9uIGlzVHlwZU5vZGVLaW5kKGtpbmQ6IHRzLlN5bnRheEtpbmQpIHtcbiAgcmV0dXJuIChraW5kID49IHRzLlN5bnRheEtpbmQuRmlyc3RUeXBlTm9kZSAmJiBraW5kIDw9IHRzLlN5bnRheEtpbmQuTGFzdFR5cGVOb2RlKSB8fFxuICAgICAga2luZCA9PT0gdHMuU3ludGF4S2luZC5BbnlLZXl3b3JkIHx8IGtpbmQgPT09IHRzLlN5bnRheEtpbmQuTnVtYmVyS2V5d29yZCB8fFxuICAgICAga2luZCA9PT0gdHMuU3ludGF4S2luZC5PYmplY3RLZXl3b3JkIHx8IGtpbmQgPT09IHRzLlN5bnRheEtpbmQuQm9vbGVhbktleXdvcmQgfHxcbiAgICAgIGtpbmQgPT09IHRzLlN5bnRheEtpbmQuU3RyaW5nS2V5d29yZCB8fCBraW5kID09PSB0cy5TeW50YXhLaW5kLlN5bWJvbEtleXdvcmQgfHxcbiAgICAgIGtpbmQgPT09IHRzLlN5bnRheEtpbmQuVGhpc0tleXdvcmQgfHwga2luZCA9PT0gdHMuU3ludGF4S2luZC5Wb2lkS2V5d29yZCB8fFxuICAgICAga2luZCA9PT0gdHMuU3ludGF4S2luZC5VbmRlZmluZWRLZXl3b3JkIHx8IGtpbmQgPT09IHRzLlN5bnRheEtpbmQuTnVsbEtleXdvcmQgfHxcbiAgICAgIGtpbmQgPT09IHRzLlN5bnRheEtpbmQuTmV2ZXJLZXl3b3JkIHx8IGtpbmQgPT09IHRzLlN5bnRheEtpbmQuRXhwcmVzc2lvbldpdGhUeXBlQXJndW1lbnRzO1xufVxuXG4vKipcbiAqIENyZWF0ZXMgYSBzdHJpbmcgbGl0ZXJhbCB0aGF0IHVzZXMgc2luZ2xlIHF1b3Rlcy4gUHVyZWx5IGNvc21ldGljLCBidXQgaW5jcmVhc2VzIGZpZGVsaXR5IHRvIHRoZVxuICogZXhpc3RpbmcgdGVzdCBzdWl0ZS5cbiAqL1xuZXhwb3J0IGZ1bmN0aW9uIGNyZWF0ZVNpbmdsZVF1b3RlU3RyaW5nTGl0ZXJhbCh0ZXh0OiBzdHJpbmcpOiB0cy5TdHJpbmdMaXRlcmFsIHtcbiAgY29uc3Qgc3RyaW5nTGl0ZXJhbCA9IHRzLmNyZWF0ZUxpdGVyYWwodGV4dCk7XG4gIC8vIHRzbGludDpkaXNhYmxlLW5leHQtbGluZTpuby1hbnkgYWNjZXNzaW5nIFRTIGludGVybmFsIEFQSS5cbiAgKHN0cmluZ0xpdGVyYWwgYXMgYW55KS5zaW5nbGVRdW90ZSA9IHRydWU7XG4gIHJldHVybiBzdHJpbmdMaXRlcmFsO1xufVxuXG4vKiogQ3JlYXRlcyBhIG5vdCBlbWl0dGVkIHN0YXRlbWVudCB3aXRoIHRoZSBnaXZlbiB0ZXh0IGFzIGEgc2luZ2xlIGxpbmUgY29tbWVudC4gKi9cbmV4cG9ydCBmdW5jdGlvbiBjcmVhdGVTaW5nbGVMaW5lQ29tbWVudChvcmlnaW5hbDogdHMuTm9kZSwgdGV4dDogc3RyaW5nKSB7XG4gIGNvbnN0IGNvbW1lbnQ6IHRzLlN5bnRoZXNpemVkQ29tbWVudCA9IHtcbiAgICBraW5kOiB0cy5TeW50YXhLaW5kLlNpbmdsZUxpbmVDb21tZW50VHJpdmlhLFxuICAgIHRleHQ6ICcgJyArIHRleHQsXG4gICAgaGFzVHJhaWxpbmdOZXdMaW5lOiB0cnVlLFxuICAgIHBvczogLTEsXG4gICAgZW5kOiAtMSxcbiAgfTtcbiAgcmV0dXJuIHRzLnNldFN5bnRoZXRpY1RyYWlsaW5nQ29tbWVudHModHMuY3JlYXRlTm90RW1pdHRlZFN0YXRlbWVudChvcmlnaW5hbCksIFtjb21tZW50XSk7XG59XG5cbi8qKiBDcmVhdGVzIGEgbm90IGVtaXR0ZWQgc3RhdGVtZW50IHdpdGggdGhlIGdpdmVuIHRleHQgYXMgYSBzaW5nbGUgbGluZSBjb21tZW50LiAqL1xuZXhwb3J0IGZ1bmN0aW9uIGNyZWF0ZU11bHRpTGluZUNvbW1lbnQob3JpZ2luYWw6IHRzLk5vZGUsIHRleHQ6IHN0cmluZykge1xuICBjb25zdCBjb21tZW50OiB0cy5TeW50aGVzaXplZENvbW1lbnQgPSB7XG4gICAga2luZDogdHMuU3ludGF4S2luZC5NdWx0aUxpbmVDb21tZW50VHJpdmlhLFxuICAgIHRleHQ6ICcgJyArIHRleHQsXG4gICAgaGFzVHJhaWxpbmdOZXdMaW5lOiB0cnVlLFxuICAgIHBvczogLTEsXG4gICAgZW5kOiAtMSxcbiAgfTtcbiAgcmV0dXJuIHRzLnNldFN5bnRoZXRpY1RyYWlsaW5nQ29tbWVudHModHMuY3JlYXRlTm90RW1pdHRlZFN0YXRlbWVudChvcmlnaW5hbCksIFtjb21tZW50XSk7XG59XG5cbi8qKlxuICogZGVidWdXYXJuIGxvZ3MgYSBkZWJ1ZyB3YXJuaW5nLlxuICpcbiAqIFRoZXNlIHNob3VsZCBvbmx5IGJlIHVzZWQgZm9yIGNhc2VzIHdoZXJlIHRzaWNrbGUgaXMgbWFraW5nIGEgcXVlc3Rpb25hYmxlIGp1ZGdlbWVudCBhYm91dCB3aGF0XG4gKiB0byBkby4gQnkgZGVmYXVsdCwgdHNpY2tsZSBkb2VzIG5vdCByZXBvcnQgYW55IHdhcm5pbmdzIHRvIHRoZSBjYWxsZXIsIGFuZCB3YXJuaW5ncyBhcmUgaGlkZGVuXG4gKiBiZWhpbmQgYSBkZWJ1ZyBmbGFnLCBhcyB3YXJuaW5ncyBhcmUgb25seSBmb3IgdHNpY2tsZSB0byBkZWJ1ZyBpdHNlbGYuXG4gKi9cbmV4cG9ydCBmdW5jdGlvbiByZXBvcnREZWJ1Z1dhcm5pbmcoXG4gICAgaG9zdDoge2xvZ1dhcm5pbmcgPyAoZDogdHMuRGlhZ25vc3RpYykgOiB2b2lkfSwgbm9kZTogdHMuTm9kZSwgbWVzc2FnZVRleHQ6IHN0cmluZykge1xuICBpZiAoIWhvc3QubG9nV2FybmluZykgcmV0dXJuO1xuICBob3N0LmxvZ1dhcm5pbmcoY3JlYXRlRGlhZ25vc3RpYyhcbiAgICAgIG5vZGUsIG1lc3NhZ2VUZXh0LCAvKiB0ZXh0UmFuZ2UgKi8gdW5kZWZpbmVkLCB0cy5EaWFnbm9zdGljQ2F0ZWdvcnkuV2FybmluZykpO1xufVxuXG4vKipcbiAqIENyZWF0ZXMgYW5kIHJlcG9ydHMgYSBkaWFnbm9zdGljIGJ5IGFkZGluZyBpdCB0byB0aGUgZ2l2ZW4gYXJyYXkuXG4gKlxuICogVGhpcyBpcyB1c2VkIGZvciBlcnJvcnMgYW5kIHdhcm5pbmdzIGluIHRzaWNrbGUncyBpbnB1dC4gRW1pdCBlcnJvcnMgKHRoZSBkZWZhdWx0KSBpZiB0c2lja2xlXG4gKiBjYW5ub3QgZW1pdCBhIGNvcnJlY3QgcmVzdWx0IGdpdmVuIHRoZSBpbnB1dC4gRW1pdCB3YXJuaW5ncyBmb3IgcXVlc3Rpb25hYmxlIGlucHV0IGlmIHRoZXJlJ3MgYVxuICogZ29vZCBjaGFuY2UgdGhhdCB0aGUgb3V0cHV0IHdpbGwgd29yay5cbiAqXG4gKiBGb3IgdHlwaWNhbCB0c2lja2xlIHVzZXJzLCBlcnJvcnMgYXJlIGFsd2F5cyByZXBvcnRlZCBhbmQgYnJlYWsgdGhlIGNvbXBpbGF0aW9uIG9wZXJhdGlvbixcbiAqIHdhcm5pbmdzIHdpbGwgb25seSBiZSBlbWl0dGVkIGZvciBmaXJzdCBwYXJ0eSBjb2RlIChhbmQgYnJlYWsgdGhlIGNvbXBpbGF0aW9uIHRoZXJlKSwgYnV0IHdpbCBiZVxuICogaWdub3JlZCBmb3IgdGhpcmQgcGFydHkgY29kZS5cbiAqXG4gKiBAcGFyYW0gdGV4dFJhbmdlIHBhc3MgdG8gb3ZlcnJyaWRlIHRoZSB0ZXh0IHJhbmdlIGZyb20gdGhlIG5vZGUgd2l0aCBhIG1vcmUgc3BlY2lmaWMgcmFuZ2UuXG4gKi9cbmV4cG9ydCBmdW5jdGlvbiByZXBvcnREaWFnbm9zdGljKFxuICAgIGRpYWdub3N0aWNzOiB0cy5EaWFnbm9zdGljW10sIG5vZGU6IHRzLk5vZGUsIG1lc3NhZ2VUZXh0OiBzdHJpbmcsIHRleHRSYW5nZT86IHRzLlRleHRSYW5nZSxcbiAgICBjYXRlZ29yeSA9IHRzLkRpYWdub3N0aWNDYXRlZ29yeS5FcnJvcikge1xuICBkaWFnbm9zdGljcy5wdXNoKGNyZWF0ZURpYWdub3N0aWMobm9kZSwgbWVzc2FnZVRleHQsIHRleHRSYW5nZSwgY2F0ZWdvcnkpKTtcbn1cblxuZnVuY3Rpb24gY3JlYXRlRGlhZ25vc3RpYyhcbiAgICBub2RlOiB0cy5Ob2RlLCBtZXNzYWdlVGV4dDogc3RyaW5nLCB0ZXh0UmFuZ2U6IHRzLlRleHRSYW5nZXx1bmRlZmluZWQsXG4gICAgY2F0ZWdvcnk6IHRzLkRpYWdub3N0aWNDYXRlZ29yeSk6IHRzLkRpYWdub3N0aWMge1xuICBsZXQgc3RhcnQsIGxlbmd0aDogbnVtYmVyO1xuICBpZiAodGV4dFJhbmdlKSB7XG4gICAgc3RhcnQgPSB0ZXh0UmFuZ2UucG9zO1xuICAgIGxlbmd0aCA9IHRleHRSYW5nZS5lbmQgLSB0ZXh0UmFuZ2UucG9zO1xuICB9IGVsc2Uge1xuICAgIC8vIE9ubHkgdXNlIGdldFN0YXJ0IGlmIG5vZGUgaGFzIGEgdmFsaWQgcG9zLCBhcyBpdCBtaWdodCBiZSBzeW50aGVzaXplZC5cbiAgICBzdGFydCA9IG5vZGUucG9zID49IDAgPyBub2RlLmdldFN0YXJ0KCkgOiAwO1xuICAgIGxlbmd0aCA9IG5vZGUuZW5kIC0gbm9kZS5wb3M7XG4gIH1cbiAgcmV0dXJuIHtcbiAgICBmaWxlOiBub2RlLmdldFNvdXJjZUZpbGUoKSxcbiAgICBzdGFydCxcbiAgICBsZW5ndGgsXG4gICAgbWVzc2FnZVRleHQsXG4gICAgY2F0ZWdvcnksXG4gICAgY29kZTogMCxcbiAgfTtcbn1cblxuLyoqXG4gKiBBIHJlcGxhY2VtZW50IGZvciB0cy5nZXRMZWFkaW5nQ29tbWVudFJhbmdlcyB0aGF0IHJldHVybnMgdGhlIHVuaW9uIG9mIHN5bnRoZXRpYyBhbmRcbiAqIG5vbi1zeW50aGV0aWMgY29tbWVudHMgb24gdGhlIGdpdmVuIG5vZGUsIHdpdGggdGhlaXIgdGV4dCBpbmNsdWRlZC4gVGhlIHJldHVybmVkIGNvbW1lbnRzIG11c3RcbiAqIG5vdCBiZSBtdXRhdGVkLCBhcyB0aGVpciBjb250ZW50IG1pZ2h0IG9yIG1pZ2h0IG5vdCBiZSByZWZsZWN0ZWQgYmFjayBpbnRvIHRoZSBBU1QuXG4gKi9cbmV4cG9ydCBmdW5jdGlvbiBnZXRBbGxMZWFkaW5nQ29tbWVudHMobm9kZTogdHMuTm9kZSk6XG4gICAgUmVhZG9ubHlBcnJheTxSZWFkb25seTx0cy5Db21tZW50UmFuZ2Ume3RleHQ6IHN0cmluZ30+PiB7XG4gIGNvbnN0IGFsbFJhbmdlczogQXJyYXk8UmVhZG9ubHk8dHMuQ29tbWVudFJhbmdlJnt0ZXh0OiBzdHJpbmd9Pj4gPSBbXTtcbiAgY29uc3Qgbm9kZVRleHQgPSBub2RlLmdldEZ1bGxUZXh0KCk7XG4gIGNvbnN0IGNyID0gdHMuZ2V0TGVhZGluZ0NvbW1lbnRSYW5nZXMobm9kZVRleHQsIDApO1xuICBpZiAoY3IpIGFsbFJhbmdlcy5wdXNoKC4uLmNyLm1hcChjID0+ICh7Li4uYywgdGV4dDogbm9kZVRleHQuc3Vic3RyaW5nKGMucG9zLCBjLmVuZCl9KSkpO1xuICBjb25zdCBzeW50aGV0aWMgPSB0cy5nZXRTeW50aGV0aWNMZWFkaW5nQ29tbWVudHMobm9kZSk7XG4gIGlmIChzeW50aGV0aWMpIGFsbFJhbmdlcy5wdXNoKC4uLnN5bnRoZXRpYyk7XG4gIHJldHVybiBhbGxSYW5nZXM7XG59XG4iXX0=