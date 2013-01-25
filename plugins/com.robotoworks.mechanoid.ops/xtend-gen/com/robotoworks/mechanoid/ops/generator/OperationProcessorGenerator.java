package com.robotoworks.mechanoid.ops.generator;

import com.robotoworks.mechanoid.common.util.Strings;
import com.robotoworks.mechanoid.ops.opServiceModel.Model;
import com.robotoworks.mechanoid.ops.opServiceModel.ServiceBlock;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class OperationProcessorGenerator {
  public CharSequence generate(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    ServiceBlock svc = model.getService();
    _builder.newLineIfNotEmpty();
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
    _builder.append("import android.content.Intent;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.ops.Operation;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.ops.OperationInstantiationException;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.ops.OperationService;");
    _builder.newLine();
    _builder.append("import com.robotoworks.mechanoid.ops.OperationProcessor;\t\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Abstract");
    String _name = svc.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("Processor extends OperationProcessor {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static ");
    String _name_1 = svc.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    _builder.append(_pascalize_1, "	");
    _builder.append("OperationRegistry sOperationRegistry;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected Operation createOperation(String action) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(sOperationRegistry == null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("sOperationRegistry = new ");
    String _name_2 = svc.getName();
    String _pascalize_2 = Strings.pascalize(_name_2);
    _builder.append(_pascalize_2, "			");
    _builder.append("OperationRegistry();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Class<? extends Operation> operation = sOperationRegistry.getOperation(action);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Operation instance = operation.newInstance();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return instance;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("catch(Exception x) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throw new OperationInstantiationException(x);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Abstract");
    String _name_3 = svc.getName();
    String _pascalize_3 = Strings.pascalize(_name_3);
    _builder.append(_pascalize_3, "	");
    _builder.append("Processor(OperationService service, boolean enableLogging) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(service, enableLogging);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateStub(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    ServiceBlock svc = model.getService();
    _builder.newLineIfNotEmpty();
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
    _builder.append("import com.robotoworks.mechanoid.ops.OperationService;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = svc.getName();
    String _pascalize = Strings.pascalize(_name);
    _builder.append(_pascalize, "");
    _builder.append("Processor extends Abstract");
    String _name_1 = svc.getName();
    String _pascalize_1 = Strings.pascalize(_name_1);
    _builder.append(_pascalize_1, "");
    _builder.append("Processor {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = svc.getName();
    String _pascalize_2 = Strings.pascalize(_name_2);
    _builder.append(_pascalize_2, "	");
    _builder.append("Processor(OperationService service) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(service, false);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
