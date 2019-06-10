import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitQuiniela {

	@Test
	public void comprobar1X2() {
		//14 Aciertos
		int numero = 0;
		char[] a1 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		char[] a2 = {'1','1','1','1','1','1','1','1','1','1','1','1','1','1'};
		numero = quiniela.comprobar1x2(a1, a2);
		
		assertTrue(numero == 14);
		
		//3 Aciertos
		char[] a3 = {'X','X','2','2','X','1','2','X','X','X','1','2','2','X'};
		char[] a4 = {'X','2','X','1','1','2','1','2','X','1','X','1','X','X'};
		numero = quiniela.comprobar1x2(a3, a4);
		
		assertTrue(numero == 3);
		
		//0 Aciertos
		char[] a5 = {'1','X','2','2','X','1','2','X','X','X','1','2','2','X'};
		char[] a6 = {'2','1','1','X','1','X','1','2','1','1','2','1','1','1'};
		numero = quiniela.comprobar1x2(a5, a6);
		
		assertTrue(numero == 0);
		
		//Primer Array mas largo
		char[] a7 = {'1','X','2','2','X','1','2','X','X','X','1','2','2','X','2'};
		char[] a8 = {'2','1','1','X','1','X','1','2','1','1','2','1','1','1'};
		numero = quiniela.comprobar1x2(a7, a8);
		
		assertTrue(numero == -1);
		
		//En el primer array con un caracter invalido
		char[] a9 = {'1','X','2','2','X','1','2','A','X','X','1','2','2','X'};
		char[] a10 = {'2','1','1','X','1','X','1','2','1','1','2','1','1','1'};
		numero = quiniela.comprobar1x2(a9, a10);
		
		assertTrue(numero == -1);
		
		//Segundo Array mas largo
		char[] a11 = {'1','X','2','2','X','1','2','X','X','X','1','2','2','X'};
		char[] a12 = {'2','1','1','X','1','X','1','2','1','1','2','1','1','1','2'};
		numero = quiniela.comprobar1x2(a11, a12);
		
		assertTrue(numero == -2);
		
		//En el segundo array con un caracter invalido
		char[] a13 = {'1','X','2','2','X','1','2','X','X','X','1','2','2','X'};
		char[] a14 = {'2','1','1','X','1','X','C','2','1','1','2','1','1','1'};
		numero = quiniela.comprobar1x2(a13, a14);
		
		assertTrue(numero == -2);
	}
}
