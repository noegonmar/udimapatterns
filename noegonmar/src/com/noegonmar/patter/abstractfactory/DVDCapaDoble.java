package com.noegonmar.patter.abstractfactory;

public class DVDCapaDoble extends DVD{

	@Override
    public Prototipo clone() {
            return new DVDCapaDoble();
    }
 
    @Override
    public String getCapacidad() {
            return "5.4GB";
    }
 
    @Override
    public String getNombre() {
            return "DVD Capa Doble";
    }
 
    @Override
    public String getPrecio() {
            return "7.00$";
    }

}
