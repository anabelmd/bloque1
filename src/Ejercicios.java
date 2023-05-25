
public class Ejercicios {
	/*
	 * 1.1 Método que devuelva un número aleatorio entre dos pasados por argumentos
	 * del método.
	 */
	
	/**
	 * 
	 * @param numeroMax
	 * @param numeroMin
	 * @return un número aleatorio que se encuentra dentro del rango insertado por el usuario.
	 */
	public static int numeroAleatorio(int numeroMax, int numeroMin) {
		int resultado = 0;

		resultado = (int) (Math.random() * (numeroMax - numeroMin + 1) + numeroMin);
		return resultado;
	}

	/*
	 * 1.2 Diseñe un método que imprima los datos de una persona ingresados por
	 * teclado e indicar si es mayor o menor de edad. El método recibe una clase
	 * Persona que tiene nombre y edad; crea la clase necesaria. Es mayor de edad si
	 * tiene 18 o más.
	 */
	
	
	/**
	 * 
	 * @param p
	 * Este método imprimirá un objeto persona.
	 */
	public static void imprimirDatosPersona(Persona p) {
		
		System.out.println(p);
	}
	

}
