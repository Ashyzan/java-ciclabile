package it.javaciclabile.rosa;


public class InteriCiclabile {
	
	private int[] arrayInteri  = new int[100];

	private int posizioneArray = 0;
	private int numElementi = 0; // mantiene l'ultima posizione , equivale a this.arrayInteri.length

//	Vogliamo realizzare una classe che contenga un elenco di interi e che ci permetta di ciclarli (dal primo all’ultimo).
//	Dovrà offrire due metodi :
//	- int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima volta che è stato invocato. Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)
//	- boolean hasAncoraElementi() (che deve restituire true se ci sono ancora elementi da restituire)
//	La classe deve avere un costruttore che prende come parametro un array di interi (che sarà l’elenco che viene gestito internamente)
//	Internamente alla classe vogliamo mantenere l’elenco di interi come array, no ArrayList o simili.
//	Bonus :
//	prevedere anche un costruttore che non prenda parametri e un metodo addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.
	
	
// costruttore per inizializzare l'array vuoto
	
	public InteriCiclabile(int [] arrayInteriInput) {
		 // costruttore che prende come parametro un array di interi
//mp
	System.out.println("numero posizioni array " + arrayInteriInput.length);
		for(int a : arrayInteriInput ) {
			this.arrayInteri[this.numElementi] = a;
			System.out.println("assegno indice: " + this.numElementi + " al valore " + a);
			this.numElementi++;

   	   }
	}
	
//	public int[] InteriCiclabile() {
//		return this.arrayInteri; // costruttore senza parametro
//		
//	}


	public int getNumeroElementi() {
		return this.numElementi; 
		
	}
	


	public int getElementoSuccessivo( ) { //restituisce l'elemento successivo all'elemento invocato, 
			int temp = this.posizioneArray;
			this.posizioneArray ++;
			return this.arrayInteri [temp];
		
	} 
	
	public boolean hasAncoraElementi() {

		if (posizioneArray == (numElementi -1) ) {
		return false;
		} else 
		return true;
	} //restituisce true se ci sono ancora elementi da restituire


	
	public void addElemento(int elemento) {
	
	this.arrayInteri[numElementi] = elemento;
	
	

	for(int i=0; i<=this.numElementi; i++ ) {
   	   	System.out.println("indice: " + i + " valore " + this.arrayInteri[i]);
		

   	   }
		this.numElementi++ ;	

}

	// tostring
	
	public String toString() {
		
		return "Stampo javaciclabile" + arrayInteri ;
	}
	
	// GETTER E SETTER 
	public int[] getArrayInteri() {
		return arrayInteri;
	}

	public void setArrayInteri(int[] arrayInteri) {
		this.arrayInteri = arrayInteri;
	}

	public int getPosizioneArray() {
		return posizioneArray;
	}

	public void setPosizioneArray(int posizioneArray) {
		this.posizioneArray = posizioneArray;
	}
	
}
