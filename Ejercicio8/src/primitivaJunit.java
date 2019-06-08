import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class primitivaJunit {

	@Test
	void generarApuestaPrimitiva() {
		int[] array;
		
		for(int i = 0; i < 1000; i++) {
			array = primitiva.generarApuestaPrimitiva();
			
			for(int aux = 0; aux < array.length; aux++) {
				assertTrue(array.length == 6);
				assertTrue(array[aux] >= 1 && array[aux] <= 49);
			}
		}
	}

}
