from pygments.lexer import RegexLexer, include, bygroups
from pygments.token import Keyword, Text, Comment, Name, String, Number, \
                           Punctuation, Operator
                       
__all__ = ['MechDBLexer']

class MechDBLexer(RegexLexer):
    name = 'MechDB'
    aliases = ['mechdb']
    filenames = ['*.mechdb']
    mimetypes = ['text/mechdb']
    
    tokens = {
        'root': [
            (r'[^\S\n]+', Text),
            (r'//.*?\n', Comment.Single),
            (r'/\*.*?\*/', Comment.Multiline),
            (r'(text|integer|real|blob|none|boolean|numeric)', 
             Keyword),
            (r'(database|config|action|migration|is|not|in|like|glob|match|' 
             r'regexp|and|or|null|new|old|exists|case|else|end|cast|as|when|'
             r'order|by|select|distinct|all|from|where|group|by|having|union|'
             r'all|intersect|except|asc|desc|natural|left|outer|inner|cross|'
             r'join|on|current_time|current_date|current_time_stamp|create|' 
             r'table|view|trigger|before|after|instead|of|for|each|row|when|' 
             r'begin|alter|if|primary|key|autoincrement|default|constraint|' 
             r'unique|check|conflict|delete|insert|replace|into|values|set|'
             r'rollback|abort|fail|ignore|replace|package|drop)\b', 
             Keyword),
            (r'"(\\\\|\\"|[^"])*"', String),
            (r"'(\\\\|\\'|[^'])*'", String),
            (r'[a-zA-Z_\$][a-zA-Z0-9_]*', Name),
            (r'[~\^\*!%&\[\]\(\)\{\}<>\|+=:;,./?-]', Operator),
            (r'[0-9][0-9]*\.[0-9]+([eE][0-9]+)?[fd]?', Number.Float),
            (r'0x[0-9a-fA-F]+', Number.Hex),
            (r'[0-9]+L?', Number.Integer),
        ]
    }