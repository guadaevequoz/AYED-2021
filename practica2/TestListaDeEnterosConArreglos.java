package tp02.ejercicio1;

import java.util.Scanner;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		//creo lista estatica
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		//llamo a la consola para poder leer de teclado
		Scanner consola = new Scanner(System.in);
		
		//leo numeros hasta que ingrese el -1
		System.out.println("Ingrese un numero:");
        int n = consola.nextInt();
        while(n != -1) {
        	l.agregarFinal(n);
        	System.out.println("Ingrese un numero:");
            n = consola.nextInt();
        }
        
        //imprimo la lista
        l.comenzar();
        while(!l.fin()) {
        	System.out.println(l.proximo());
        }

        
	}

}
