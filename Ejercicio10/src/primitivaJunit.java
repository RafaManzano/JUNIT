import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class primitivaJunit {

	@Test
	void primitivaCorrecta() {
		int numero = 0;
		int[] c1 = {1,1,1,1,1,1};
		int[] c2 = {1,1,1,1,1,1};
		numero = primitiva.comprobarPrimitiva(c1,c2);
		
		assertTrue(c1.length == 6);
		assertTrue(c2.length == 6);
		assertTrue(numero > 0);
		assertTrue(numero == 6);
		assertTrue(c1[0] >= 1 && c2[0] <= 49);
	}

	@Test
	void primerBoletoMasLargo() {
		int numero = 0;
		int[] c1 = {1,1,1,1,1,1,1};
		int[] c2 = {1,1,1,1,1,1};
		numero = primitiva.comprobarPrimitiva(c1,c2);
	
		assertTrue(numero == -1);
	}
	
	@Test
	void primerBoletoErroneo() {
		int numero = 0;
		int[] c1 = {1,1,1,1,1,50};
		int[] c2 = {1,1,1,1,1,1};
		numero = primitiva.comprobarPrimitiva(c1,c2);
	
		assertTrue(numero == -1);
	}
	
	@Test
	void segundoBoletoMasLargo() {
		int numero = 0;
		int[] c2 = {1,1,1,1,1,1,1};
		int[] c1 = {1,1,1,1,1,1};
		numero = primitiva.comprobarPrimitiva(c1,c2);
	
		assertTrue(numero == -2);
	}
	
	@Test
	void segundoBoletoErroneo() {
		int numero = 0;
		int[] c2 = {1,1,1,1,1,0};
		int[] c1 = {1,1,1,1,1,1};
		numero = primitiva.comprobarPrimitiva(c1,c2);
	
		assertTrue(numero == -2);
	}
}
