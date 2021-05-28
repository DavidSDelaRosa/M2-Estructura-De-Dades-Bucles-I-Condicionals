import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nivell1_fase3 {
	
	public static void main(String[] args) {
		
		// array char de la fase anterior
		char[] nombre = "David".toCharArray();

		//List Character de la fase anterior
		List<Character> listaNombre = new ArrayList<>();
		
		for (char ch : nombre) {							
			listaNombre.add(ch);
		}
		
		Map<Character, Integer> mapa = new HashMap<>();

		for(Character ch: listaNombre) { 					//recorremos la lista 
			
			Character chLower = Character.toLowerCase(ch); 		//pasamos a minúsculas (si quisiéramos considerar como iguales minúsculas y mayúsculas)
			
			if(mapa.containsKey(chLower)) { 				//si ya existe la clave ...
				Integer n = mapa.get(chLower);				//cogemos el valor
				n++;										//aumentamos contador
				mapa.put(chLower, n);						//lo actualizamos en el map
				
			}else {											//si no existe...	
				Integer n=1;								//iniciamos contador
				mapa.put(chLower, n);						//añadimos clave/valor
			}
		}
		
		System.out.println(mapa);
	}

}
