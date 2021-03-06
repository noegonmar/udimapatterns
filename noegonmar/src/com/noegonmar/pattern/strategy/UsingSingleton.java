package com.noegonmar.pattern.strategy;

import com.noegonmar.patern.singleton.AppUser;

/**
 * Algorimto que usa el patrón Singleton a través del patrón Strategy
 * 
 * Extiende de Using e implementa el método usePattern() para formar parte de la estrategia
 * 
 * @author noegonmar
 *
 */
public class UsingSingleton extends Using {

	/**
	 * Usar Singleton es muy sencillo, tan sólo hay que instanciar un objeto de
	 * la clase que implementa Singleton, y dicha clase ya nos devolverá el
	 * objeto si se a creado con anterioridad.
	 */
	@Override
	public void usePattern() {

		//Instanciamos el objeto
		AppUser appuser = AppUser.getAppUser();
		
		System.out.println("Usuario logado: " + appuser.getUsername());
		System.out.println("Nº de agente logado: " + appuser.getNumAgente());

	}

	@Override
	public String getPatternName() {
		return "Singleton";
	}

}