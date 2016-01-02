package com.noegonmar.pattern.strategy;

// Strategy Pattern - class Context NOT IMPLEMENTS Strategy interface
public class Context {

	Strategy strategy;

	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	//Método de estrategia 'c'
	public void corta()
	{
		strategy.dividir();
	}
}
