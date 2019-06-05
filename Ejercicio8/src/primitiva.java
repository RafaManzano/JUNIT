import java.util.Random;

public class primitiva {

	public static int[] generarApuestaPrimitiva() {
		int[] array = new int[6];
		Random random = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(49)+1;
		}
		
		return array;
	}

}
