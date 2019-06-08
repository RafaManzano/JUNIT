import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numerosJunit {

	@Test
	void numerosSumados() {
		int[] res = null;
		
		int[] a1 = {1, 6, 9, -2, 9, 1};
		int numero = 2;
		
		res = Numeros.numerosSumados(a1, numero);
		
		for(int i = 0; i < res.length; i++) {
			assertTrue((res[i] - a1[i]) == numero);
		}
		
		int[] a2 = {7, 12, -9, -2, 0, 25};
		numero = 5;
		
		res = Numeros.numerosSumados(a2, numero);
		
		for(int i = 0; i < res.length; i++) {
			assertTrue((res[i] - a2[i]) == numero);
		}
		
		int[] a3 = {0, 1, 10, 5, -90, 20};
		numero = 3;
		
		res = Numeros.numerosSumados(a3, numero);
		
		for(int i = 0; i < res.length; i++) {
			assertTrue((res[i] - a3[i]) == numero);
		}
	}

}
