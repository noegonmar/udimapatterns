package com.noegonmar.patter.factory;

public abstract class Factory {

	private int id;
	private double importe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	// importe del IVA que se paga
	public abstract double getImporteIva();
	
	// importe de la factura sin iva
	public abstract double getImporteNeto();
	
	// importe de la factura con iva
	public abstract double getImporteTotal();

}
