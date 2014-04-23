/**
	Calcular IMC
	IMC = pesoEmQuilos / (alturaEmMetros * alturaEmMetros)
*/

import javax.swing.JOptionPane;

public class IMC{

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Qual o seu peso, Vei?");
		String altura = JOptionPane.showInputDialog("E a sua altura?");

		double pesoEmQuilos = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuilos / (alturaEmMetros * alturaEmMetros); 

		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do peso ideal";

		msg = "IMC = " + imc + "\n" + msg;

		JOptionPane.showMessageDialog(null, msg);

		System.out.println("IMC = " + imc);
		System.out.println(msg);		
	}

}