package com.generation.start;

import com.generation.library.Console;

public class HouseCalculatorDelucsExtra
{
	public static void main(String[] args)
	{
		int pmq = 0;
		
		do
		{
			Console.print("Quale è il prezzo al metro quadrato?");
			pmq = Console.readInt();
		
		}while(pmq <= 0);
		
		
		int areaTotale = 0;
		int numeroStanze = 0;
		
		int totaleAreaLiving = 0;
		int totaleAreaBagni = 0;
		int totaleAreaBalconi = 0;
		
		int numeroLiving = 0;
		int numeroBagni = 0;
		int numeroBalconi = 0;
		
		boolean goOn = true;
		
		do
		{
			Console.print("Inserisci tipo stanza: ");
			String tipoStanza = Console.readString();
			Console.print("Inserisci lato1 della stanza: ");
			int lato1 = Console.readInt();
			Console.print("Inserisci lato2 della stanza: ");
			int lato2 = Console.readInt();
			
			int areaStanza = lato1 * lato2;
			areaTotale += areaStanza;
			numeroStanze++;
			
			if(tipoStanza.equalsIgnoreCase("Living"))
			{
				totaleAreaLiving += areaStanza;
				numeroLiving++;
			}
			else if(tipoStanza.equalsIgnoreCase("Bagno"))
			{
				totaleAreaBagni += areaStanza;
				numeroBagni++;
			}
			else if(tipoStanza.equalsIgnoreCase("Balcone"))
			{
				totaleAreaBalconi += areaStanza;
				numeroBalconi++;
			}
			else
				Console.print("Dati non validi");
			
			
			Console.print("Vuoi aggiungere un'altra stanza?");
			goOn = Console.readString().equalsIgnoreCase("Si");
			
		}while(goOn);
		
		int prezzoCasa = (totaleAreaLiving + totaleAreaBagni) * pmq + (totaleAreaBalconi * pmq * 2);
		
		if(areaTotale >= 10 && numeroLiving >=1 && numeroBagni >=1)
			Console.print("La casa ha " + numeroStanze + " stanze. Di cui: " + numeroLiving + " living, " + numeroBagni + (numeroBagni > 1 ? " bagni, " : " bagno, ") + numeroBalconi + (numeroBalconi > 1 || numeroBalconi == 0 ? " balconi." : " balcone.")  + " L'area totale della casa è: " + areaTotale + " mq. Il prezzo della casa è: " + prezzoCasa + " €.");
		else
			Console.print("Casa non valida");
			
	
		/**
		 * l'utente inserisce il prezzo al metro quadro
		 * e poi inserisce i dati delle stanze
		 * 
		 * il programma deve produrre questi risultati:
		 * 
		 * area totale
		 * costo totale
		 * numero di bagni
		 * numero di living
		 * numero di balconi
		 * 
		 * calcolare l'area living
		 * calcolare l'area bagni
		 * calcolare l'area balconi
		 * 
		 * calcolare il prezzo di base ma i balconi contano doppio come area
		 * 
		 * dire se la casa � VALIDA
		 * una casa � VALIDA se:
		 * 		ha area >=10 mq
		 * 		ha almeno un bagno
		 * 		ha almeno una living
		 * 
		 * SPECIFICA
		 * 
		 * inizio ciclo1:
		 * 		chiedere pmq
		 * ripeti ciclo1 se pmq <=0
		 * 
		 * imposta totalearea = 0
		 * imposta totalareabagni = 0
		 * imposta totalearealiving = 0
		 * imposta totaleareabalcone = 0
		 * imposta numerobalconi = 0
		 * imposta numerostanze = 0
		 * imposta numerobagni = 0
		 * imposta numeroliving = 0
		 * 
		 * 
		 * inizio ciclo2:
		 * 		chiedere tipo stanza
		 * 		chiedere lato1 stanza
		 * 		chiedere lato2 stanza
		 * 		se lato1>0 e lato2>0: (se i dati son buoni)
		 * 			calcolare area stanza
		 * 			impostare totalearea = totalearea + area stanza		
		 * 			impostare numerostanze = numerostanze + 1
		 * 			se tipo stanza = living:
		 * 				impostare totalearealiving = totalearealiving + area stanza
		 * 				impostare numeroliving = numeroliving + 1
		 * 			se tipo stanza = balcone:
		 * 				impostare totaleareabalcone = totaleareabalcone + area stanza
		 * 				impostare numerobalconi = numerobalconi + 1
		 * 			se tipo stanza = bagno:
		 * 				impostare totaleareabagni = totaleareabagni + area stanza	
		 * 				numerobagni = numerobagni + 1		
		 * 		altrimenti:
		 * 			stampare "dati non validi"
		 * 
		 * 		chiedere se l'utente vuole continuare
		 * ripeti ciclo2 se l'utente vuole continuare
		 * 
		 * 
		 * imposta prezzocasa = (totalearealiving + totaleareabagni) * pmq + (totaleareabalcone * pmq *2)
		 * 
		 * se totalearea >=10 E numeroliving>=1 E numerobagni>=1:
		 * 		stampare messaggio coi dati della casa
		 * altrimenti
		 * 		stampare messaggio di errore "casa non valida"
		 * 
		 * 
		 * 
		 */
		
	}
	
}
