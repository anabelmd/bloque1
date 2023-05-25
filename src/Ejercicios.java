
public class Ejercicios {
	/*
	 * 1.1 Método que devuelva un número aleatorio entre dos pasados por argumentos
	 * del método.
	 */

	public int numeroAleatorio(int numeroMax, int numeroMin) {
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
	
	public void imprimirDatosPersona(Persona p) {
		
		System.out.println(p);
	}
	
	
	
	
	
	
	
	class Persona{
		private String nombre;
		private int edad;
		
		public Persona(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the edad
		 */
		public int getEdad() {
			return edad;
		}

		/**
		 * @param edad the edad to set
		 */
		public void setEdad(int edad) {
			this.edad = edad;
		}

		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
		}
		
		
		
		
	}
}
