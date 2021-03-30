package tp02.ejercicio3;

import tp02.ejercicio2.NodoGenerico;

public class PilaGenerica<T> {
	private NodoGenerico<T> frente;
	
	public void apilar(T elem) {
		NodoGenerico<T> aux = new NodoGenerico<T>();
		aux.setDato(elem);
		if(this.frente == null) {
			aux.setSiguiente(null);
			frente = aux;
		}else {
			aux.setSiguiente(frente);
			frente = aux;
		}
	}
	public T desapilar() {
		if(!esVacia()) {
			T elem = frente.getDato();
			frente = frente.getSiguiente();
			return elem;
		}else {
			return null;
		}
	}
	public T tope() {
		if(esVacia()) {
			return null;
		}else {
			NodoGenerico<T> n = frente;
			frente = frente.getSiguiente();
			return n.getDato();
		}
	}
	public boolean esVacia() {
		if (this.frente == null) return true;
		else return false;
	}
}
