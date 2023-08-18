package com.generation.entities;

public class Dish 
{
	private String name;
	private String type;
	private int kcal;
	private double price;
	
	
	public Dish() {}
	
	public Dish(String name, String type, int kcal, int price) 
	{
		this.name = name;
		this.type = type;
		this.kcal = kcal;
		this.price = price;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getType() 
	{
		return type;
	}
	
	public void setType(String type) 
	{
		this.type = type;
	}
	
	public int getKcal() 
	{
		return kcal;
	}
	
	public void setKcal(int kcal) 
	{
		this.kcal = kcal;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	
	
}
