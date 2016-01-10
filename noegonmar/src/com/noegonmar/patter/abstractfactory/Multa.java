package com.noegonmar.patter.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Superclase auxiliar para encapsular los elementos comunes de los productos concretos
 * de la factoría (multaGrave y multaMuyGrave)
 * 
 * En ella se definenen una serie de atributos común a todos los productos.
 * 
 * Ademas nos es útil para que forme parte del patrón decorador que establece
 * los parámetros necesarios para poder crear un tipo de multa u otra.
 * 
 * @author noegonmar
 *
 */
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

	/**
	 * Método utilizado para implementar el patrón Decorador
	 * 
	 * Con él, podemos definir una base de "decoración" e ir decorando
	 * lo necesario según el tipo de multa que creemos.
	 */
	public void wizard() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Matrícula: ");
			this.matricula = br.readLine();
			System.out.println("Vel. Vía: ");
			this.velocidadVia = Integer.parseInt(br.readLine());
			System.out.println("Vel. Vehículo: ");
			this.velocidadVehiculo = Integer.parseInt(br.readLine());
			System.out.println("Sanción: ");
			this.sancion = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
