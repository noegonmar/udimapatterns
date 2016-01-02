package com.noegonmar.pattern.adapter;


public class Adaptador extends Objetivo{
	
	DVDCapaTriple dvdTriple = new DVDCapaTriple();

	@Override
	public void getNombre() {
		dvdTriple.getName();
		
	}

	@Override
	public void getPrecio() {
		dvdTriple.getPrice();
		
	}

	@Override
	public void getCapacidad() {
		dvdTriple.getCapacity();
		
	}

	

}
