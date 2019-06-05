import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class numerosJunit {

	@Test
	void arrayCorrecto() {
		int[] array = {1, 6, 9, -2, 9, 1};
		int[] res = null;
		int numero = 2;
		
		//System.out.println(array[0]);
		res = Numeros.numerosSumados(array, numero);
		
		assertTrue(array.length == res.length);
		//System.out.println(array[0]);
		//System.out.println(res[0]);
		assertTrue((res[0] - array[0]) == numero);
	}
	
	@Test
	void ventajaIncorrecta() {
		int[] array = {1, 6, 9, -2, 9, 1};
		int[] res = null;
		int numero = 2;
		
		//System.out.println(array[0]);
		res = Numeros.numerosSumados(array, numero);
		
		//System.out.println(array[0]);
		//System.out.println(res[0]);
		assertFalse((res[0] - array[0]) != numero);
	}

}
