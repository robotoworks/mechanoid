<?php
	/*
	Plugin Name: SyntaxHighlighter Evolved: Mechanoid
	Plugin URI: http://www.robotoworks.com/
	Description: Adds support for Mechanoid DSL's
	Author: Ian Warwick
	Version: 0.0.1
	Author URI: http://www.robotoworks.com/
	License: ?
	*/
	
	// SyntaxHighlighter Evolved doesn't do anything until early in the "init" hook, so best to wait until after that
	add_action( 'init', 'syntaxhighlighter_mechanoid_regscript' );
	
	// Tell SyntaxHighlighter Evolved about this new language/brush
	add_filter( 'syntaxhighlighter_brushes', 'syntaxhighlighter_mechanoid_addlang' );
	
	// Register the brush file with WordPress
	function syntaxhighlighter_mechanoid_regscript() {
		wp_register_script( 'syntaxhighlighter-brush-mechprefs', plugins_url('shBrushMechPrefs.js', __FILE__ ), array('syntaxhighlighter-core'), '1.2.3');
		wp_register_script( 'syntaxhighlighter-brush-mechnet', plugins_url('shBrushMechNet.js', __FILE__ ), array('syntaxhighlighter-core'), '1.2.3');
		wp_register_script( 'syntaxhighlighter-brush-mechops', plugins_url('shBrushMechOps.js', __FILE__ ), array('syntaxhighlighter-core'), '1.2.3');
		wp_register_script( 'syntaxhighlighter-brush-mechdb', plugins_url('shBrushMechDb.js', __FILE__ ), array('syntaxhighlighter-core'), '1.2.3');
	}
	
	// Filter SyntaxHighlighter Evolved's language array
	function syntaxhighlighter_mechanoid_addlang( $brushes ) {
		$brushes['mechprefs'] = 'mechprefs';
		$brushes['mechnet'] = 'mechnet';
		$brushes['mechops'] = 'mechops';
		$brushes['mechdb'] = 'mechdb';
		return $brushes;
	}
?>