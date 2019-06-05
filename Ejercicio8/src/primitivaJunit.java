import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class primitivaJunit {

	@Test
	void ApuestaCorrecta() {
		int[] array = primitiva.generarApuestaPrimitiva();
	
		assertTrue(array.length == 6);
		assertTrue(array[0] >= 1 && array[0] <= 49);
	}
	
	@Test
	void ApuestaDe6Numeros() {
		int[] array = primitiva.generarApuestaPrimitiva();
		
		assertFalse(array.length == 7);
	}
	
	@Test
	void ApuestaErroneaPorEncima() {
		int[] array = primitiva.generarApuestaPrimitiva();
		
		assertFalse(array[0] > 49);
	}
	
	@Test
	void ApuestaErroneaPorDebajo() {
		int[] array = primitiva.generarApuestaPrimitiva();
		
		assertFalse(array[0] < 1);
	}

}
