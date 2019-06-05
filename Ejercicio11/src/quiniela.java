
public class quiniela {

	public static int comprobar1x2(char[] a1, char[] a2) {
		int resultado = 0;
		
		if(a1.length != 14) {
			resultado = -1;
		}
		else {
			for(int i = 0; i < a1.length; i++) {
				if(a1[i] != '1' && a1[i] != 'X' && a1[i] != '2') {
					resultado = -1;
				}
			}
		}
		
		if(a2.length != 14) {
			resultado = -2;
		}
		else {
			for(int i = 0; i < a2.length; i++) {
				if(a2[i] != '1' && a2[i] != 'X' && a2[i] != '2') {
					resultado = -2;
				}
			}
		}
		
		if(resultado == 0) {
			for(int i = 0; i < a1.length; i++) {
				if(a1[i] == a2[i]) {
					resultado++;
				}
			}
		}
		
		return resultado;
	}
}
