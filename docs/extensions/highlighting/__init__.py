import sys, os, pygments

from sphinx.highlighting import lexers
from lex.mechanoid import MechDBLexer
from lex.mechanoid import MechNetLexer
from lex.mechanoid import MechOpsLexer
from styles.eclipse import EclipseStyle

def setup(app):
    lexers['mechdb'] = MechDBLexer()
    lexers['mechnet'] = MechNetLexer()
    lexers['mechops'] = MechOpsLexer()