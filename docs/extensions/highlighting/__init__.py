import sys, os, pygments

from sphinx.highlighting import lexers
from lex.mechanoid import MechDBLexer
from styles.eclipse import EclipseStyle

def setup(app):
    lexers['mechdb'] = MechDBLexer()