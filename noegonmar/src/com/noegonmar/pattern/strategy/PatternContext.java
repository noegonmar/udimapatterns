package com.noegonmar.pattern.strategy;

/**
 * Clase parte del patrón Strategy. En ella se configura un objeto "usingPatern"
 * que implementará la estrategia concreta a seguir.
 * 
 * El método "use" actua como punto común de entrada a las diferentes estrategias
 * Como este patrón (estrategia) se ha usado para hacer uso de otros patrones,
 * imprimimos por pantalla el patrón que vamos a usar.
 * 
 * Además, las clases CSVEliminar y CSVListar simplemente forman parte del patrón 
 * Strategy, con lo que cuando las usemos, estaremos usando el patrón Strategy
 * sin usar otro más. 
 * 
 * Por el contrario, si decidimos crear una multa, o ver el usuario logado, lo que 
 * estaremos haciendo es, a través del patrón strategy, usar los patrones
 * AbstractFactory o Singleton respectivamente.
 * 
 * @author noegonmar
 *
 */
public class PatternContext {
	Using usingPattern;

	public PatternContext(Using usingPattern) {
		this.usingPattern = usingPattern;
	}

	public void setPatternContext(Using usingPattern) {
		this.usingPattern = usingPattern;
	}

	public void use() {
		System.out.println("----------  Usando patrón "
				+ usingPattern.getPatternName() + "  ----------");

		usingPattern.usePattern();

		System.out.println("---------- Fin del patrón "
				+ usingPattern.getPatternName() + " -----------");
	}
}
