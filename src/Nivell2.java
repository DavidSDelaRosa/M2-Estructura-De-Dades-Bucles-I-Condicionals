
public class Nivell2 {

	public static void main(String[] args) {
		
		escaleraNumeros(8);
		System.out.println("\n--------------------------------\n");
		piramideInvertida(8);

	}

	public static void escaleraNumeros(int filas) {

		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}

	public static void piramideInvertida(int filas) {

		int filasTmp = filas; // creo una variable temporal que equivale a las filas
								// dado que se va a modiciar al final de cada iteración

		// FOR para los espacios en blanco
		for (int altura = 1; altura <= filas; altura++) { // 1 vuelta, sin espacios; 2 vuelta->1 espacio; 3 vuelta->2
															// epacios...

			for (int blancos = 1; blancos < altura; blancos++) {
				System.out.print(" ");
			}
			// FOR para los asteriscos
			for (int asteriscos = 1; asteriscos <= (filasTmp * 2) - 1; asteriscos++) {
				// se escribirán el doble de asteriscos que filas se hayan introducido -1
				System.out.print("*");
			}
			filasTmp--; // decrementamos en 1 la variable de fila temporal creada anteriormente
			System.out.println(""); // hacemos un salto de línea al final de la iteración
		}
	}

}
