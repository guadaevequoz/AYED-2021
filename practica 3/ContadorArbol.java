package tp03.ejercicio3;

import CargarArbol.CargarArbol;
import tp02.ejercicio1.ListaDeEnterosEnlazada;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	public static ListaDeEnterosEnlazada numerosParesInOrden(ArbolBinario<Integer> abb,ListaDeEnterosEnlazada l) {
		if(!abb.esVacio()) {
		if(abb.tieneHijoIzquierdo()) {
			l= numerosParesInOrden(abb.getHijoIzquierdo(),l);
		}
		if((abb.getDato() % 2) == 0) 
			l.agregarInicio(abb.getDato());
		if(abb.tieneHijoDerecho()) {
			l= numerosParesInOrden(abb.getHijoDerecho(),l);
		}
		}
		return l;
	}
	public static ListaDeEnterosEnlazada numerosParesPosOrden(ArbolBinario<Integer> abb,ListaDeEnterosEnlazada l) {
		if(abb.tieneHijoIzquierdo()) {
			l= numerosParesPosOrden(abb.getHijoIzquierdo(),l);
		}
		if(abb.tieneHijoDerecho()) {
			l= numerosParesPosOrden(abb.getHijoDerecho(),l);
		}
		if((abb.getDato() % 2) == 0) 
			l.agregarInicio(abb.getDato());
		return l;
	}
	public static void main(String[] args) {
		CargarArbol arbol = new CargarArbol();
		
		ArbolBinario<Integer> abb = arbol.CargarPositivos();
		abb.printInorden();
		System.out.println();
		abb.printPostorden();
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		numerosParesInOrden(abb,l);
		ListaDeEnterosEnlazada l2 = new ListaDeEnterosEnlazada();
		numerosParesPosOrden(abb,l2);
		System.out.println();
		System.out.println("Imprimo la lista in orden");
		l.comenzar();
		while(!l.fin()) {
			System.out.println(l.proximo());
		}
		System.out.println();
		System.out.println("Imprimo la lista pos orden");
		l2.comenzar();
		while(!l2.fin()) {
			System.out.println(l2.proximo());
		}
	}

}
