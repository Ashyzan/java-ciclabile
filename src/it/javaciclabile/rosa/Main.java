package it.javaciclabile.rosa;

public class Main {


	public static void main(String[] args) {
		

	//	InteriCiclabile prova = new InteriCiclabile({3, 5, 88, 900, 223});
		

	int[] age = {12, 4, 5};

  	 // loop through the array
 	 // using for loop

  	 System.out.println("Stampo contenuto dell'array:");
  	 for(int a : age) {
   	   System.out.println(a);
   	   }
	
  	
	InteriCiclabile prova = new InteriCiclabile(age);
		
	int numElementi= prova.getNumeroElementi();
 	System.out.println("Stampo n. totale elementi che è " + numElementi);

 	int elemento =18;
	prova.addElemento(elemento);
	
	System.out.println("Stampo n. totale elementi che è " + prova.getNumeroElementi());
	
	
	prova.toString();

	}
	
	

}
