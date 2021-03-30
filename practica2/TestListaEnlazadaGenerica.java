package tp02.ejercicio2;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Guada","Evequoz","g@gmail.com", "1","A");
		Estudiante e2 = new Estudiante("Guado","Evequaz","g1@gmail.com", "1","A");
		Estudiante e3 = new Estudiante("Guadu","Evequez","g2@gmail.com", "1","A");
		Estudiante e4 = new Estudiante("Guadi","Evequiz","g3@gmail.com", "1","A");
		ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica<Estudiante>();
		l.agregarFinal(e1);
		l.agregarFinal(e2);
		l.agregarFinal(e3);
		l.agregarFinal(e4);
		l.comenzar();
        for(int i = 1;i<=l.tamanio();i++) {
            System.out.println(l.elemento(i).tusDatos());
        }
	}

}
