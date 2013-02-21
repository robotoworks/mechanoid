from pygments.style import Style
from pygments.token import Keyword, Name, Comment, String, Error, \
     Number, Operator, Generic

class EclipseStyle(Style):
    default_style = ""
    styles = {
        Comment:                'italic #888',
        Keyword:                'bold #f00',
        Name:                   '#f00',
        Name.Function:          '#0f0',
        Name.Class:             'bold #0f0',
        String:                 'bg:#eee #111'
    }