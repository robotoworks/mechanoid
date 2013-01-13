typeof(require) != 'undefined' ? SyntaxHighlighter = require('shCore').SyntaxHighlighter : null;

SyntaxHighlighter.brushes.MechNet = function()
{
	var keywords = 'package client post put get delete params ' +
				   'body response extends skip entity generate enum ' +
				   'String boolean Date int long float double headers';

	this.regexList = [
			{ regex: SyntaxHighlighter.regexLib.singleLineCComments,    		css: 'comments' },
			{ regex: new RegExp('\\(\\*[\\s\\S]*?\\*\\)', 'gm'),   				css: 'comments' },
			{ regex: SyntaxHighlighter.regexLib.multiLineDoubleQuotedString, 	css: 'string' },
			{ regex: new RegExp(this.getKeywords(keywords), 'gmi'),            	css: 'keyword' },
	];
}

SyntaxHighlighter.brushes.MechNet.prototype     = new SyntaxHighlighter.Highlighter();
SyntaxHighlighter.brushes.MechNet.aliases       = ['mechnet'];