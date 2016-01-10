package com.noegonmar.pattern.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.app.CSVWrapper;

/**
 * Clase que forma parte del patrón Strategy.
 * En el menú principal tenemos la opción de eliminar una multa.
 * Para ello, redirigimos todo por el método "usePattern()" que define la
 * interfaz Using del patrón Strategy
 * 
 * Para eliminar una multa es necesario que nos digan el ID y con él,
 * podemos llamar al método concreto del wrapper de CSV: "CSVWrapper"
 * 
 * @author noegonmar
 *
 */
public class CSVEliminar extends Using {

	@Override
	public void usePattern() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Id Multa: ");
		String idMulta;
		try {
			idMulta = br.readLine();
			CSVWrapper csvw = new CSVWrapper();
			if (csvw.eliminar(idMulta)){
				System.out.println(">> Multa eliminada!");
			}else{
				System.out.println(">> No se ha encontrado la multa a eliminar");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getPatternName() {
		return "Strategy";
	}

}
