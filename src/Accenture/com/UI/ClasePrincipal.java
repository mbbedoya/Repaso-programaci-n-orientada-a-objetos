package Accenture.com.UI;

import Accenture.com.App.Estudiante;
import Accenture.com.App.Persona;

public class ClasePrincipal {

	public static void main(String[] arreglo) {

		//Declaraci�n de variable 
		Persona michael;
				
		//Instanciaci�n de la clase 
		michael = new Estudiante();
		
		
		michael.setNombre("Michael Bince");
		michael.comer("Pizza");
		michael.dormir();
	}

}
