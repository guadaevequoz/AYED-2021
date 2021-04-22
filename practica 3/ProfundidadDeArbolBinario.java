package tp03.ejercicio5;

import CargarArbol.CargarArbol;
import tp02.ejercicio3.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {
	ArbolBinario<Integer> abb = new ArbolBinario<Integer>();
	
	public ProfundidadDeArbolBinario() {
		
	}
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> abb) {
		this.abb=abb;
	}

	public int sumaElementosProfundidad(int p) {
		int n=0,suma=0;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		cola.encolar(abb);
		cola.encolar(null);
		while(!cola.esVacia() && n<=p) {
			abb = cola.desencolar();
			if(abb !=null) {
				if(n==p) suma+= abb.getDato();
				if(abb.tieneHijoIzquierdo())
					cola.encolar(abb.getHijoIzquierdo());
				if(abb.tieneHijoDerecho())
					cola.encolar(abb.getHijoDerecho());
			}else if(!cola.esVacia()) {
				cola.encolar(null);
				n++;
			}
		}
		return suma;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargarArbol arbol = new CargarArbol();
		ArbolBinario<Integer> abb = arbol.CargarPositivos();
		abb.recorridoPorNiveles();
		ProfundidadDeArbolBinario v = new ProfundidadDeArbolBinario(abb);
		System.out.println("La suma es:"+v.sumaElementosProfundidad(2));
	}

}
