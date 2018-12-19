/**
 * Autor: Michael Bince Bedoya Cano
 * Ultima fecha de modificaci�n: 17/12/2018 
 */
package Accenture.com.App;

/*
 * Una interfaz en Java es una colecci�n de m�todos abstractos y propiedades
 * constantes.
 */

public interface InterfaceSerVivo {

	/*
	 * Tenemos la propiedad NOMBRE_DEL_PROGRAMA la cual es una constante, lo que es
	 * una variable del sistema que mantiene un valor inmutable a lo largo de toda
	 * la vida del programa.
	 */

	public final static String NOMBRE_DEL_PROGRAMA = "Repaso de programaci�n orientada a objetos";

	/*
	 * Tenemos los m�todos caminar(), correr() y saltar(), los cuales son m�todos
	 * abstractos que son un m�todos declarados, pero no implementados, es decir, es
	 * un m�todo del que solo se escribe su nombre, par�metros y tipo devuelto
	 * (Conocido como firma) pero no su c�digo interno o l�gica de este.
	 * 
	 */

	public int caminarEnMetros(int kilometros);

	public int correrEnMetros(int kilometros);

	public void saltar();

	/*
	 * Apartir de la versi�n 1.8 de Java, podemos cambiar un poco lo que nos
	 * dice la definici�n de interface, puesto que podemos implementar m�todos,
	 * podemos definir su l�gica, pero esto debe ser anteponiendo las palabras
	 * reservadas default o static. Estos son m�todo que normalmente los definimos
	 * desde las interfaces ya que consideramos que no van a cambiar y por esa raz�n
	 * se definen desde aqu�, pero si los queremos rescribir no hay problema, pero
	 * no tendr�a sentido que los declaremos desde aqu�.
	 * 
	 */

	default public String respirar() {

		return "Respirando";
	}

	public static String pensar() {

		return "Pensando";
	}

}
