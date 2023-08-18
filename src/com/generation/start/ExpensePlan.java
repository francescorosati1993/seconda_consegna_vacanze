package com.generation.start;

import com.generation.library.Console;

public class ExpensePlan
{

	public static void main(String[] args) 
	{
		int spesa = 0;
		String cmd = "";
		
		do
		{
			Console.print("Scrivi il costo della spesa");
			spesa += Console.readInt();
			
			Console.print("Vuoi aggiungere un'altra spesa?");
			cmd = Console.readString();
			
		}while(cmd.equalsIgnoreCase("Si"));
		
		Console.print("Il totale delle spese è: " + spesa + " €.");
		
		/*
		 * 1 L'utente inserir� un numero intero (una spesa)
		 * 2 la spesa verr� aggiunta a un totale
		 * 3 chiederemo all'utente: vuoi aggiungere altro?
		 * 	 se dice di s�, torneremo al punto 1
		 *   se dice di no, andremo al 4
		 *   
		 * 4 stampa totale spese
		 * 
		 */
		
	}
}

