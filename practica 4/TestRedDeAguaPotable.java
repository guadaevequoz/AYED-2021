package tp04.ejercicio7;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class TestRedDeAguaPotable {

	public static void main(String[] args) {
		ArbolGeneral<String> a1 = new ArbolGeneral<String>("3");
        ArbolGeneral<String> a2 = new ArbolGeneral<String>("5");
        ListaGenerica<ArbolGeneral<String>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<String>>();
        hijos.agregarFinal(a1); hijos.agregarFinal(a2); 
        ArbolGeneral<String> a = new ArbolGeneral<String>("8", hijos);
        ListaGenerica<ArbolGeneral<String>> hijos_a1 = new ListaEnlazadaGenerica<ArbolGeneral<String>>();
        ArbolGeneral<String> a11 = new ArbolGeneral<String>("4");
        ArbolGeneral<String> a12 = new ArbolGeneral<String>("7");
        ArbolGeneral<String> a13 = new ArbolGeneral<String>("6");
        hijos_a1.agregarFinal(a11); hijos_a1.agregarFinal(a12); hijos_a1.agregarFinal(a13);
        a1.setHijos(hijos_a1);
        ListaGenerica<ArbolGeneral<String>> hijos_a13 = new ListaEnlazadaGenerica<ArbolGeneral<String>>();
        ArbolGeneral<String> a131 = new ArbolGeneral<String>("2");
        ArbolGeneral<String> a132 = new ArbolGeneral<String>("5");
        hijos_a13.agregarFinal(a131);
        hijos_a13.agregarFinal(a132);
        a13.setHijos(hijos_a13);

        ListaGenerica<ArbolGeneral<String>> hijos_a2 = new ListaEnlazadaGenerica<ArbolGeneral<String>>();

        ArbolGeneral<String> a21 = new ArbolGeneral<String>("1");
        ArbolGeneral<String> a22 = new ArbolGeneral<String>("9");
        ArbolGeneral<String> a23 = new ArbolGeneral<String>("10");
        hijos_a2.agregarFinal(a21); hijos_a2.agregarFinal(a22); hijos_a2.agregarFinal(a23);
        a2.setHijos(hijos_a2);
        
        RedDeAguaPotable red = new RedDeAguaPotable(a);
        System.out.println(red.minimoCaudal(1000));

	}

}
