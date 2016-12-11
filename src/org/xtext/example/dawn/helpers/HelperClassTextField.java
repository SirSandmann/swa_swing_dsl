package org.xtext.example.dawn.helpers;

import org.xtext.example.dawn.dawn.TextField;
import org.xtext.example.dawn.dawn.Component;

public class HelperClassTextField {
	public static TextField getTextField(Component c){
		return (TextField)c;
	}
	
	public static String getTextFieldText(Component c){
		TextField b = (TextField)c;
		return b.getText().getText();
	}
	
}
