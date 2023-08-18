package com.generation.start;

import com.generation.library.Console;

public class OsteopathStats
{

	public static void main(String[] args)
	{
		boolean goOn = true;
		int prezzoTotale = 0;
		
		do
		{
		
		int orario = 0;
		
		do
		{
			Console.print("Inserire orario prenotazione: ");
			orario = Console.readInt();
			
		}while(orario < 9 || orario > 13 && orario < 15 || orario > 19 );
		
		
		
		String trattamento = "";
		
		do
		{
			Console.print("Che tipo di trattamento vuoi fare?");
			trattamento = Console.readString();
			
		}while(!trattamento.equalsIgnoreCase("Posturale") && !trattamento.equalsIgnoreCase("Massaggio") && !trattamento.equalsIgnoreCase("Riallineamento"));
		
		
		
		int durataTrattamento = 0;
		
		do
		{
			Console.print("Quanto vuoi che duri il trattamento?");
			durataTrattamento = Console.readInt();
			
		}while(durataTrattamento < 30 || durataTrattamento > 120);
		
		double costo = 0;
		
		if(trattamento.equalsIgnoreCase("Posturale"))
			costo = durataTrattamento * 0.5;
		
		if(trattamento.equalsIgnoreCase("Massaggio"))
			costo = durataTrattamento * 0.66;
		
		if(trattamento.equalsIgnoreCase("Riallineamento"))
			costo = durataTrattamento * 0.83;
		
		Console.print("Trattamento: " + trattamento + ". Costo: " + costo + " €. Orario: " + orario + ":00. Durata: " + durataTrattamento + " minuti.");
		
		prezzoTotale += costo;
		
		Console.print("Vuoi prenotare un altro appuntamento?");
		goOn = Console.readString().equalsIgnoreCase("Si");
		
		
		Console.print("Il prezzo totale degli appuntamenti è: " + prezzoTotale + " €. " );
		
		}while(goOn);
		
		Console.print("Arrivederci e a presto");
		
		/**
		 * 
		 * siamo aperti dalle 9 alle 13 e dalle 15 alle 19
		 * i trattamenti che offriamo sono :
		 * - posturale (30 euro l'ora)
		 * - massaggio (40 euro l'ora)
		 * - riallineamento (50 euro l'ora)
		 * 
		 * chiedere all'utente:
		 * l'orario della prenotazione
		 * (facciamo attenzione che l'orario che inserisce l'utente sia valido,
		 *  se non � valido, glielo richiediamo affinch� sia valido)
		 *  
		 * il trattamento che vuole fare tra quelli da noi previsti
		 * (se il trattamento inserito non � valido, glielo richiediamo)
		 * 
		 * chiediamo la durata del trattamento(minimo 30 minuti, massimo 120 minuti)
		 * (se la durata non � valida, gliela richiediamo)
		 * 
		 * stampare la ricevuta:
		 * il nome, il costo, l'orario e la durata del trattamento
		 * 
		 * chiedere all'utente se vuole prenotare un secondo trattamento
		 * se si: ripetere tutti i procedimenti
		 * 		e stampare il prezzo totale dei trattamenti prenotati
		 * altrimenti stampare "arrivederci e a presto!"
		 * 
		 * 
		 */
		
		
	}
	

}
