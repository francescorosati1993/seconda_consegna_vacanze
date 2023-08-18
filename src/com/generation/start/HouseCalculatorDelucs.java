package com.generation.start;

import com.generation.library.Console;

public class HouseCalculatorDelucs
{
	public static void main(String[] args) 
	{
		
		Console.print("Quale è il prezzo al metro quadrato?");
		int pmq = Console.readInt();
		
		int areaTotale = 0;
		int numeroStanze = 0;
		
		boolean goOn = true;
		
		do
		{
			Console.print("Inserisci lato1 della stanza: ");
			int lato1 = Console.readInt();
			Console.print("Inserisci lato2 della stanza: ");
			int lato2 = Console.readInt();
			
			int areaStanza = lato1 * lato2;
			
			areaTotale += areaStanza;
			
			numeroStanze++;
			
			Console.print("Vuoi aggiungere un'altra stanza?");
			goOn = Console.readString().equalsIgnoreCase("Si");
			
		}while(goOn);
		
		double prezzo = areaTotale * pmq;
		
		Console.print("La casa è stata costruita su un cimitero indiano?");
		String response = Console.readString();
		
		if(response.equalsIgnoreCase("Si"))
			prezzo = prezzo * 0.8;
		
		String message = "La casa ha " + numeroStanze + " stanze. L'area totale della casa è di: " + areaTotale + " mq. Il prezzo della casa è: " + prezzo + " €.";
		
		Console.print(message);
		
		
	
		/*
		 * 
		 * chiedere pmq
		 * impostare totale area = 0
		 * impostare numero stanze = 0
		 * inizio ciclo: (do)
		 * 		chiedere lato1 stanza
		 * 		chiedere lato2 stanza
		 * 		calcolare area stanza
		 * 		impostare totale area = totale area + area stanza
		 * 		impostare numero stanze = numero stanze + 1
		 * 		chiedere all'utente se vuole continuare (goOn)
		 * ripeti ciclo se l'utente vuole continuare (tornare a 15) (while) 
		 * 
		 * impostare prezzo = totale area * pmq
		 * 
		 * chiedere all'utente se la casa � stata costruita su un cimitero indiano
		 * se la casa � stata costruita su un cimitero indiano:
		 * 		impostare prezzo = prezzo * 0.8
		 * 
		 * impostare message a area totale seguita da prezzo
		 * stampare message
		 * 
		 * 
		 */
			
		
		
	}
}
