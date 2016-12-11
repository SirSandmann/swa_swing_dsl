package org.xtext.example.dawn.helpers;

import org.xtext.example.dawn.dawn.PasswordField;
import org.xtext.example.dawn.dawn.Component;

public class HelperClassPasswordField {
	public static PasswordField getPasswordField(Component c){
		return (PasswordField)c;
	}
	
	public static String getPasswordFieldText(Component c){
		PasswordField b = (PasswordField)c;
		return b.getText().getText();
	}
	
}
