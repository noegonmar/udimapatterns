package com.noegonmar.pattern.adapter;

public class ElementAdapter extends Element{
	
	Cosa cosa = new Cosa();

	@Override
	public void touchElement() {
		cosa.cogerCosa();
	}

	@Override
	public void leaveElement() {
		cosa.soltarCosa();
		
	}

}
