package com.robotoworks.mechanoid.sqlite.generator;

import com.google.common.base.Objects;
import com.robotoworks.mechanoid.common.util.Strings;
import com.robotoworks.mechanoid.sqlite.generator.Extensions;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnDef;
import com.robotoworks.mechanoid.sqlite.sqliteModel.ColumnType;
import com.robotoworks.mechanoid.sqlite.sqliteModel.CreateTableStatement;
import com.robotoworks.mechanoid.sqlite.sqliteModel.DatabaseBlock;
import com.robotoworks.mechanoid.sqlite.sqliteModel.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ActiveRecordGenerator {
  public CharSequence generate(final Model model, final CreateTableStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Generated by Robotoworks Mechanoid");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package ");
    String _packageName = model.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import android.content.ContentResolver;");
    _builder.newLine();
    _builder.append("import android.content.ContentUris;");
    _builder.newLine();
    _builder.append("import android.database.Cursor;");
    _builder.newLine();
    _builder.append("import android.net.Uri;");
    _builder.newLine();
    _builder.append("import android.os.Parcel;");
    _builder.newLine();
    _builder.append("import android.os.Parcelable;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _packageName_1 = model.getPackageName();
    _builder.append(_packageName_1, "");
    _builder.append(".");
    DatabaseBlock _database = model.getDatabase();
    String _name = _database.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("Contract.");
    String _name_1 = stmt.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    _builder.append(_pascalize_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    String _packageName_2 = model.getPackageName();
    _builder.append(_packageName_2, "");
    _builder.append(".");
    DatabaseBlock _database_1 = model.getDatabase();
    String _name_2 = _database_1.getName();
    String _pascalize_2 = Strings.pascalize(_name_2);
    _builder.append(_pascalize_2, "");
    _builder.append("Contract.");
    String _name_3 = stmt.getName();
    String _pascalize_3 = Strings.pascalize(_name_3);
    _builder.append(_pascalize_3, "");
    _builder.append(".Builder;");
    _builder.newLineIfNotEmpty();
    _builder.append("import com.robotoworks.mechanoid.sqlite.SQuery;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.util.Closeables;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.sqlite.ActiveRecord;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("public class ");
    String _name_4 = stmt.getName();
    String _pascalize_4 = Strings.pascalize(_name_4);
    _builder.append(_pascalize_4, "");
    _builder.append("Record extends ActiveRecord implements Parcelable {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public static final Parcelable.Creator<");
    String _name_5 = stmt.getName();
    String _pascalize_5 = Strings.pascalize(_name_5);
    _builder.append(_pascalize_5, "    ");
    _builder.append("Record> CREATOR ");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t");
    _builder.append("= new Parcelable.Creator<");
    String _name_6 = stmt.getName();
    String _pascalize_6 = Strings.pascalize(_name_6);
    _builder.append(_pascalize_6, "    	");
    _builder.append("Record>() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("public ");
    String _name_7 = stmt.getName();
    String _pascalize_7 = Strings.pascalize(_name_7);
    _builder.append(_pascalize_7, "        ");
    _builder.append("Record createFromParcel(Parcel in) {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return new ");
    String _name_8 = stmt.getName();
    String _pascalize_8 = Strings.pascalize(_name_8);
    _builder.append(_pascalize_8, "            ");
    _builder.append("Record(in);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("public ");
    String _name_9 = stmt.getName();
    String _pascalize_9 = Strings.pascalize(_name_9);
    _builder.append(_pascalize_9, "        ");
    _builder.append("Record[] newArray(int size) {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return new ");
    String _name_10 = stmt.getName();
    String _pascalize_10 = Strings.pascalize(_name_10);
    _builder.append(_pascalize_10, "            ");
    _builder.append("Record[size];");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static String[] PROJECTION = {");
    _builder.newLine();
    _builder.append("    \t");
    CharSequence _generateProjectionArrayMembers = this.generateProjectionArrayMembers(stmt);
    _builder.append(_generateProjectionArrayMembers, "    	");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public interface Indices {");
    _builder.newLine();
    _builder.append("    \t");
    CharSequence _generateProjectionIndicesMembers = this.generateProjectionIndicesMembers(stmt);
    _builder.append(_generateProjectionIndicesMembers, "    	");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateFields = this.generateFields(stmt);
    _builder.append(_generateFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generateAccessors = this.generateAccessors(stmt);
    _builder.append(_generateAccessors, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _name_11 = stmt.getName();
    String _pascalize_11 = Strings.pascalize(_name_11);
    _builder.append(_pascalize_11, "    ");
    _builder.append("Record() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    String _name_12 = stmt.getName();
    String _pascalize_12 = Strings.pascalize(_name_12);
    _builder.append(_pascalize_12, "	");
    _builder.append("Record(Parcel in) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    int counter = (-1);
    _builder.newLineIfNotEmpty();
    {
      EList<ColumnDef> _columnDefs = stmt.getColumnDefs();
      for(final ColumnDef col : _columnDefs) {
        {
          ColumnType _type = col.getType();
          boolean _equals = Objects.equal(_type, ColumnType.BOOLEAN);
          if (_equals) {
            _builder.append("\t\t");
            _builder.append("m");
            String _name_13 = col.getName();
            String _pascalize_13 = Strings.pascalize(_name_13);
            _builder.append(_pascalize_13, "		");
            _builder.append(" = (in.readInt() > 0);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("m");
            String _name_14 = col.getName();
            String _pascalize_14 = Strings.pascalize(_name_14);
            _builder.append(_pascalize_14, "		");
            _builder.append(" = in.read");
            ColumnType _type_1 = col.getType();
            String _javaTypeName = Extensions.toJavaTypeName(_type_1);
            String _pascalize_15 = Strings.pascalize(_javaTypeName);
            _builder.append(_pascalize_15, "		");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("boolean[] dirtyFlags = new boolean[");
    EList<ColumnDef> _columnDefs_1 = stmt.getColumnDefs();
    int _size = _columnDefs_1.size();
    _builder.append(_size, "		");
    _builder.append("];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("in.readBooleanArray(dirtyFlags);");
    _builder.newLine();
    {
      EList<ColumnDef> _columnDefs_2 = stmt.getColumnDefs();
      for(final ColumnDef col_1 : _columnDefs_2) {
        _builder.append("\t\t");
        _builder.append("m");
        String _name_15 = col_1.getName();
        String _pascalize_16 = Strings.pascalize(_name_15);
        _builder.append(_pascalize_16, "		");
        _builder.append("Dirty = dirtyFlags[");
        int _plus = (counter + 1);
        int _counter = counter = _plus;
        _builder.append(_counter, "		");
        _builder.append("];");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int describeContents() {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void writeToParcel(Parcel dest, int flags) {");
    _builder.newLine();
    {
      EList<ColumnDef> _columnDefs_3 = stmt.getColumnDefs();
      for(final ColumnDef col_2 : _columnDefs_3) {
        {
          ColumnType _type_2 = col_2.getType();
          boolean _equals_1 = Objects.equal(_type_2, ColumnType.BOOLEAN);
          if (_equals_1) {
            _builder.append("\t\t");
            _builder.append("dest.writeInt(m");
            String _name_16 = col_2.getName();
            String _pascalize_17 = Strings.pascalize(_name_16);
            _builder.append(_pascalize_17, "		");
            _builder.append(" ? 1 : 0);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("dest.write");
            ColumnType _type_3 = col_2.getType();
            String _javaTypeName_1 = Extensions.toJavaTypeName(_type_3);
            String _pascalize_18 = Strings.pascalize(_javaTypeName_1);
            _builder.append(_pascalize_18, "		");
            _builder.append("(m");
            String _name_17 = col_2.getName();
            String _pascalize_19 = Strings.pascalize(_name_17);
            _builder.append(_pascalize_19, "		");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t    ");
    _builder.append("dest.writeBooleanArray(new boolean[] {");
    _builder.newLine();
    {
      EList<ColumnDef> _columnDefs_4 = stmt.getColumnDefs();
      boolean _hasElements = false;
      for(final ColumnDef col_3 : _columnDefs_4) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "			");
        }
        _builder.append("\t\t\t");
        _builder.append("m");
        String _name_18 = col_3.getName();
        String _pascalize_20 = Strings.pascalize(_name_18);
        _builder.append(_pascalize_20, "			");
        _builder.append("Dirty");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t    ");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Builder createBuilder() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Builder builder = ");
    String _name_19 = stmt.getName();
    String _pascalize_21 = Strings.pascalize(_name_19);
    _builder.append(_pascalize_21, "		");
    _builder.append(".newBuilder();");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<ColumnDef> _columnDefs_5 = stmt.getColumnDefs();
      final Function1<ColumnDef,Boolean> _function = new Function1<ColumnDef,Boolean>() {
          public Boolean apply(final ColumnDef it) {
            String _name = it.getName();
            boolean _equals = _name.equals("_id");
            boolean _not = (!_equals);
            return Boolean.valueOf(_not);
          }
        };
      Iterable<ColumnDef> _filter = IterableExtensions.<ColumnDef>filter(_columnDefs_5, _function);
      for(final ColumnDef col_4 : _filter) {
        _builder.append("\t\t");
        _builder.append("if(m");
        String _name_20 = col_4.getName();
        String _pascalize_22 = Strings.pascalize(_name_20);
        _builder.append(_pascalize_22, "		");
        _builder.append("Dirty) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("builder.set");
        String _name_21 = col_4.getName();
        String _pascalize_23 = Strings.pascalize(_name_21);
        _builder.append(_pascalize_23, "			");
        _builder.append("(m");
        String _name_22 = col_4.getName();
        String _pascalize_24 = Strings.pascalize(_name_22);
        _builder.append(_pascalize_24, "			");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return builder;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public long save(ContentResolver resolver){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Builder builder = createBuilder();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(m_id > 0) {");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("builder.update(resolver, m_id);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("Uri uri = builder.insert(resolver);");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("m_id = ContentUris.parseId(uri);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return m_id;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int update(ContentResolver resolver, SQuery query){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Builder builder = createBuilder();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return builder.update(resolver, query);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean delete(ContentResolver resolver){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return resolver.delete(");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _name_23 = stmt.getName();
    String _pascalize_25 = Strings.pascalize(_name_23);
    _builder.append(_pascalize_25, "			");
    _builder.append(".CONTENT_URI.buildUpon()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(".appendPath(String.valueOf(m_id)).build(), null, null) > 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _name_24 = stmt.getName();
    String _pascalize_26 = Strings.pascalize(_name_24);
    _builder.append(_pascalize_26, "	");
    _builder.append("Record fromCursor(Cursor c) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    String _name_25 = stmt.getName();
    String _pascalize_27 = Strings.pascalize(_name_25);
    _builder.append(_pascalize_27, "	    ");
    _builder.append("Record item = new ");
    String _name_26 = stmt.getName();
    String _pascalize_28 = Strings.pascalize(_name_26);
    _builder.append(_pascalize_28, "	    ");
    _builder.append("Record();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.newLine();
    {
      EList<ColumnDef> _columnDefs_6 = stmt.getColumnDefs();
      for(final ColumnDef col_5 : _columnDefs_6) {
        {
          ColumnType _type_4 = col_5.getType();
          boolean _equals_2 = Objects.equal(_type_4, ColumnType.BOOLEAN);
          if (_equals_2) {
            _builder.append("\t\t");
            _builder.append("item.m");
            String _name_27 = col_5.getName();
            String _pascalize_29 = Strings.pascalize(_name_27);
            _builder.append(_pascalize_29, "		");
            _builder.append(" = c.getInt(Indices.");
            String _name_28 = col_5.getName();
            String _underscore = Strings.underscore(_name_28);
            String _upperCase = _underscore.toUpperCase();
            _builder.append(_upperCase, "		");
            _builder.append(") > 0;");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t");
            _builder.append("item.m");
            String _name_29 = col_5.getName();
            String _pascalize_30 = Strings.pascalize(_name_29);
            _builder.append(_pascalize_30, "		");
            _builder.append(" = c.get");
            ColumnType _type_5 = col_5.getType();
            String _javaTypeName_2 = Extensions.toJavaTypeName(_type_5);
            String _pascalize_31 = Strings.pascalize(_javaTypeName_2);
            _builder.append(_pascalize_31, "		");
            _builder.append("(Indices.");
            String _name_30 = col_5.getName();
            String _underscore_1 = Strings.underscore(_name_30);
            String _upperCase_1 = _underscore_1.toUpperCase();
            _builder.append(_upperCase_1, "		");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("return item;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    String _name_31 = stmt.getName();
    String _pascalize_32 = Strings.pascalize(_name_31);
    _builder.append(_pascalize_32, "	");
    _builder.append("Record get(ContentResolver resolver, long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("Cursor c = null;");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("c = resolver.query(");
    String _name_32 = stmt.getName();
    String _pascalize_33 = Strings.pascalize(_name_32);
    _builder.append(_pascalize_33, "	        ");
    _builder.append(".CONTENT_URI.buildUpon()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append(".appendPath(String.valueOf(id)).build(), PROJECTION, null, null, null);");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("if(!c.moveToFirst()) {");
    _builder.newLine();
    _builder.append("\t            ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("return fromCursor(c);");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("} finally {");
    _builder.newLine();
    _builder.append("\t        ");
    _builder.append("Closeables.closeSilently(c);");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateProjectionArrayMembers(final CreateTableStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ColumnDef> _columnDefs = stmt.getColumnDefs();
      boolean _hasElements = false;
      for(final ColumnDef col : _columnDefs) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _name = stmt.getName();
        String _pascalize = Strings.pascalize(_name);
        _builder.append(_pascalize, "");
        _builder.append(".");
        String _name_1 = col.getName();
        String _underscore = Strings.underscore(_name_1);
        String _upperCase = _underscore.toUpperCase();
        _builder.append(_upperCase, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateProjectionIndicesMembers(final CreateTableStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    int counter = (-1);
    _builder.newLineIfNotEmpty();
    {
      EList<ColumnDef> _columnDefs = stmt.getColumnDefs();
      for(final ColumnDef col : _columnDefs) {
        _builder.append("int ");
        String _name = col.getName();
        String _underscore = Strings.underscore(_name);
        String _upperCase = _underscore.toUpperCase();
        _builder.append(_upperCase, "");
        _builder.append(" = ");
        int _plus = (counter + 1);
        int _counter = counter = _plus;
        _builder.append(_counter, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateFields(final CreateTableStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ColumnDef> _columnDefs = stmt.getColumnDefs();
      for(final ColumnDef col : _columnDefs) {
        _builder.append("private ");
        ColumnType _type = col.getType();
        String _javaTypeName = Extensions.toJavaTypeName(_type);
        _builder.append(_javaTypeName, "");
        _builder.append(" m");
        String _name = col.getName();
        String _pascalize = Strings.pascalize(_name);
        _builder.append(_pascalize, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("private boolean m");
        String _name_1 = col.getName();
        String _pascalize_1 = Strings.pascalize(_name_1);
        _builder.append(_pascalize_1, "");
        _builder.append("Dirty;");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateAccessors(final CreateTableStatement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void setId (long id) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("m_id = id;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("m_idDirty = true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public long getId() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return m_id;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      EList<ColumnDef> _columnDefs = stmt.getColumnDefs();
      final Function1<ColumnDef,Boolean> _function = new Function1<ColumnDef,Boolean>() {
          public Boolean apply(final ColumnDef it) {
            String _name = it.getName();
            boolean _equals = _name.equals("_id");
            boolean _not = (!_equals);
            return Boolean.valueOf(_not);
          }
        };
      Iterable<ColumnDef> _filter = IterableExtensions.<ColumnDef>filter(_columnDefs, _function);
      for(final ColumnDef col : _filter) {
        _builder.append("public void set");
        String _name = col.getName();
        String _pascalize = Strings.pascalize(_name);
        _builder.append(_pascalize, "");
        _builder.append("(");
        ColumnType _type = col.getType();
        String _javaTypeName = Extensions.toJavaTypeName(_type);
        _builder.append(_javaTypeName, "");
        _builder.append(" ");
        String _name_1 = col.getName();
        String _camelize = Strings.camelize(_name_1);
        _builder.append(_camelize, "");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("m");
        String _name_2 = col.getName();
        String _pascalize_1 = Strings.pascalize(_name_2);
        _builder.append(_pascalize_1, "	");
        _builder.append(" = ");
        String _name_3 = col.getName();
        String _camelize_1 = Strings.camelize(_name_3);
        _builder.append(_camelize_1, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("m");
        String _name_4 = col.getName();
        String _pascalize_2 = Strings.pascalize(_name_4);
        _builder.append(_pascalize_2, "	");
        _builder.append("Dirty = true;");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public ");
        ColumnType _type_1 = col.getType();
        String _javaTypeName_1 = Extensions.toJavaTypeName(_type_1);
        _builder.append(_javaTypeName_1, "");
        _builder.append(" get");
        String _name_5 = col.getName();
        String _pascalize_3 = Strings.pascalize(_name_5);
        _builder.append(_pascalize_3, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return m");
        String _name_6 = col.getName();
        String _pascalize_4 = Strings.pascalize(_name_6);
        _builder.append(_pascalize_4, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
      }
    }
    return _builder;
  }
}
