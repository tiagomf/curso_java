import java.util.Arrays;

public class ArraySimples{
	public static void main(String[] args) {

		String[] paises = {"Brasil", "Russia", "India", "India"};
		System.out.println(Arrays.toString(paises));

		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao); 

		Array.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
	}
}