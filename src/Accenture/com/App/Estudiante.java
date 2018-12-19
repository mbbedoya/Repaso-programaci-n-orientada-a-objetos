/**
 * Autor: Michael Bince Bedoya Cano
 * Ultima fecha de modificaci�n: 17/12/2018 
 */
package Accenture.com.App;

/*
 * En el siguiente enlace podremos encontrar la definici�n de los pilares de la
 * programaci�n orientada a objetos, lo cual estamos viendo de manera pr�ctica.
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
	 * A continuaci�n, podemos observar el m�todo dormir() el cual es un m�todo de
	 * la clase Persona y lo estamos redefiniendo a esto se le llama sobreescritura
	 * de m�todos. La Sobreescritura es la forma por la cual una clase que hereda
	 * puede redefinir los m�todos de su clase Padre, de esta manera puede crear
	 * nuevos m�todos con el mismo nombre de su superclase.
	 */

	@Override
	public void dormir() {
		for (int i = 2; i < 5; i++) {
			System.out.println("\n"+super.getNombre()+" lleva durmiendo " + i + " horas");
		}

	}

}
