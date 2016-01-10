package com.noegonmar.pattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.app.CSVWrapper;

/**
 * Clase que forma parte del patrón Strategy. En el menú principal tenemos la
 * opción de listar multas filtrando por matrícula. Para ello, redirigimos todo
 * por el método "usePattern()" que define la interfaz Using del patrón Strategy
 * 
 * Para listar una multa es necesario que nos digan el número de matrícula y con
 * él, podemos llamar al método concreto del wrapper de CSV: "CSVWrapper"
 * 
 * @author noegonmar
 *
 */
public class CSVListar extends Using {

	@Override
	public void usePattern() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Listar las multas de una matrícula dada
		String matricula;
		try {

			System.out.println("Matrícula: ");
			matricula = br.readLine();
			CSVWrapper csvw = new CSVWrapper();
			csvw.listar(matricula);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getPatternName() {
		return "Strategy";
	}

}
