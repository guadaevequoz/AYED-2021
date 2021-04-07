package tp02.ejercicio4;

import java.util.Scanner;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.PilaGenerica;

public class TestBalanceo {
	
	private static boolean esBalancedo(String expr) {
		ListaGenerica<Character> apertura = new ListaEnlazadaGenerica<Character>();
		apertura.agregarFinal('(');
		apertura.agregarFinal('[');
		apertura.agregarFinal('{');
		
		ListaGenerica<Character> cierre = new ListaEnlazadaGenerica<Character>();
		cierre.agregarFinal(')');
		cierre.agregarFinal(']');
		cierre.agregarFinal('}');
		
		PilaGenerica<Character> pila = new PilaGenerica<Character>();
		
		Character actual,elem;
		for(int i=0; i<expr.length(); i++) {
			actual = expr.charAt(i);
			
			if(apertura.incluye(actual))
				pila.apilar(actual);
			else {
				elem = pila.desapilar();
				if(apertura.posicion(elem) != cierre.posicion(actual))
					return false;
			}
		}
		if(!pila.esVacia())
			return false;
		
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner consola = new Scanner(System.in);
		System.out.println("Por favor ingrese uyn string: ");
		String s = consola.nextLine();
		consola.close();
		
		System.out.println();
		if(esBalanceado(s))
			System.out.println("La expresion " + s + " esta balanceada");
		else System.out.println("La expresion "+ s +" no esta balanceada");
	}

}
