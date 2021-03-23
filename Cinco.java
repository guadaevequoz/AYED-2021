package practica1b;

public class Cinco {
	/*INCISO A*/
	public static int[] incisoA(int[] arreglo) {
		int[] array = new int[3];
		array[0]=-1; //max
		array[1]=9999; //min
		array[2]=0; //promedio
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] > array[0]) {
				array[0]=arreglo[i];
			}
			if(arreglo[i] < array[1]) {
				array[1]=arreglo[i];
			}
			array[2]=array[2]+arreglo[i];
		}
		array[2]=array[2]/arreglo.length;
		return array;
	}
	/*INCISO B*/
	public static void incisoB(IncisoB inciB, int[] arreglo) {
		inciB.setMax(-1);
		inciB.setMin(9999);
		inciB.setProm(0);
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] > inciB.getMax()) {
				inciB.setMax(arreglo[i]);
			}
			if(arreglo[i] < inciB.getMin()) {
				inciB.setMin(arreglo[i]);
			}
			inciB.setProm(inciB.getProm()+arreglo[i]);
		}
		inciB.setProm(inciB.getProm()/arreglo.length);
	}
	
	/*INCISO C*/
	
	
	public static void main(String[] args) {
		int[] arreglo = {1,2,3,4};	
		int[] arregloA = new int[3];
		arregloA=incisoA(arreglo);
		for(int i=0; i<3;i++) {
			System.out.println(arregloA[i]);
		}
		
		IncisoB inciB = new IncisoB();
		incisoB(inciB,arreglo);
		System.out.println(inciB.toString());
	}
}
