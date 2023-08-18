package com.generation.entities;

public class Persona 
{
	private String nome;
	private String genere;
	private int statura;
	private int reddito_annuo;
  
	public Persona() {}
  
	public Persona(String nome, String genere, int statura, int reddito_annuo) 
	{
		this.nome = nome;
		this.genere = genere;
		this.statura = statura;
		this.reddito_annuo = reddito_annuo;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getGenere() 
	{
		return genere;
	}
	
	public void setGenere(String genere) 
	{
		this.genere = genere;
	}
	
	public int getStatura() 
	{
		return statura;
	}
	
	public void setStatura(int statura) 
	{
		this.statura = statura;
	}
	
	public int getReddito_annuo() 
	{
		return reddito_annuo;
	}
	
	public void setReddito_annuo(int reddito_annuo) 
	{
		this.reddito_annuo = reddito_annuo;
	}
	  
  
}
