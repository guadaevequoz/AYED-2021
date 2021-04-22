package tp03.ejercicio4;

import CargarArbol.CargarArbol;
import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	
	public static int retardoEnvio(ArbolBinario<Integer> arbol) {
		if(arbol.esVacio()) 
			return 0;
		else if(!arbol.esHoja()) {
			if(arbol.tieneHijoIzquierdo() && arbol.tieneHijoDerecho()) {
				if(retardoEnvio(arbol.getHijoIzquierdo()) > retardoEnvio(arbol.getHijoDerecho()))
					return arbol.getDato() + retardoEnvio(arbol.getHijoIzquierdo());
				else
					return arbol.getDato() + retardoEnvio(arbol.getHijoDerecho());
			}
			else if(arbol.tieneHijoIzquierdo()) 
				return arbol.getDato() + retardoEnvio(arbol.getHijoIzquierdo());
			else if(arbol.tieneHijoDerecho()) 
				return arbol.getDato() + retardoEnvio(arbol.getHijoDerecho());
		}
		else return arbol.getDato();
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargarArbol arbol = new CargarArbol();
		
		ArbolBinario<Integer> abb = arbol.CargarPositivos();
		abb.printInorden();
		System.out.println("El retardo del envio es:"+retardoEnvio(abb));
		
		
	}

}
