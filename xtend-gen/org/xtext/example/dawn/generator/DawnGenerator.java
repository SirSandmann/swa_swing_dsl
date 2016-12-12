/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Map;
import java.util.Set;
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
import org.xtext.example.dawn.dawn.PasswordField;
import org.xtext.example.dawn.dawn.SingleChoice;
import org.xtext.example.dawn.dawn.SizeAttribute;
import org.xtext.example.dawn.dawn.TextAttribute;
import org.xtext.example.dawn.dawn.TextField;
import org.xtext.example.dawn.dawn.TextLabel;
import org.xtext.example.dawn.dawn.Window;
import org.xtext.example.dawn.dawn.WindowAttributes;
import org.xtext.example.dawn.helpers.HelperClassButton;
import org.xtext.example.dawn.helpers.HelperClassPasswordField;
import org.xtext.example.dawn.helpers.HelperClassSingleChoice;
import org.xtext.example.dawn.helpers.HelperClassTextField;
import org.xtext.example.dawn.helpers.HelperClassTextLabel;

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
    _builder.append("import java.awt.BorderLayout;");
    _builder.newLine();
    _builder.append("public class ");
    String _name = w.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main(String[] args){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("JFrame ");
    String _name_1 = w.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append(" = new JFrame(\"");
    TextAttribute _xifexpression = null;
    WindowAttributes _attributes = w.getAttributes();
    TextAttribute _text = _attributes.getText();
    boolean _notEquals = (!Objects.equal(_text, ""));
    if (_notEquals) {
      WindowAttributes _attributes_1 = w.getAttributes();
      _xifexpression = _attributes_1.getText();
    }
    _builder.append(_xifexpression, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("JPanel panel = new JPanel();");
    _builder.newLine();
    _builder.append("\t\t");
    {
      WindowAttributes _attributes_2 = w.getAttributes();
      String _layout = _attributes_2.getLayout();
      boolean _notEquals_1 = (!Objects.equal(_layout, null));
      if (_notEquals_1) {
        _builder.append("panel.setLayout(new ");
        WindowAttributes _attributes_3 = w.getAttributes();
        String _layout_1 = _attributes_3.getLayout();
        _builder.append(_layout_1, "\t\t");
        _builder.append("());");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      Container _container = w.getContainer();
      EList<Element> _elements = _container.getElements();
      for(final Element e : _elements) {
        _builder.append("\t\t");
        CharSequence _compile = this.compile(e);
        _builder.append(_compile, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    String _name_2 = w.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append(".add(panel); ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_3 = w.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append(".pack();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_4 = w.getName();
    _builder.append(_name_4, "\t\t");
    _builder.append(".setSize(");
    WindowAttributes _attributes_4 = w.getAttributes();
    SizeAttribute _size = _attributes_4.getSize();
    int _height = _size.getHeight();
    _builder.append(_height, "\t\t");
    _builder.append(",");
    WindowAttributes _attributes_5 = w.getAttributes();
    SizeAttribute _size_1 = _attributes_5.getSize();
    int _width = _size_1.getWidth();
    _builder.append(_width, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _name_5 = w.getName();
    _builder.append(_name_5, "\t\t");
    _builder.append(".setVisible(true);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Element e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Component _component = e.getComponent();
      if ((_component instanceof Button)) {
        _builder.append("JButton ");
        Component _component_1 = e.getComponent();
        String _name = _component_1.getName();
        _builder.append(_name, "");
        _builder.append(" = new JButton(\"");
        Component _component_2 = e.getComponent();
        String _buttonText = HelperClassButton.getButtonText(_component_2);
        _builder.append(_buttonText, "");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("panel.add(");
        Component _component_3 = e.getComponent();
        String _name_1 = _component_3.getName();
        _builder.append(_name_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        {
          Component _component_4 = e.getComponent();
          String _buttonCall = HelperClassButton.getButtonCall(_component_4);
          boolean _notEquals = (!Objects.equal(_buttonCall, ""));
          if (_notEquals) {
            Component _component_5 = e.getComponent();
            String _name_2 = _component_5.getName();
            _builder.append(_name_2, "");
            _builder.append(".addActionListener(new ActionListener() { ");
            _builder.newLineIfNotEmpty();
            _builder.append("  ");
            _builder.append("public void actionPerformed(ActionEvent e) { ");
            _builder.newLine();
            {
              Component _component_6 = e.getComponent();
              String _buttonCall_1 = HelperClassButton.getButtonCall(_component_6);
              boolean _equals = Objects.equal(_buttonCall_1, "new_Window");
              if (_equals) {
                _builder.append("    ");
                _builder.newLine();
              }
            }
            {
              Component _component_7 = e.getComponent();
              String _buttonCall_2 = HelperClassButton.getButtonCall(_component_7);
              boolean _equals_1 = Objects.equal(_buttonCall_2, "Dialog");
              if (_equals_1) {
                _builder.append("    ");
                _builder.newLine();
              }
            }
            _builder.append("  ");
            _builder.append("} ");
            _builder.newLine();
            _builder.append("} );");
            _builder.newLine();
          }
        }
      }
    }
    {
      Component _component_8 = e.getComponent();
      if ((_component_8 instanceof TextLabel)) {
        _builder.append("JLabel ");
        Component _component_9 = e.getComponent();
        String _name_3 = _component_9.getName();
        _builder.append(_name_3, "");
        _builder.append(" = new JLabel(\"");
        Component _component_10 = e.getComponent();
        String _textLabelText = HelperClassTextLabel.getTextLabelText(_component_10);
        _builder.append(_textLabelText, "");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("panel.add(");
        Component _component_11 = e.getComponent();
        String _name_4 = _component_11.getName();
        _builder.append(_name_4, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Component _component_12 = e.getComponent();
      if ((_component_12 instanceof TextField)) {
        _builder.append("JTextField ");
        Component _component_13 = e.getComponent();
        String _name_5 = _component_13.getName();
        _builder.append(_name_5, "");
        _builder.append(" = new JTextField(\"");
        Component _component_14 = e.getComponent();
        String _textFieldText = HelperClassTextField.getTextFieldText(_component_14);
        _builder.append(_textFieldText, "");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("panel.add(");
        Component _component_15 = e.getComponent();
        String _name_6 = _component_15.getName();
        _builder.append(_name_6, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Component _component_16 = e.getComponent();
      if ((_component_16 instanceof PasswordField)) {
        _builder.append("JPasswordField ");
        Component _component_17 = e.getComponent();
        String _name_7 = _component_17.getName();
        _builder.append(_name_7, "");
        _builder.append(" = new JPasswordField(\"");
        Component _component_18 = e.getComponent();
        String _passwordFieldText = HelperClassPasswordField.getPasswordFieldText(_component_18);
        _builder.append(_passwordFieldText, "");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("panel.add(");
        Component _component_19 = e.getComponent();
        String _name_8 = _component_19.getName();
        _builder.append(_name_8, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Component _component_20 = e.getComponent();
      if ((_component_20 instanceof SingleChoice)) {
        _builder.append("ButtonGroup bg_");
        Component _component_21 = e.getComponent();
        String _name_9 = _component_21.getName();
        _builder.append(_name_9, "");
        _builder.append("=new ButtonGroup();");
        _builder.newLineIfNotEmpty();
        {
          Component _component_22 = e.getComponent();
          Map<String, String> _singleChoiceAttributeComponentsAttributes = HelperClassSingleChoice.getSingleChoiceAttributeComponentsAttributes(_component_22);
          Set<Map.Entry<String, String>> _entrySet = _singleChoiceAttributeComponentsAttributes.entrySet();
          for(final Map.Entry<String, String> r : _entrySet) {
            _builder.append("JRadioButton rb_");
            String _key = r.getKey();
            _builder.append(_key, "");
            _builder.append("=new JRadioButton(\"");
            String _value = r.getValue();
            _builder.append(_value, "");
            _builder.append("\");");
            _builder.newLineIfNotEmpty();
            _builder.append("bg_");
            Component _component_23 = e.getComponent();
            String _name_10 = _component_23.getName();
            _builder.append(_name_10, "");
            _builder.append(".add(rb_");
            String _key_1 = r.getKey();
            _builder.append(_key_1, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("panel.add(rb_");
            String _key_2 = r.getKey();
            _builder.append(_key_2, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    return _builder;
  }
}
