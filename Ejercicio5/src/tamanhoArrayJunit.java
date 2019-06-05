import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tamanhoArrayJunit {

	@Test
	void arrayCorrecto() {
		int[] array;
		
		array = tamanhoArray.arrayAleatorio(5, -2, 8);
		
		assertTrue(array.length == 5);
		assertTrue(array[0] >= -2 && array[0] <= 8);
	}
	
	@Test
	void arrayTamanhoIncorrecto() {
		int[] array;
		
		array = tamanhoArray.arrayAleatorio(5, -2, 8);
		
		assertFalse(array.length == 7);
	}
	
	@Test
	void arrayNumerosIncorrectos() {
		int[] array;
		
		array = tamanhoArray.arrayAleatorio(5, -2, 8);
		
		assertFalse(array[0] < -2 && array[0] > 8);
	}

}
