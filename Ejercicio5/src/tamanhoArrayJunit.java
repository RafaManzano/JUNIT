import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tamanhoArrayJunit {

	@Test
	void arrayAleatorio() {
		int[] array;
		
		//array tam = 5, min = -2, max = 8
		array = tamanhoArray.arrayAleatorio(5, -2, 8);
		
		assertTrue(array.length == 5);
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i] >= -2 && array[i] <= 8);
		}
		
		//array tam = 8, min = 0, max = 38
		array = tamanhoArray.arrayAleatorio(8, 0, 38);
		
		assertTrue(array.length == 8);
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i] >= 0 && array[i] <= 38);
		}
		
		//array tam = 6, min = -20, max = 7
		array = tamanhoArray.arrayAleatorio(6, -20, 7);
		
		assertTrue(array.length == 6);
		for(int i = 0; i < array.length; i++) {
			assertTrue(array[i] >= -20 && array[i] <= 7);
		}
		
		//array tam = 15, min = 2, max = 60
		//Estaba un error en el metodo
		for(int a = 0; a < 200000; a++) {
			array = tamanhoArray.arrayAleatorio(15, 2, 60);
			
			assertTrue(array.length == 15);
			for(int i = 0; i < array.length; i++) {
				assertTrue(array[i] >= 2 && array[i] <= 60);
			}
		}
	}
	
}
