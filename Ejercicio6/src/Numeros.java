
public class Numeros {

	public static int[] numerosSumados(int[] array, int numero) {
		int[] res = new int[array.length];
		
		for(int i = 0; i < res.length; i++) {
			res[i] = array[i] + numero;
		}
		
		return res;
		
	}
}
