package tp03.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;
public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 
	int altura;
	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	

	public boolean esLleno() {
		ArbolBinario<T> arbol=null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		boolean lleno = true;
		int cant_nodos=0;
		cola.encolar(null);
		int nivel=0;
		while(!cola.esVacia() && lleno) {
			arbol = cola.desencolar();
			if(arbol !=null) {
				System.out.print(arbol.getDato());
				if(!arbol.getHijoIzquierdo().esVacio()) {
					cola.encolar(arbol.getHijoIzquierdo());
					cant_nodos++;
				}
				if(!arbol.getHijoDerecho().esVacio()) {
					cola.encolar(arbol.getHijoDerecho());
					cant_nodos++;
				}
					
			}else if(!cola.esVacia()) {
				if(cant_nodos == Math.pow(2, ++nivel)) {
					cola.encolar(null);
					cant_nodos=0;
					System.out.println();
				}else lleno=false;
			}
		}
		return lleno;
	}

	 boolean esCompleto() {
		return false;
	}

	
	// imprime el árbol en preorden  
	public void printPreorden() {
		System.out.println(this.getDato()+" ");
		if(this.tieneHijoIzquierdo())
			this.getHijoIzquierdo().printPreorden();
		if(this.tieneHijoDerecho())
			this.getHijoDerecho().printPreorden();
	}

	// imprime el �rbol en postorden
	public void printPostorden() {
		if(this.tieneHijoIzquierdo())
			this.getHijoIzquierdo().printPostorden();
		if(this.tieneHijoDerecho())
			this.getHijoDerecho().printPostorden();
		System.out.println(this.getDato()+" ");
	}
	// imprime el �rbol en postorden
	public void printInorden() {
		if(this.tieneHijoIzquierdo())
			this.getHijoIzquierdo().printInorden();
		System.out.println(this.getDato()+" ");
		if(this.tieneHijoDerecho())
			this.getHijoDerecho().printInorden();
	}
	


	public void recorridoPorNiveles() {
		ArbolBinario<T> arbol=null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia()) {
			arbol = cola.desencolar();
			if(arbol !=null) {
				System.out.print(arbol.getDato());
				if(arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if(arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			}else if(!cola.esVacia()) {
				System.out.println();
				cola.encolar(null);
			}
		}
	}

	

	public ListaGenerica<T> frontera() {
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();

		return l;
	}

	
	
	
	public int contarHojas() {
		int hojasIzq,hojasDer;
		hojasIzq = hojasDer = 0;
		if (this.esVacio()) return 0;
		else if(this.esHoja()) return 1;
		else {
			if(this.tieneHijoIzquierdo()) 
				hojasIzq = this.getHijoIzquierdo().contarHojas();
			
			if(this.tieneHijoDerecho()) 
				hojasDer = this.getHijoDerecho().contarHojas();
			
		}
		return hojasIzq + hojasDer;
	}
	
	public ArbolBinario<T> espejo(){
		ArbolBinario<T> ab;
		if(this.esVacio()) ab=null;
		else {
			ab=new ArbolBinario<T>();
			if(this.esHoja()) ab.setDato(this.getDato());
			else {
			if(this.tieneHijoIzquierdo())
				ab.agregarHijoDerecho(this.getHijoIzquierdo());
			if(this.tieneHijoDerecho())
				ab.agregarHijoIzquierdo(this.getHijoDerecho());
			}
		}
		return ab;
	}
	public int altura() {
        int aux=0;
        if(!this.esHoja()) {
            if(this.tieneHijoIzquierdo())
                aux= 1 + this.getHijoIzquierdo().altura();
            if(this.tieneHijoDerecho())
                aux= 1 + this.getHijoDerecho().altura();
         }else return 1;
        return aux;
    }
	public void entreNiveles(int n,int m){
		if((n>=0)&&(n<m)&&(m<=this.altura())) {
			ArbolBinario<T> arbol=null;
			ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
			int nivel=0;
			cola.encolar(this);
			cola.encolar(null);
			while(!cola.esVacia()) {
				arbol = cola.desencolar();
				if(arbol !=null) {
					if((nivel>=n)&&(nivel<=m)){
						System.out.print(arbol.getDato());
					}
					if(arbol.tieneHijoIzquierdo())
						cola.encolar(arbol.getHijoIzquierdo());
					if(arbol.tieneHijoDerecho())
						cola.encolar(arbol.getHijoDerecho());
					
				}else if(!cola.esVacia()) {
					System.out.println();
					cola.encolar(null);
					nivel++;
				}
			}
		}
		
	}
	
}
