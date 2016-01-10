package com.noegonmar.pattern.strategy;

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
