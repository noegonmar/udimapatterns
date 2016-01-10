package com.noegonmar.pattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.app.CSVWrapper;

public class CSVListar extends Using {

	@Override
	public void usePattern() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Listar las multas de una matrícula dada
		System.out.println("Matrícula: ");
		String matricula;
		try {
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
