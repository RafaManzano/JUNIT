import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class primitivaJunit {

	@Test
	void primitivaCorrecta() {
		//6 Aciertos
		int numero = 0;
		int[] c1 = {1,20,35,5,45,22};
		int[] c2 = {1,20,35,5,45,22};
		numero = primitiva.comprobarPrimitiva(c1,c2);
		
		assertTrue(numero == 6);
		for(int i = 0; i < 6; i++) {
			assertTrue(c1[i] >= 1 && c2[i] <= 49);
		}
		
		//3 Aciertos
		int[] c3 = {1,10,20,21,45,19};
		int[] c4 = {1,20,35,5,45,22};
		numero = primitiva.comprobarPrimitiva(c3,c4);
		
		assertTrue(numero == 3);
		for(int i = 0; i < 6; i++) {
			assertTrue(c3[i] >= 1 && c4[i] <= 49);
		}
		
		//0 Aciertos
		int[] c5 = {1,10,20,21,45,19};
		int[] c6 = {2,3,4,5,6,7};
		numero = primitiva.comprobarPrimitiva(c5,c6);
		
		assertTrue(numero == 0);
		for(int i = 0; i < 6; i++) {
			assertTrue(c5[i] >= 1 && c6[i] <= 49);
		}
		
		//Primer array mas largo
		int[] c7 = {1,10,20,21,45,19,22};
		int[] c8 = {2,3,4,5,6,7};
		numero = primitiva.comprobarPrimitiva(c7,c8);
		
		assertTrue(numero == -1);
		
		//Numero erroneo (Mayor de 49)
		int[] c9 = {1,10,20,21,45,50};
		int[] c10 = {2,3,4,5,6,7};
		numero = primitiva.comprobarPrimitiva(c9,c10);
		
		assertTrue(numero == -1);
		
		//Segundo array mas largo
		int[] c11 = {1,10,20,21,45,19};
		int[] c12 = {2,3,4,5,6,7,22};
		numero = primitiva.comprobarPrimitiva(c11,c12);
		
		assertTrue(numero == -2);
		
		//Numero erroneo (Menor de 1)
		int[] c13 = {1,10,20,21,45};
		int[] c14 = {2,3,4,5,6,7,-1};
		numero = primitiva.comprobarPrimitiva(c13,c14);
		
		assertTrue(numero == -2);
	}

	
}
