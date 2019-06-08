import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class apuestaJunit {

	@Test
	void generarApuesta1X2() {
		char[] array;
		
		for(int i = 0; i < 1000; i++) {
			array = apuesta.generarApuesta1X2();
			
			for(int aux = 0; aux < array.length; aux++) {
				assertTrue(array.length == 14);
				assertTrue(array[aux] == '1' || array[aux] == 'X' || array[aux] == '2');
			}
		}
	}
}
