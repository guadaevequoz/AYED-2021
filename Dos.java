/*
Escriba un método de clase que dado un número n devuelva un nuevo arreglo de
tamaño n con los n primeros múltiplos enteros de n mayores o iguales que 1.
Ejemplo: f(5) = [5; 10; 15; 20; 25]; f(k) = {nk/k : 1..k}
Agregue al programa la posibilidad de probar con distintos valores de n
ingresándolos por teclado, mediante el uso de System.in. La clase Scanner permite
leer de forma sencilla valores de entrada. 
 */
package practica1b;

import java.util.Scanner;

public class Dos {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int n = consola.nextInt();
        int[] multiplo = new int[n];
        multiplo = multiplos(n);
        for(int i=0; i<n; i++){
            System.out.println((i+1) + ") " + multiplo[i]);
        }
    }

    public static int[] multiplos(int num){
        int[] multiplosV = new int[num];
        for(int i=0; i<num; i++){
            multiplosV[i]= num * (i+1);
        }
        return multiplosV;
    }
}
