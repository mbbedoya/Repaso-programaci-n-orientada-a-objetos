/**
 * Autor: Michael Bince Bedoya Cano
 * Ultima fecha de modificación: 17/12/2018 
 */
package Accenture.com.App;

/*
 * Una interfaz en Java es una colección de métodos abstractos y propiedades
 * constantes.
 */

public interface InterfaceSerVivo {

	/*
	 * Tenemos la propiedad NOMBRE_DEL_PROGRAMA la cual es una constante, lo que es
	 * una variable del sistema que mantiene un valor inmutable a lo largo de toda
	 * la vida del programa.
	 */

	public final static String NOMBRE_DEL_PROGRAMA = "Repaso de programación orientada a objetos";

	/*
	 * Tenemos los métodos caminar(), correr() y saltar(), los cuales son métodos
	 * abstractos que son un métodos declarados, pero no implementados, es decir, es
	 * un método del que solo se escribe su nombre, parámetros y tipo devuelto
	 * (Conocido como firma) pero no su código interno o lógica de este.
	 * 
	 */

	public int caminarEnMetros(int kilometros);

	public int correrEnMetros(int kilometros);

	public void saltar();

	/*
	 * Apartir de la versión 1.8 de Java, podemos cambiar un poco lo que nos
	 * dice la definición de interface, puesto que podemos implementar métodos,
	 * podemos definir su lógica, pero esto debe ser anteponiendo las palabras
	 * reservadas default o static. Estos son método que normalmente los definimos
	 * desde las interfaces ya que consideramos que no van a cambiar y por esa razón
	 * se definen desde aquí, pero si los queremos rescribir no hay problema, pero
	 * no tendría sentido que los declaremos desde aquí.
	 * 
	 */

	default public String respirar() {

		return "Respirando";
	}

	public static String pensar() {

		return "Pensando";
	}

}
