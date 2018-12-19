/**
 * Autor: Michael Bince Bedoya Cano
 * Ultima fecha de modificación: 17/12/2018 
 */

package Accenture.com.App;

/*
 * Una clase abstracta, es una clase que declara la existencia de métodos pero
 * no la implementación de dichos métodos, pero estas clases pueden contener
 * métodos no abstractos, pero al menos uno de los métodos debe ser abstracto
 * para que cumpla con dicha definición.
 */

public abstract class SerVivo {

	/*
	 * En java tenemos diferentes modificadores de acceso, estos nos permiten
	 * ocultar o proteger a nuestros métodos y propiedades según convenga, en la
	 * carpeta ilustraciones pueden encontrar la imagen “modificadores de
	 * acceso.png” donde se muestra la función de cada uno.
	 */

	String tipoDeSerVivo;

	protected String paisDeNacimiento;

	private String especie;

	private char sexo;

	private int edad;

	private int estatura;

	/*
	 * De acuerdo a las necesidades del programa que estemos construyendo deberíamos
	 * de usar los modificadores de acceso, es recomendado que todas nuestras
	 * variables de clase sean declaradas como privadas y que el acceso a estas se
	 * dé por medio de un intermediario, no directamente, por lo que podemos
	 * observar que para las variables que tenemos de tipo private, las modificamos
	 * por medio de los métodos set y accedemos a ellas por medio de los métodos
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
	 * Método concreto o definido
	 */
	
	public void comer() {

		System.out.println("Comiendo alimento X");
	}
	
	/*
	 * Método abstracto    
	 */
	
	public abstract void dormir();

}
