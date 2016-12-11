package org.xtext.example.dawn.helpers;

import org.xtext.example.dawn.dawn.Button;
import org.xtext.example.dawn.dawn.Component;

public class HelperClassButton {
	public static Button getButton(Component c){
		return (Button)c;
	}
	
	public static String getButtonText(Component c){
		Button b = (Button)c;
		return b.getAttributes().getText().getText();
	}
	
	public static String getButtonMethod(Component c){
		Button b = (Button)c;
		return b.getAttributes().getMethod().getName();
	}
	
}
