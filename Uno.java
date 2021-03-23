/*
 Escriba tres métodos de clase (static) que reciban por parámetro dos números
enteros (tipo int) a y b e impriman todos los números enteros comprendidos entre
a; b (inclusive), uno por cada línea en la salida estándar. Para ello, dentro de una
nueva clase escriba un método por cada uno de los siguientes incisos:
a. Que realice lo pedido con un for.
b. Que realice lo pedido con un while.
c. Que realice lo pedido sin utilizar estructuras de control iterativas (for,
while, do while).
Por último, escriba en el método de clase main el llamado a cada uno de los
métodos creados, con valores de ejemplo.
En su computadora, ejecute el programa y verifique que se cumple con lo pedido. 
 */
package practica1b;

public class Uno {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        imprimirFor(a,b);
        imprimirWhile(a,b);
        imprimir(a,b);
    }
    
    public static void imprimirFor(int a, int b){
        for(int i=a; i<=b; i++){
            System.out.println(i);
        }
    }
    
    public static void imprimirWhile(int a, int b){
        int i = a;
        while(i<=b){
            System.out.println(i);
            i++;
        }
    }
    
    public static void imprimir(int a, int b){
        if(a <= b){
            System.out.println(a);
            a++;
            imprimir(a,b);
        }
    }
}
