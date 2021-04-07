package tp02.ejercicio3;
import tp02.ejercicio2.*;

public class ColaGenerica<T> {
	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T elem) {
		datos.agregarFinal(elem);
	}
	public T desencolar() {
		T e = this.tope();
		datos.eliminarEn(1);
		return e;
	}
	public T tope() {
		return datos.elemento(1);
	}
	public boolean esVacia() {
		return datos.esVacia();
	}
}
