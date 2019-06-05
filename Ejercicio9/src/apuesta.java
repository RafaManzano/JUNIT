import java.util.Random;

public class apuesta {

	public static char[] generarApuesta1X2() {
		char[] array = new char[14];
		Random random = new Random();
		int na = 0;
		
		for(int i = 0; i < array.length; i++) {
			na = random.nextInt(3);
			
			switch(na) {
			case 0:
				array[i] = '1';
			break;
			
			case 1:
				array[i] = 'X';
			break;
			
			case 2:
				array[i] = '2';
			break;
			}
		}
		return array;
	}

}
