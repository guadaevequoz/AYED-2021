package tp02.ejercicio1;

public class Ej1_6 {
	public static int calcular(int n) {
		//if (n < 1) return 1;
		if(n > 1) {
			if(n % 2 == 0) {
				n=n/2;
			}else {
				n=n * 3 + 1;
			}
		}
		return n;
	}
	public ListaDeEnterosEnlazada calcularSucesion (int n) {
		ListaDeEnterosEnlazada l;
		if(n > 1) {
			l = calcularSucesion(calcular(n));
		}else {
			l = new ListaDeEnterosEnlazada();
		}
		l.agregarInicio(n);
		return l;
	}
	
	public static void main(String[] args) {
		Ej1_6 f = new Ej1_6();
		ListaDeEnterosEnlazada l = f. calcularSucesion(4);
		
		//imprimo lista
		l.comenzar();
		while(!l.fin()) {
			System.out.println(l.proximo());
		}
	}

}
