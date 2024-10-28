
public class Main {

	public static void main(String[] args) {
		// Classe wrapper = fornisce un modo per utilizzare i tipi di dati primitivi come tipi di dati di riferimento
		// i tipi di dati di riferimento contengono metodi utili
		// possono essere utilizzati con le collezioni (es. ArrayList)
		
		//Es:
		//primitive  //wrapper  
		//---------  //------- si scrivono in questo modo tipo String
		// boolean     Boolean
		// char        Character
		// int         Integer
		// double      Double
		
		// Autoboxing = la conversione automatica che il compilatore Java 
		//              effettua tra i tipi primitivi e le rispettive classi wrapper di oggetti
		// Unboxing = l'inverso di autoboxing. Conversione automatica della classe wrapper in un tipo primitivo

		//facciamo qualche esempio
		//wrapper  variabile  assegnamo il valore usando l'Autoboxing di Java
		//Autoboxing
		  Boolean     a               = true;
		  Character   b               = 'a';
		  Integer     c               = 123;
		  Double      d               = 3.14;
		  String      e               ="Sono un wrapper";
		  Float       f               = 12.123f;
		 //Anche se ora le variabili sono di tipo riferimento possiamo utilizzarle come delle
		 //semplici variabili primitive tramite l' Unboxing di Java
		  
		 //Unboxing
		  
		  if(a==true && b =='a') {
			  System.out.println("Le uso come delle semplici classi primitive");
			  if(d==3.14 && c==123 && e.contains("Sono un wrapper")) {
				  System.out.println("Però posso utilizzare vari metodi utili su di essi");
			  }
		  }
		 /* ATTENZIONE
		  * Facendo in questo modo accedere ai valori di queste variabili sarà MOLTO più lento rispetto
		  * a delle semplici variabili primitive
		  */
	}

}
