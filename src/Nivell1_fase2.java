import java.util.ArrayList;
import java.util.List;

public class Nivell1_fase2 {

	public static void main(String[] args) {
		
		char[] nombre = "David".toCharArray();

		List<Character> listaNombre = new ArrayList<>();	//ArrayList donde almacenaremos las letras del nombre

		for (char ch : nombre) {							//pasamos cada letra a la lista de Character
			listaNombre.add(ch);
		}

		System.out.println(listaNombre);

		for (Character ch2 : listaNombre) {					

			if (Character.isDigit(ch2)) {					//si isDigit nos devuelve true, quiere decir que el char será un nombre

				System.out.println("Los nombres de personas no pueden contener números");
			} else {
				char ch3 = Character.toLowerCase(ch2);

				if (ch3 == 'a' || ch3 == 'e' || ch3 == 'i' || ch3 == 'o' || ch3 == 'u') {
					System.out.println(ch3 + " VOCAL");
				} else {
					System.out.println(ch3 + " CONSONANTE");
				}
			}

		}
	}

}
