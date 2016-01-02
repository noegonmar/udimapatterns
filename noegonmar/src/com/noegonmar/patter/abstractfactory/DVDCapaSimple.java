package com.noegonmar.patter.abstractfactory;

public class DVDCapaSimple extends DVD{

	@Override
    public Prototipo clone() {
            return new DVDCapaSimple();
    }
 
    @Override
    public String getCapacidad() {
            return "4.7GB";
    }
 
    @Override
    public String getNombre() {
            return "DVD Capa Simple";
    }
 
    @Override
    public String getPrecio() {
            return "5.00$";
    }

}
