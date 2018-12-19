package Accenture.com.UI;

import Accenture.com.App.Estudiante;
import Accenture.com.App.Persona;

public class ClasePrincipal {

	public static void main(String[] arreglo) {

		//Declaración de variable 
		Persona michael;
				
		//Instanciación de la clase 
		michael = new Estudiante();
		
		
		michael.setNombre("Michael Bince");
		michael.comer("Pizza");
		michael.dormir();
	}

}
