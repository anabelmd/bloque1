
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
}
