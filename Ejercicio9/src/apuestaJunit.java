import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class apuestaJunit {

	@Test
	void ApuestaCorrecta() {
		char[] array = apuesta.generarApuesta1X2();
	
		assertTrue(array.length == 14);
		assertTrue(array[0] == '1' || array[0] == 'X' || array[0] == '2');
	}
	
	@Test
	void ApuestaDe15Numeros() {
		char[] array = apuesta.generarApuesta1X2();
		
		assertFalse(array.length == 15);
	}
	
	@Test
	void ApuestaErronea() {
		char[] array = apuesta.generarApuesta1X2();
		
		assertFalse(array[0] == 'A');
	}

}
