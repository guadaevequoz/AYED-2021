package tp02.ejercicio3;

import tp02.ejercicio2.Estudiante;

public class Ejer3 {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Guada","Evequoz","g@gmail.com", "1","A");
		Estudiante e2 = new Estudiante("Guado","Evequaz","g1@gmail.com", "1","A");
		Estudiante e3 = new Estudiante("Guadu","Evequez","g2@gmail.com", "1","A");
		Estudiante e4 = new Estudiante("Guadi","Evequiz","g3@gmail.com", "1","A");
		PilaGenerica<Estudiante> p = new PilaGenerica<Estudiante>();
		ColaGenerica<Estudiante> c = new ColaGenerica<Estudiante>();
		c.encolar(e4);
		c.encolar(e2);
		System.out.println(c.tope().tusDatos());
		p.apilar(e1);
		p.apilar(e2);
		p.apilar(e3);
		p.apilar(e4);
		System.out.println(p.tope().tusDatos());
	}

}
