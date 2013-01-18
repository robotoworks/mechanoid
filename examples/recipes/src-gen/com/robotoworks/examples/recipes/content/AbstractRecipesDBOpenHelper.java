/*
 * Generated by Robotoworks Mechanoid
 */
package com.robotoworks.examples.recipes.content;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.robotoworks.mechanoid.sqlite.MechanoidSQLiteOpenHelper;
import com.robotoworks.mechanoid.sqlite.SQLiteMigration;

import com.robotoworks.examples.recipes.content.migrations.RecipesDBMigrationV2;

public abstract class AbstractRecipesDBOpenHelper extends MechanoidSQLiteOpenHelper {
	public static final String DATABASE_NAME = "RecipesDB.db";

	public static final int VERSION = 2;

	public interface Tables {
		String RECIPES = "recipes";
		String AUTHORS = "authors";
		String RECIPES_WITH_AUTHORS = "recipes_with_authors";
	}

	public AbstractRecipesDBOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(
			"create table recipes ( " +
			"_id integer primary key autoincrement , " +
			"title text , " +
			"description text , " +
			"author_id integer " +
			") "
		);
		db.execSQL(
			"create table authors ( " +
			"_id integer primary key autoincrement , " +
			"name text " +
			") "
		);
		db.execSQL(
			"create view recipes_with_authors as " +
			"select " +
			"r._id as _id , " +
			"r.title as recipe_title , " +
			"r.description as recipe_description , " +
			"r.author_id as author_id , " +
			"a.name as author_name " +
			"from recipes as r " +
			"left join authors as a on r.author_id = a._id "
		);
		
	}

	@Override
	protected SQLiteMigration createMigration(int version) {
		switch(version) {
			case 2:
				return new RecipesDBMigrationV2();
			default:
				throw new IllegalStateException("No migration for version " + version);
		}
	}
}
