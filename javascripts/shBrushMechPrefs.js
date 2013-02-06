
// CommonJS

typeof(require) != 'undefined' ? SyntaxHighlighter = require('shCore').SyntaxHighlighter : null;

// Contributed by Travis Whitton
// http://travis-whitton.blogspot.com/2009/06/syntaxhighlighter-for-clojure.html

SyntaxHighlighter.brushes.MechPrefs = function()
{
	var keywords = 'package preferences boolean String float int long';

	this.regexList = [
			{ regex: SyntaxHighlighter.regexLib.singleLineCComments,    		css: 'comments' },
			{ regex: new RegExp('\\(\\*[\\s\\S]*?\\*\\)', 'gm'),   				css: 'comments' },
			{ regex: SyntaxHighlighter.regexLib.multiLineDoubleQuotedString, 	css: 'string' },
			{ regex: new RegExp(this.getKeywords(keywords), 'gmi'),            	css: 'keyword' },
	];
}

SyntaxHighlighter.brushes.MechPrefs.prototype     = new SyntaxHighlighter.Highlighter();
SyntaxHighlighter.brushes.MechPrefs.aliases       = ['mechprefs'];