
public class Nivell3 {

	public static void main(String[] args) {
		

		int hour = 0, minutes = 0, seconds = 0;

		while (true) {

			// MOSTRAR

			if (hour < 10) {				//coloco un 0 delante en el caso en que no llegue a 10 el valor de las horas, minutos y segundos
											//para que se parezcamás a un reloj digital "00:00:00" en lugar de "0:0:0", por ejemplo.
				System.out.print("0");
			}

			System.out.print(hour);
			System.out.print(":");			//después de imprimir el valor de horas y minutos, imprimo ":" 

			if (minutes < 10) {
				System.out.print("0");
			}

			System.out.print(minutes);
			System.out.print(":");

			if (seconds < 10) {
				System.out.print("0");
			}

			System.out.println(seconds); 	// los segundos los imprimo con printLN para hacer el salto de línea

			// AUMENTAR TIEMPO
			seconds++;						// se incrementa en 1 los segundos

			// COMPROBACIONES

			if (seconds == 60) {			
				seconds = 0;					
				minutes++;

				if (minutes == 60) {
					minutes = 0;
					hour++;
				}
			}
			
			try {							//try-catch del Thread para controlar la excepción
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
