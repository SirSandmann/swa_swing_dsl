/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.dawn.dawn.Button;
import org.xtext.example.dawn.dawn.Component;
import org.xtext.example.dawn.dawn.Container;
import org.xtext.example.dawn.dawn.Element;
import org.xtext.example.dawn.dawn.SizeAttribute;
import org.xtext.example.dawn.dawn.TextAttribute;
import org.xtext.example.dawn.dawn.Window;
import org.xtext.example.dawn.dawn.WindowAttributes;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DawnGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Window> _filter = Iterables.<Window>filter(_iterable, Window.class);
    for (final Window w : _filter) {
      String _name = w.getName();
      String _string = _name.toString();
      String _plus = (_string + ".java");
      CharSequence _compile = this.compile(w);
      fsa.generateFile(_plus, _compile);
    }
  }
  
  public CharSequence compile(final Window w) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import javax.swing.*;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public class ");
    String _name = w.getName();
    _builder.append(_name, "    ");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t");
    _builder.append("public static void main(String[] args){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("JFrame ");
    String _name_1 = w.getName();
    _builder.append(_name_1, "\t\t\t");
    _builder.append(" = new JFrame(\"");
    TextAttribute _xifexpression = null;
    WindowAttributes _attributes = w.getAttributes();
    TextAttribute _text = _attributes.getText();
    boolean _notEquals = (!Objects.equal(_text, ""));
    if (_notEquals) {
      WindowAttributes _attributes_1 = w.getAttributes();
      _xifexpression = _attributes_1.getText();
    }
    _builder.append(_xifexpression, "\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("JPanel panel = new JPanel();");
    _builder.newLine();
    {
      Container _container = w.getContainer();
      EList<Element> _elements = _container.getElements();
      for(final Element e : _elements) {
        _builder.append("\t\t\t");
        CharSequence _compile = this.compile(e);
        _builder.append(_compile, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    String _name_2 = w.getName();
    _builder.append(_name_2, "\t\t\t");
    _builder.append(".add(panel); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _name_3 = w.getName();
    _builder.append(_name_3, "\t\t\t");
    _builder.append(".pack();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _name_4 = w.getName();
    _builder.append(_name_4, "\t\t\t");
    _builder.append(".setSize(");
    WindowAttributes _attributes_2 = w.getAttributes();
    SizeAttribute _size = _attributes_2.getSize();
    int _height = _size.getHeight();
    _builder.append(_height, "\t\t\t");
    _builder.append(",");
    WindowAttributes _attributes_3 = w.getAttributes();
    SizeAttribute _size_1 = _attributes_3.getSize();
    int _width = _size_1.getWidth();
    _builder.append(_width, "\t\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _name_5 = w.getName();
    _builder.append(_name_5, "\t\t\t");
    _builder.append(".setVisible(true);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Element e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof Button)) {
        _builder.append("JButton ");
        Component _component = e.getComponent();
        String _name = _component.getName();
        _builder.append(_name, "");
        _builder.append(" = new JButton(\"\");");
        _builder.newLineIfNotEmpty();
        _builder.append("panel.add(button);");
        _builder.newLine();
      }
    }
    return _builder;
  }
}