package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ContadorArbol {
	private  static void recorrer (ArbolGeneral<Integer> a, ListaEnlazadaGenerica<Integer> max, ListaEnlazadaGenerica<Integer> act){
		act.agregarFinal(a.getDato());
		if (a.esHoja()) {
			if (max.tamanio() < act.tamanio()) {
				max.eliminarTodos();
				act.comenzar();
				while (!act.fin()) //RECORRE EN LISTAS ENLAZADAS GENERICAS
					max.agregarFinal(act.proximo());
			}
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> lHijos=a.getHijos();
			lHijos.comenzar();
			while (!lHijos.fin()) { //RECORRE EN LA LISTA DE LHIJOS QUE ES UNA LISTA DE ARBOL
				recorrer(lHijos.proximo(),max,act);
				act.eliminarEn(act.tamanio());
			}
			
		}
	}
			
public static ListaEnlazadaGenerica<Integer>  caminoAHojaMasLejana(ArbolGeneral<Integer> a){
	ListaEnlazadaGenerica<Integer> lMax=new ListaEnlazadaGenerica <Integer>();
	ListaEnlazadaGenerica<Integer> lact=new ListaEnlazadaGenerica <Integer>();
	if ( ! a.esVacio())
		recorrer(a,lMax,lact);
	return lMax;
}
	
	public static void main(String[] args) {
		ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(5);
		ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		hijos.agregarFinal(a1); hijos.agregarFinal(a2); 
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(8, hijos);
		ListaGenerica<ArbolGeneral<Integer>> hijos_a1 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> a11 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a12 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> a13 = new ArbolGeneral<Integer>(6);
		hijos_a1.agregarFinal(a11); hijos_a1.agregarFinal(a12); hijos_a1.agregarFinal(a13);
		a1.setHijos(hijos_a1);
		ListaGenerica<ArbolGeneral<Integer>> hijos_a13 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> a131 = new ArbolGeneral<Integer>(2);
		hijos_a13.agregarFinal(a131);
		a13.setHijos(hijos_a13);
		ListaGenerica<ArbolGeneral<Integer>> hijos_a2 = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> a21 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> a22 = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> a23 = new ArbolGeneral<Integer>(10);
		hijos_a2.agregarFinal(a21); hijos_a2.agregarFinal(a22); hijos_a2.agregarFinal(a23);
		a2.setHijos(hijos_a2);
		System.out.println("Datos en preorden: "+a.preOrden());
		System.out.println("Datos por niveles: "+a.recorridoPorNiveles());
		System.out.println("Camino a hoja mas lejana: "+caminoAHojaMasLejana(a));
	}
}
