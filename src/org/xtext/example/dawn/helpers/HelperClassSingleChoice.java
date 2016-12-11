package org.xtext.example.dawn.helpers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.dawn.dawn.Component;
import org.xtext.example.dawn.dawn.SingleChoice;
import org.xtext.example.dawn.dawn.SingleChoiceAttributes;
import org.xtext.example.dawn.dawn.SingleChoiceOptions;

public class HelperClassSingleChoice {
	public static SingleChoice getSingleChoice(Component c) {
		return (SingleChoice) c;
	}

	public static String getSingleChoiceName(Component c) {
		SingleChoice s = (SingleChoice) c;
		return s.getName();
	}

	public static SingleChoiceAttributes getSingleChoiceAttributes(Component c) {
		SingleChoice s = (SingleChoice) c;
		return s.getAttributes();
	}

	public static String getSingleChoiceAttributeText(Component c) {
		SingleChoice s = (SingleChoice) c;
		return s.getAttributes().getText().getText();
	}
	
	public static EList<SingleChoiceOptions> getSingleChoiceAttributeComponents(Component c) {
		SingleChoice s = (SingleChoice) c;
		return s.getAttributes().getComponents();
	}
	
	public static Map<String, String> getSingleChoiceAttributeComponentsAttributes(Component c){
		Map<String, String> map = new HashMap<String, String>();
		for (SingleChoiceOptions so : getSingleChoiceAttributeComponents(c)) {
			map.put(so.getName(), so.getText().getText());
		}
		return map;	
	}
}
