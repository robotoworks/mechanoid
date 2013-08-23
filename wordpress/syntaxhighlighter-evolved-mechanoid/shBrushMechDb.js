
// CommonJS

typeof(require) != 'undefined' ? SyntaxHighlighter = require('shCore').SyntaxHighlighter : null;

// Contributed by Travis Whitton
// http://travis-whitton.blogspot.com/2009/06/syntaxhighlighter-for-clojure.html

SyntaxHighlighter.brushes.MechDb = function()
{
	var keywords = 'package database config migration actions or and is not in like ' +
                   'glob match regexp create table alter view rename to add column ' +
                   'primary key asc desc autoincrement not null default ' +
                   'unique select distinct all from as left outer join cross inner ' +
                   'natural on conflict null current_time current_data current_time_stamp ' +
                   'text integer real blob rollback abort fail ignore replace union all new. old. ' +
                   'exists case else end cast order by intersect except asc desc if check ' +
                   'update delete where default values set init temp';

	this.regexList = [
			{ regex: SyntaxHighlighter.regexLib.singleLineCComments,    		css: 'comments' },
			{ regex: new RegExp('\\(\\*[\\s\\S]*?\\*\\)', 'gm'),   				css: 'comments' },
			{ regex: SyntaxHighlighter.regexLib.multiLineDoubleQuotedString, 	css: 'string' },
			{ regex: new RegExp(this.getKeywords(keywords), 'gmi'),            	css: 'keyword' },
	];
}

SyntaxHighlighter.brushes.MechDb.prototype     = new SyntaxHighlighter.Highlighter();
SyntaxHighlighter.brushes.MechDb.aliases       = ['mechdb'];