package com.generation.start;

import java.util.ArrayList;

import com.generation.entities.Dish;
import com.generation.library.Console;

public class DishStats
{
	public static void main(String[] args)
	{
		
		String cmd = "";
		
		ArrayList<Dish> dishes = new ArrayList<Dish>();
		
		do 
		{
			Dish dish = new Dish();
			
			Console.print("Inserisci nome piatto");
			dish.setName(Console.readString());
			Console.print("Inserisci tipo piatto");
			dish.setType(Console.readString());
			Console.print("Inserisci kcal piatto");
			dish.setKcal(Console.readInt());
			Console.print("Inserisci prezzo piatto");
			dish.setPrice(Console.readDouble());
			
			dishes.add(dish);
			
			Console.print("Vuoi inserire un nuovo piatto?");
			cmd = Console.readString();
			
			
		}while(cmd.equalsIgnoreCase("si"));
		
		//Tutti i piatti
		
		int totalKcal = 0;
		double totalPrice = 0;
		int totalDish = 0;
		
		
		//Primi Piatti
		
		int totalFirstDishKcal = 0;
		double totalFirstDishPrice = 0;
		int totalFirstDish = 0;
		
		
		//Secondi Piatti
		
		int totalSecondDishKcal = 0;
		double totalSecondDishPrice = 0;
		int totalSecondDish = 0;
		
		
		//Dolci
		
		int totalDessertKcal = 0;
		double totalDessertPrice = 0;
		int totalDessert = 0;
		
		
		//Ciclo for-each per ciclare tutti i piatti inseriti dall'utente
		
		for(Dish dish : dishes) 
		{
			totalKcal += dish.getKcal();
			totalPrice += dish.getPrice();
			totalDish ++;
			
			if(dish.getType().equalsIgnoreCase("primo"))
			{
				totalFirstDishKcal += dish.getKcal();
				totalFirstDishPrice += dish.getPrice();
				totalFirstDish++;
			}
			
			if(dish.getType().equalsIgnoreCase("secondo"))
			{
				totalSecondDishKcal += dish.getKcal();
				totalSecondDishPrice += dish.getPrice();
				totalSecondDish++;
			}
			
			if(dish.getType().equalsIgnoreCase("dolce"))
			{
				totalDessertKcal += dish.getKcal();
				totalDessertPrice += dish.getPrice();
				totalDessert++;
			}	
		}
	
		
		//Media kcal di tutti i piatti
		double dishKcalAverage = totalKcal / totalDish;
		
		//Media prezzi di tutti i piatti
		double dishPriceAverage = totalPrice / totalDish;
		
		
		
		//Media kcal primi piatti
		double firstDishKcalAverage;
		
		if(totalFirstDishKcal !=0 && totalFirstDish != 0)
			firstDishKcalAverage = totalFirstDishKcal / totalFirstDish;
		else
			firstDishKcalAverage = 0;
		
		
		//Media prezzi primi piatti
		double firstDishPriceAverage;
		
		if(totalFirstDishPrice !=0 && totalFirstDish != 0)
			firstDishPriceAverage = totalFirstDishPrice / totalFirstDish;
		else
			firstDishPriceAverage = 0;
		
		
		//Media kcal secondi piatti
		double secondDishKcalAverage;
		
		if(totalSecondDishKcal !=0 && totalSecondDish != 0)
			secondDishKcalAverage = totalSecondDishKcal / totalSecondDish;
		else
			secondDishKcalAverage = 0;
		
		
		//Media prezzi secondi piatti
		double secondDishPriceAverage;
		
		if(totalSecondDishPrice !=0 && totalSecondDish != 0)
			secondDishPriceAverage = totalSecondDishPrice / totalSecondDish;
		else
			secondDishPriceAverage = 0;
		
		
		//Media kcal dolci 
		double dessertKcalAverage;
		
		if(totalDessertKcal !=0 && totalDessert != 0)
			dessertKcalAverage = totalDessertKcal / totalDessert;
		else
			dessertKcalAverage = 0;
		
		
		//Media prezzi dolci
		double dessertPriceAverage;
		
		if(totalDessertPrice !=0 && totalDessert != 0)
			dessertPriceAverage = totalDessertPrice / totalDessert;
		else
			dessertPriceAverage = 0;
		
		
		Console.print("Media totale kcal: " + dishKcalAverage);
		Console.print("Media totale prezzi: " + dishPriceAverage);
		Console.print("Media kcal primi piatti: " + firstDishKcalAverage);
		Console.print("Media kcal secondi piatti: " + secondDishKcalAverage);
		Console.print("Media kcal dolci: " + dessertKcalAverage);
		Console.print("Media prezzi primi piatti: " + firstDishPriceAverage);
		Console.print("Media prezzi secondi piatti: " + secondDishPriceAverage);
		Console.print("Media prezzi dolci: " + dessertPriceAverage);
		
		
		/**
		 * Un pranzo di classe da Borghese
		 * 
		 * far inserire all'utente:
		 * nome del piatto
		 * il tipo del piatto (primo, secondo, dolce)
		 * kcal del piatto 
		 * prezzo del piatto
		 * 
		 * chiedere se vuole aggiungerne un altro
		 * se si: richiedere l'inserimento di un altro piatto 
		 * 
		 * altrimenti stampare :
		 * - la media totale delle kcal
		 * - la media totale dei prezzi (paghiamo alla romana)
		 * 
		 * - la media delle kcal dei primi
		 * - la media delle kcal dei secondi
		 * - la media delle kcal dei dolci
		 * 
		 * - la media dei prezzi dei primi
		 * - la media dei prezzi secondi
		 * - la media dei prezzi dolci
		 * 
		 */
	
		
	}
}
