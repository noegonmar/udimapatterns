package com.noegonmar.patter.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public abstract class Multa {

	String idMulta;
	String fecha;
	String matricula;
	int velocidadVia;
	int velocidadVehiculo;
	int sancion;
	String agente;

	public String getIdMulta() {
		return idMulta;
	}

	public void setIdMulta(String idMulta) {
		this.idMulta = idMulta;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getVelocidadVia() {
		return velocidadVia;
	}

	public void setVelocidadVia(int velcidadVia) {
		this.velocidadVia = velcidadVia;
	}

	public int getVelocidadVehiculo() {
		return velocidadVehiculo;
	}

	public void setVelocidadVehiculo(int velocidadVehiculo) {
		this.velocidadVehiculo = velocidadVehiculo;
	}

	public int getSancion() {
		return sancion;
	}

	public void setSancion(int sancion) {
		this.sancion = sancion;
	}

	public String getAgente() {
		return agente;
	}

	public void setAgente(String agente) {
		this.agente = agente;
	}

	public void wizard() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Matrícula: ");
			this.matricula = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
