package tp02.ejercicio3;
import tp02.ejercicio2.*;

public class ColaGenerica<T> {
	private NodoGenerico<T> frente;
	private NodoGenerico<T> fin;
	
	public void encolar(T elem) {
		NodoGenerico<T> aux = new NodoGenerico<T>();
		aux.setDato(elem);
		if(this.esVacia()) {
			this.frente= aux;
			this.fin= aux;
		}else {
			fin.setSiguiente(aux);;
			this.fin= aux;
		}
		
	}
	public T desencolar() {
		if(!this.esVacia()) {
			T elem = frente.getDato();
			if(frente == fin) {
				frente = null;
				fin = null;
			}else {
				frente = frente.getSiguiente();
			}
			return elem;
		}else {
			return null;
		}
	}
	public T tope() {
		return fin.getDato();
	}
	public boolean esVacia() {
		if (this.frente == null) return true;
		else return false;
	}
}
