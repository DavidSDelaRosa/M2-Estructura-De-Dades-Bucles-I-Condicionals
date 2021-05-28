import java.util.ArrayList;
import java.util.List;

public class Nivell1_fase4 {

	public static void main(String[] args) {

		// array char de la fase anterior
		char[] nombre = "David".toCharArray();

		// List Character de la fase anterior
		List<Character> listaNombre = new ArrayList<>();

		for (char ch : nombre) {
			listaNombre.add(ch);
		}

		List<Character> listaApellido = new ArrayList<>();

		String apellido = "Serrano";

		for (char ch : apellido.toCharArray()) {
			listaApellido.add(ch);
		}

		List<Character> nombreCompleto = new ArrayList<>();
		
		nombreCompleto.addAll(listaNombre);
		nombreCompleto.add(' ');
		nombreCompleto.addAll(listaApellido);

		System.out.println(nombreCompleto);

	}

}
