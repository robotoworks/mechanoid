import sys, os, pygments

from sphinx.highlighting import lexers
from lex.mechanoid import MechDBLexer, MechNetLexer, MechOpsLexer, MechPrefsLexer
from styles.eclipse import EclipseStyle

def setup(app):
    lexers['mechdb'] = MechDBLexer()
    lexers['mechnet'] = MechNetLexer()
    lexers['mechops'] = MechOpsLexer()
    lexers['mechprefs'] = MechPrefsLexer()