/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1b;

public class Tres {

    public static void main(String[] args) {
        Estudiante[] eArray = new Estudiante[2];
        Profesor[] pArray;
        pArray = new Profesor[3];
        eArray[0]= new Estudiante("Guada","Evequoz","g@gmail.com","1A","115");
        eArray[1]= new Estudiante("Facu","Odone","fo@gmail.com","3A","Nose");
        pArray[0]= new Profesor("A","B","C","1","UNLP");
        pArray[1]= new Profesor("D","E","F","2","UBA");
        pArray[2]= new Profesor("G","H","I","3","UCA");
        
        System.out.println("Estudiantes:");
        for(int i=0; i<2;i++){
            System.out.println(eArray[i].tusDatos());
        }
        System.out.println("Profesores:");
        for(int i=0; i<3;i++){
            System.out.println(pArray[i].tusDatos());
        }
    }

}
