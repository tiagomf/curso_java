import java.util.Scanner;
public class Operador{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o Raio");
		double raio = s.nextDouble();

		//double raio = 10;
		double diametro = (2 * raio);
		System.out.println("Diametro: "+diametro);
		double pi = Math.PI;
		double circunferencia = 2 *pi * raio;
		System.out.println("Circuferencia: "+circunferencia);
		double area = pi * (raio * raio);
		System.out.println("Area: "+area);		
	} 
}