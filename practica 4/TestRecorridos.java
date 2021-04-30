package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class TestRecorridos {

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
		System.out.println("Datos en posorden: "+a.posOrden());
		System.out.println("Datos en inorden: "+a.inOrden());
		System.out.println("Datos por niveles: "+a.recorridoPorNiveles());
		System.out.println("Altura: "+a.altura());
		System.out.println("Nivel del dato 2: "+a.nivel(2));
		System.out.println("Ancho: "+a.ancho());
		System.out.println("Ancestro: "+a.esAncestro(3,7));
	}
}
