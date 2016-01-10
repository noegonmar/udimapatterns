package com.noegonmar.pattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.app.CSVWrapper;

public class CSVEliminar extends Using {

	@Override
	public void usePattern() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Id Multa: ");
		String idMulta;
		try {
			idMulta = br.readLine();
			CSVWrapper csvw = new CSVWrapper();
			csvw.eliminar(idMulta);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getPatternName() {
		return "Strategy";
	}

}
