package com.noegonmar.pattern.strategy;

import com.noegonmar.patern.singleton.AppUser;

public class UsingAdapter extends Using{

	@Override
	public void usePattern() {
		
		//Usamos el patrón adapter
		
		AppUser appuser = AppUser.getAppUser();
		
		System.out.println("Usuario logado: "+appuser.getUsername());
		System.out.println("Nº de agente logado: "+appuser.getNumAgente());
		
	}

	@Override
	public String getPatternName() {
		return "Adapter";
	}

}