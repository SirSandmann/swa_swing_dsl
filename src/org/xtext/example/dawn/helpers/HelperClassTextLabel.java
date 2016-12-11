package org.xtext.example.dawn.helpers;

import org.xtext.example.dawn.dawn.Component;
import org.xtext.example.dawn.dawn.TextLabel;

public class HelperClassTextLabel {
	public static TextLabel getTextLabel(Component c) {
		return (TextLabel) c;
	}

	public static String getTextLabelText(Component c) {
		TextLabel t = (TextLabel) c;
		return t.getText().getText();
	}

}
