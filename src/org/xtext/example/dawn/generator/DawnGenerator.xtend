/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.dawn.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.dawn.dawn.Element
import org.xtext.example.dawn.dawn.Window
import org.xtext.example.dawn.dawn.Button
import org.xtext.example.dawn.dawn.Container
import org.xtext.example.dawn.dawn.DawnPackage

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DawnGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (w : resource.allContents.toIterable.filter(Window)) {
			fsa.generateFile(w.name.toString() + ".java", w.compile)
		}
	}

	def compile(Window w) '''
		import javax.swing.*;
		    public class «w.name» {
		    	public static void main(String[] args){
					JFrame «w.name» = new JFrame("«if(w.attributes.text != ""){w.attributes.text}»");
					JPanel panel = new JPanel();
					«FOR e:w.container.elements»
					        «e.compile»
					«ENDFOR»
						
					«w.name».add(panel); 
					«w.name».pack();
					«w.name».setSize(«w.attributes.size.height»,«w.attributes.size.width»);
					«w.name».setVisible(true);
					}
				}
			'''
	
	def compile(Element e) '''
	«IF(e instanceof Button)»
		JButton «e.component.name» = new JButton("");
		panel.add(button);
	«ENDIF»
	'''

}
