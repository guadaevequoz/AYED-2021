package tp04.ejercicio5;

import tp04.ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class TestEjercicio5 {
	public static Integer devolverMaximoPromedio (ArbolGeneral<AreaEmpresa> a) {
		
		Integer promMax=-1;
		Integer promAct=0;
		Integer cantN=0;
		ArbolGeneral<AreaEmpresa> arbol=null;
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		cola.encolar(a);
		cola.encolar(null);
		while(!cola.esVacia()) {
			arbol = cola.desencolar();
			if(arbol !=null) {
				ListaGenerica<ArbolGeneral<AreaEmpresa>> lHijos = arbol.getHijos();
				lHijos.comenzar();
				cantN++;
				promAct= promAct + arbol.getDato().getTiempo();
				while(!lHijos.fin()) {		
					cola.encolar(lHijos.proximo());	
				}	
			}else if(!cola.esVacia() | promAct !=0) {
				if (!cola.esVacia())
					cola.encolar(null);
				promAct= promAct / cantN;
				if (promAct > promMax)
					promMax=promAct;
				promAct=0;
				cantN=0;
			}
			
		}
		return promMax;
	}
	
	public static void main(String[] args) {
		ArbolGeneral<AreaEmpresa> a1 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("a",1000));
		ArbolGeneral<AreaEmpresa> a2 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("b",2000));
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
        hijos.agregarFinal(a1); hijos.agregarFinal(a2); 
        ArbolGeneral<AreaEmpresa> a = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("m",2), hijos);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos_a1 = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
        ArbolGeneral<AreaEmpresa> a11 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("c",4));
        ArbolGeneral<AreaEmpresa> a12 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("d",7));
        ArbolGeneral<AreaEmpresa> a13 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("e",25));
        hijos_a1.agregarFinal(a11); hijos_a1.agregarFinal(a12); hijos_a1.agregarFinal(a13);
        a1.setHijos(hijos_a1);
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos_a13 = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
        ArbolGeneral<AreaEmpresa> a131 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("j",500));
        ArbolGeneral<AreaEmpresa> a132 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("rodolfo",500));
        hijos_a13.agregarFinal(a131); hijos_a13.agregarFinal(a132);
        a13.setHijos(hijos_a13);
        
        ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos_a2 = new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();

        ArbolGeneral<AreaEmpresa> a21 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("z",195));
        ArbolGeneral<AreaEmpresa> a22 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("x",13));
        ArbolGeneral<AreaEmpresa> a23 = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("w",12));
        hijos_a2.agregarFinal(a21); hijos_a2.agregarFinal(a22); hijos_a2.agregarFinal(a23);
        a2.setHijos(hijos_a2);
        
        System.out.println("El promedio maximo es "+devolverMaximoPromedio(a));
	}

}
