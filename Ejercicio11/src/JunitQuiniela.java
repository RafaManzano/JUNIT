import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitQuiniela {

	@Test
	public void QuinielaAcertada() {
		int numero = 0;
		char[] a1 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		char[] a2 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		numero = quiniela.comprobar1x2(a1, a2);
		
		assertTrue(a1.length == 14);
		assertTrue(a2.length == 14);
		assertTrue(numero > 0);
		assertTrue(numero == 14);
	}

	@Test
	public void QuinielaPrimerArrayMasLargo() {
		int numero = 0;
		char[] a1 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		char[] a2 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		numero = quiniela.comprobar1x2(a1, a2);
		
		assertTrue(numero == -1);
	}
	
	@Test
	public void QuinielaPrimerArrayErroneo() {
		int numero = 0;
		char[] a1 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','P'};
		char[] a2 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		numero = quiniela.comprobar1x2(a1, a2);
		
		assertTrue(numero == -1);
	}
	
	@Test
	public void QuinielaSegundoArrayMasLargo() {
		int numero = 0;
		char[] a2 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		char[] a1 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		numero = quiniela.comprobar1x2(a1, a2);
		
		assertTrue(numero == -2);
	}
	
	@Test
	public void QuinielaSegundoArrayErroneo() {
		int numero = 0;
		char[] a2 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','P'};
		char[] a1 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		numero = quiniela.comprobar1x2(a1, a2);
		
		assertTrue(numero == -2);
	}
}
