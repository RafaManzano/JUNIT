import java.util.Random;

public class tamanhoArray {

	public static int[] arrayAleatorio(int tamanho, int min, int max) {
		int[] array = new int[tamanho];
		Random random = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(max)+min;
		}
		
		return array;
	}
}
