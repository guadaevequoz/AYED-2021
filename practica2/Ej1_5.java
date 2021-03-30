package tp02.ejercicio1;

public class Ej1_5 {

	public static void imprimeInverso(ListaDeEnteros l, int aux) {	
		if(aux > 0) {
			System.out.println(l.elemento(aux));
			aux--;
			imprimeInverso(l,aux);
		}
	}
	
	public static void main(String[] args) {
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		l.agregarFinal(1);
		l.agregarFinal(2);
		l.agregarFinal(3);
		int aux=l.tamanio();
		imprimeInverso(l,aux);
	}

}
