package com.noegonmar.patter.abstractfactory;

public class FabricaDiscosCapaDoble implements FabricaDiscos {
	 
    @Override
    public BluRay crearBluRay() {
            return new BluRayCapaDoble();
    }

    @Override
    public DVD crearDVD() {
            return new DVDCapaDoble();
    }

}
