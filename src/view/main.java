package view;

import javax.swing.JOptionPane;

import controller.modulos;

public class main {

	public static void main(String[] args) {
		modulos mod = new modulos();
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Somar até "));
		int som = mod.somatoria(x);
		System.out.println("Somatória = " + som);
		
	}

}
