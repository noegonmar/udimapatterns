package com.noegonmar.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.noegonmar.patter.abstractfactory.Multa;
import com.noegonmar.patter.abstractfactory.MultaGraveConPuntos;
import com.noegonmar.patter.abstractfactory.MultaGraveSinPuntos;
import com.noegonmar.patter.abstractfactory.MultaMuyGraveConPuntos;

/**
 * Clase manejadora de ficheros CSV's
 * 
 * es llamada desde CSVEliinar y CSVListar, ambas clases forman parte del patrón Strategy
 * y simplementen llaman al método correspondiente de esta clase.
 * 
 * La encapsulación de los métodos en el wrapper hace más claro su funcionamiento
 * 
 * @author noegonmar
 *
 */
public class CSVWrapper {

	public int listar(String matricula) {

		String csvFile = "db/multas.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		int encontradas = 0;
		
		try {

			br = new BufferedReader(new FileReader(csvFile));
			int i = 0;

			ArrayList<Multa> arrMultas = new ArrayList<Multa>();

			while ((line = br.readLine()) != null) {

				if (i == 0) {
					i++;
					continue; // Nos saltamos la cabecera
				}

				String[] multa = line.split(cvsSplitBy);

				tipoMulta tm = tipoMulta.valueOf(multa[1]);
				switch (tm) {
				case MGSP:
					MultaGraveSinPuntos mgsp = new MultaGraveSinPuntos();
					mgsp.setIdMulta(multa[0]);
					mgsp.setFecha(multa[2]);
					mgsp.setMatricula(multa[3]);
					mgsp.setVelocidadVia(Integer.parseInt(multa[4]));
					mgsp.setVelocidadVehiculo(Integer.parseInt(multa[5]));
					mgsp.setSancion(Integer.parseInt(multa[6]));
					mgsp.setAgente(multa[8]);

					arrMultas.add(mgsp);
					break;
				case MGCP:
					MultaGraveConPuntos mgcp = new MultaGraveConPuntos();
					mgcp.setIdMulta(multa[0]);
					mgcp.setFecha(multa[2]);
					mgcp.setMatricula(multa[3]);
					mgcp.setVelocidadVia(Integer.parseInt(multa[4]));
					mgcp.setVelocidadVehiculo(Integer.parseInt(multa[5]));
					mgcp.setSancion(Integer.parseInt(multa[6]));
					mgcp.setPuntos(Integer.parseInt(multa[7]));
					mgcp.setAgente(multa[8]);

					arrMultas.add(mgcp);
					break;
				case MMGCP:
					MultaMuyGraveConPuntos mmgcp = new MultaMuyGraveConPuntos();
					mmgcp.setIdMulta(multa[0]);
					mmgcp.setFecha(multa[2]);
					mmgcp.setMatricula(multa[3]);
					mmgcp.setVelocidadVia(Integer.parseInt(multa[4]));
					mmgcp.setVelocidadVehiculo(Integer.parseInt(multa[5]));
					mmgcp.setSancion(Integer.parseInt(multa[6]));
					mmgcp.setPuntos(Integer.parseInt(multa[7]));
					mmgcp.setAgente(multa[8]);
					mmgcp.setCarcel(multa[9]);

					arrMultas.add(mmgcp);
					break;
				}
			}

			
			for (i = 0; i < arrMultas.size(); i++) {				
				if (matricula.equals("*") || matricula.equals(arrMultas.get(i).getMatricula())) {
					System.out.println(arrMultas.get(i).toString());
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return encontradas;
	}

	public boolean eliminar(String idMulta) throws IOException {

		boolean encontrada = false;

		String csvFile = "db/multas.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		File csv = new File(csvFile);
		File tempFile = new File("db/multas.csvtmp");
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		try {

			br = new BufferedReader(new FileReader(csvFile));
			int i = -1;

			while ((line = br.readLine()) != null) {
				i++;
				if (i == 0) {
					writer.write(line + System.getProperty("line.separator"));
					continue; // Nos saltamos la cabecera
				}

				String[] multa = line.split(cvsSplitBy);

				if (multa[0].equals(idMulta)) {
					encontrada = true;
					continue;
				}
				writer.write(line + System.getProperty("line.separator"));
			}

			writer.close();
			br.close();

			tempFile.renameTo(csv);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return encontrada;
	}

}