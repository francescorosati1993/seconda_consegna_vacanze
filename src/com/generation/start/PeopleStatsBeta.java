package com.generation.start;

import java.util.ArrayList;

import com.generation.entities.Persona;
import com.generation.library.Console;

public class PeopleStatsBeta
{

	public static void main(String[] args) 
	{
		
		ArrayList<Persona> persone = new ArrayList<Persona>();
		
		String cmd = "";
		
		do 
		{
			Persona persona = new Persona();
			
			Console.print("Inserisci nome persona:");
			persona.setNome(Console.readString());
			Console.print("Inserisci genere persona:");
			persona.setGenere(Console.readString());
			Console.print("Inserisci statura persona:");
			persona.setStatura(Console.readInt());
			Console.print("Inserisci reddito annuo persona:");
			persona.setReddito_annuo(Console.readInt());
			
			persone.add(persona); 
			
			Console.print("Vuoi inserire un'altra persona?");
			cmd = Console.readString();
			
		}while(cmd.equalsIgnoreCase("Si"));
		
		int numeroPersone = 0;
		int numeroUomini = 0;
		int numeroDonne = 0;
		
		int sommaRedditi = 0;
		int sommaRedditiUomini = 0;
		int sommaRedditiDonne = 0;
		
		int numeroFerdinandi = 0;
		
		int sommaStature = 0;
		
		for(Persona persona : persone)
		{
			
			if(persona.getGenere().equalsIgnoreCase("m") || persona.getGenere().equalsIgnoreCase("f") && persona.getReddito_annuo() >= 0)
			{
				sommaRedditi += persona.getReddito_annuo();
				sommaStature += persona.getStatura();
				numeroPersone++;
			}
			
			if(persona.getGenere().equalsIgnoreCase("m") && persona.getReddito_annuo() >= 0)
			{
				sommaRedditiUomini += persona.getReddito_annuo();
				numeroUomini++;
				if(persona.getNome().equalsIgnoreCase("Ferdinando"))
					numeroFerdinandi++;
			}

			if(persona.getGenere().equalsIgnoreCase("f") && persona.getReddito_annuo() >= 0)
			{
				sommaRedditiDonne += persona.getReddito_annuo();
				numeroDonne++;	
			}
			
			
			
		}
		
		int differenzaRedditi = sommaRedditiUomini - sommaRedditiDonne;
		double mediaStature = sommaStature / numeroPersone;
		
		Console.print("Numero di uomini: " + numeroUomini + " .");
		Console.print("Numero di donne: " + numeroDonne + " .");
		Console.print("Numero di persone: " + numeroPersone + " .");
		Console.print("Somma di tutti i redditi: " + sommaRedditi + " €.");
		Console.print("Somma di tutti i redditi degli uomini: " + sommaRedditiUomini + " €.");
		Console.print("Somma di tutti i redditi delle donne: " + sommaRedditiDonne + " €.");
		Console.print("Differenza tra i redditi degli uomini e i redditi delle donne: " + differenzaRedditi + " €.");
		Console.print("Numero di persone che si chiamano Ferdinando: " + numeroFerdinandi + " .");
		Console.print("Statura media delle persone: " + mediaStature + " cm.");
		
		/*
		 * l'utente inserir� tante persone
		 * cos� come prima inseriva tante stanze
		 * 
		 * di ogni persona inserir�:
		 * il nome
		 * il genere
		 * la statura
		 * il reddito annuo
		 * 
		 * 
		 * quando l'utente avr� smesso di inserire stampare:
		 * il numero di uomini
		 * il numero di donne
		 * il numero di persone
		 * la somma dei redditi di tutti
		 * la somma dei redditi degli uomini
		 * la somma dei redditi delle donne
		 * la differenza fra la somma dei redditi degli uomini e la somma dei redditi delle donne
		 * il numero di persone che si chiamano "Ferdinando"
		 * stampare anche la statura media delle persone
		 * come si fa la statura media? somma delle stature / numero delle persone
		 * 
		 * se l'utente inserisce un genere diverso da M o F,
		 * saltare quella persona e non contarla
		 * 
		 * lo stesso deve accadere se inserisce un reddito negativo
		 * 
		 */
		
		
	

	}
}
