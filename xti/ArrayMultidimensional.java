import java.util.Arrays;
import java.util.Random;

public class ArrayMultidimensional{
	public static void main(String[] args) {
		
		String[] faces = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9","10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouro"};
		Random r = new Random();
		
		String face = faces[r.nextInt(faces.length)];
		String nipe = nipes[r.nextInt(nipes.length)];

		String carta = face + " "+ nipe;
		System.out.println(carta);

	}
}