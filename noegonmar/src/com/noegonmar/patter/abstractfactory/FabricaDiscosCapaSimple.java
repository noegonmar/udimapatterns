package com.noegonmar.patter.abstractfactory;

public class FabricaDiscosCapaSimple implements FabricaDiscos {
	 
    @Override
    public BluRay crearBluRay() {
            return new BluRayCapaSimple();
    }

    @Override
    public DVD crearDVD() {
            return new DVDCapaSimple();
    }

}
