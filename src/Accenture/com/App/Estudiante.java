/**
 * Autor: Michael Bince Bedoya Cano
 * Ultima fecha de modificación: 17/12/2018 
 */
package Accenture.com.App;

/*
 * En el siguiente enlace podremos encontrar la definición de los pilares de la
 * programación orientada a objetos, lo cual estamos viendo de manera práctica.
 * http://www.utn.edu.ec/reduca/programacion/poo/pilares.html
 * 
 */

public class Estudiante extends Persona {

	private String universidadDondeEstudia;
	private String promedioAcademico;

	public String getUniversidadDondeEstudia() {
		return universidadDondeEstudia;
	}

	public void setUniversidadDondeEstudia(String universidadDondeEstudia) {
		this.universidadDondeEstudia = universidadDondeEstudia;
	}

	public String getPromedioAcademico() {
		return promedioAcademico;
	}

	public void setPromedioAcademico(String promedioAcademico) {
		this.promedioAcademico = promedioAcademico;
	}

	/*
	 * A continuación, podemos observar el método dormir() el cual es un método de
	 * la clase Persona y lo estamos redefiniendo a esto se le llama sobreescritura
	 * de métodos. La Sobreescritura es la forma por la cual una clase que hereda
	 * puede redefinir los métodos de su clase Padre, de esta manera puede crear
	 * nuevos métodos con el mismo nombre de su superclase.
	 */

	@Override
	public void dormir() {
		for (int i = 2; i < 5; i++) {
			System.out.println("\n"+super.getNombre()+" lleva durmiendo " + i + " horas");
		}

	}

}
