from pygments.lexer import RegexLexer, include, bygroups
from pygments.token import Keyword, Text, Comment, Name, String, Number, \
                           Punctuation, Operator
                       
__all__ = ['MechDBLexer']

class MechDBLexer(RegexLexer):
    name = 'Mechanoid DB'
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
             r'rollback|abort|fail|ignore|replace|package|drop|add|column|' 
             r'rename|to|init|temp)\b', 
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
    
class MechNetLexer(RegexLexer):
    name = 'Mechanoid Net'
    aliases = ['mechnet']
    filenames = ['*.mechnet']
    mimetypes = ['text/mechnet']
    
    tokens = {
        'root': [
            (r'[^\S\n]+', Text),
            (r'//.*?\n', Comment.Single),
            (r'/\*.*?\*/', Comment.Multiline),
            (r'(package|client|headers|params|body|response|extends|entity|generate|'
             r'enum|String|boolean|int|long|double|get|put|post|delete|patch)\b', 
             Keyword),
            (r'"(\\\\|\\"|[^"])*"', String),
            (r"'(\\\\|\\'|[^'])*'", String),
            (r'/[^\{]+', String),
            (r'[a-zA-Z_\$][a-zA-Z0-9_]*', Name),
            (r'[~\^\*!%&\[\]\(\)\{\}<>\|+=:;,./?-]', Operator),
            (r'[0-9][0-9]*\.[0-9]+([eE][0-9]+)?[fd]?', Number.Float),
            (r'0x[0-9a-fA-F]+', Number.Hex),
            (r'[0-9]+L?', Number.Integer),
        ]
    }
    
class MechOpsLexer(RegexLexer):
    name = 'Mechanoid Ops'
    aliases = ['mechops']
    filenames = ['*.mechops']
    mimetypes = ['text/mechops']
    
    tokens = {
        'root': [
            (r'[^\S\n]+', Text),
            (r'//.*?\n', Comment.Single),
            (r'/\*.*?\*/', Comment.Multiline),
            (r'(package|service|operation|not|unique|boolean|String|int|float|long|Parcelable|PendingIntent)\b', 
             Keyword),
            (r'"(\\\\|\\"|[^"])*"', String),
            (r"'(\\\\|\\'|[^'])*'", String),
            (r'/[^\{]+', String),
            (r'[a-zA-Z_\$][a-zA-Z0-9_]*', Name),
            (r'[~\^\*!%&\[\]\(\)\{\}<>\|+=:;,./?-]', Operator),
            (r'[0-9][0-9]*\.[0-9]+([eE][0-9]+)?[fd]?', Number.Float),
            (r'0x[0-9a-fA-F]+', Number.Hex),
            (r'[0-9]+L?', Number.Integer),
        ]
    }
    
class MechPrefsLexer(RegexLexer):
    name = 'Mechanoid Prefs'
    aliases = ['mechprefs']
    filenames = ['*.mechprefs']
    mimetypes = ['text/mechprefs']
    
    tokens = {
        'root': [
            (r'[^\S\n]+', Text),
            (r'//.*?\n', Comment.Single),
            (r'/\*.*?\*/', Comment.Multiline),
            (r'(package|preferences|long|String|int|float|boolean|true|false)\b', 
             Keyword),
            (r'"(\\\\|\\"|[^"])*"', String),
            (r"'(\\\\|\\'|[^'])*'", String),
            (r'/[^\{]+', String),
            (r'[a-zA-Z_\$][a-zA-Z0-9_]*', Name),
            (r'[~\^\*!%&\[\]\(\)\{\}<>\|+=:;,./?-]', Operator),
            (r'[0-9][0-9]*\.[0-9]+([eE][0-9]+)?[fd]?', Number.Float),
            (r'0x[0-9a-fA-F]+', Number.Hex),
            (r'[0-9]+L?', Number.Integer),
        ]
    }