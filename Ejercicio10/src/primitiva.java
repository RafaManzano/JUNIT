
public class primitiva {

	public static int comprobarPrimitiva(int[] c1, int[] c2) {
		int resultado = 0;
		
		if(c1.length != 6) {
			resultado = -1;
		}
		else {
			for(int i = 0; i < c1.length; i++) {
				if(c1[i] < 1 || c1[i] > 49) {
					resultado = -1;
				}
			}
		}
		
		if(c2.length != 6) {
			resultado = -2;
		}
		else {
			for(int i = 0; i < c2.length; i++) {
				if(c2[i] < 1 || c2[i] > 49) {
					resultado = -2;
				}
			}
		}
		
		if(resultado == 0) {
			for(int i = 0; i < c1.length; i++) {
				if(c1[i] == c2[i]) {
					resultado++;
				}
			}
		}
		
		return resultado;
	}

}
