/**
 * Autor: Michael Bince Bedoya Cano
 * Ultima fecha de modificaci�n: 17/12/2018 
 */

package Accenture.com.App;

/*
 * Una clase abstracta, es una clase que declara la existencia de m�todos pero
 * no la implementaci�n de dichos m�todos, pero estas clases pueden contener
 * m�todos no abstractos, pero al menos uno de los m�todos debe ser abstracto
 * para que cumpla con dicha definici�n.
 */

public abstract class SerVivo {

	/*
	 * En java tenemos diferentes modificadores de acceso, estos nos permiten
	 * ocultar o proteger a nuestros m�todos y propiedades seg�n convenga, en la
	 * carpeta ilustraciones pueden encontrar la imagen �modificadores de
	 * acceso.png� donde se muestra la funci�n de cada uno.
	 */

	String tipoDeSerVivo;

	protected String paisDeNacimiento;

	private String especie;

	private char sexo;

	private int edad;

	private int estatura;

	/*
	 * De acuerdo a las necesidades del programa que estemos construyendo deber�amos
	 * de usar los modificadores de acceso, es recomendado que todas nuestras
	 * variables de clase sean declaradas como privadas y que el acceso a estas se
	 * d� por medio de un intermediario, no directamente, por lo que podemos
	 * observar que para las variables que tenemos de tipo private, las modificamos
	 * por medio de los m�todos set y accedemos a ellas por medio de los m�todos
	 * get.
	 */

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	/*
	 * M�todo concreto o definido
	 */
	
	public void comer() {

		System.out.println("Comiendo alimento X");
	}
	
	/*
	 * M�todo abstracto    
	 */
	
	public abstract void dormir();

}
