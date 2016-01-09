package com.noegonmar.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.noegonmar.patern.singleton.AppUser;
import com.noegonmar.pattern.strategy.PatternContext;
import com.noegonmar.pattern.strategy.UsingAbstractFactory;
import com.noegonmar.pattern.strategy.UsingSingleton;


public class Main {

	public static void main(String[] args) throws IOException {

		// Login en la app
		ConsoleWrapper.printTemplate("WelcomeMessage", true);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Usuario: ");
        try {
			String user = br.readLine();
			String pass = ConsoleWrapper.promptPassword();
			
			//Eclipse debug pourpose
			if (pass.equals("")){
				System.out.println("Contraseña: ");
				pass = br.readLine();	
			}
			
			Login login = new Login(user, pass);
						
			// Comprobamos que el login ha sido correcto
			if (login.checkCredentials()){
				
				System.out.println("Nº Agente: ");
				String numagente = br.readLine();
				
				//Si estamos dentro, utilizamos singleton para tener el usuario
				//logado en toda la aplicación
				AppUser.getAppUser(user, numagente);
				
				int accion = 0;
				
				while (accion != Config.APP_OPCION_SALIR){
					ConsoleWrapper.printTemplate("MenuPpal", true);
			        try{
			            accion = Integer.parseInt(br.readLine());
			        }catch(NumberFormatException nfe){
			            System.err.println("Opción inválida!");
			        }
			        
			        /*
			         * Para el menú vamos a usar el patron Strategy para usar los diferentes patrones.
			         * Cada elemento del menú usará un patrón distinto,
			         * por lo que tendremos un contexto diferente según la opción seleccionada
			         * con ese contexto establecido, podremos usar un patrón u otro
			         */
			        PatternContext paternContext = null;
			        switch (accion){
			        case 1:
			        	//Uso del patrón Singleton
			        	UsingSingleton usingSingleton = new UsingSingleton();
			        	paternContext = new PatternContext(usingSingleton);
			        	paternContext.use();
			        	break;
			        case 2:
			        	/*
			        	 * A la hora de crear una multa, usamos el patrón AbstractFactory
			        	 * pero si creamos una multa de tipo RadarConCarcel
			        	 * utilizaremos también el patrón Adapter,
			        	 * ya que ese tipo de multa no respeta las clases/estructura implementada
			        	 * y hemos tenido que hacer un adapter para no modificar lo existente
			        	 */
			        	//Uso del patrón AbstractFactory
			        	UsingAbstractFactory usingAbstractFactory = new UsingAbstractFactory();
			        	paternContext = new PatternContext(usingAbstractFactory);
			        	paternContext.use();
			        	break;
			        case 3:
			        	
			        case 9:
			        	System.out.println("Hasta pronto!");
			        	break;
			        }
				}
			}
			else{
				System.out.println("Credenciales inválidas");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.exit(0);
	}

	

}
