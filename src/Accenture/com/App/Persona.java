/**
 * Autor: Michael Bince Bedoya Cano
 * Ultima fecha de modificaci�n: 17/12/2018 
 */
package Accenture.com.App;

/*
 * Las clases en Java son plantillas para la creaci�n de objetos, en los que se
 * encuentran los m�todos (Funcionalidades) y los atributos (caracter�sticas)
 * que definen cada objeto.
 */

public class Persona extends SerVivo implements InterfaceSerVivo {

	/*
	 * Lo que tenemos a continuaci�n son constructores, Un constructor es un m�todo
	 * especial de una clase que se llama autom�ticamente siempre que se instancia
	 * un objeto de esa clase. Su funci�n es inicializar el objeto y sirve para
	 * asegurarnos que los objetos siempre contengan valores v�lidos.
	 */

	/*
	 * A continuaci�n, podemos observar los constructores, los cuales los estamos
	 * sobrecargando. Cuando en una clase existen constructores m�ltiples, se dice
	 * que hay sobrecarga de constructores. La sobrecarga de constructores es la
	 * creaci�n de varios constructores con diferente lista de tipos de par�metros.
	 * Java utiliza el n�mero y tipo de par�metros para seleccionar cu�l definici�n
	 * del constructor a utilizar.
	 * 
	 */

	public Persona(String especie, char sexo, String nombre, String apellido, String paisDeNacimiento) {

		super.paisDeNacimiento = paisDeNacimiento;
		super.setEspecie(especie);
		super.setSexo(sexo);
		this.nombre = nombre;
		this.apellido = apellido;

	}

	public Persona(String especie, char sexo) {
		super.setEspecie(especie);
		super.setSexo(sexo);
	}

	/*
	 * Cuando tenemos constructores que definamos y queramos utilizar el constructor
	 * por defecto, demos crearlo.
	 */

	public Persona() {

	}

	private String nombre;

	private String apellido;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int caminarEnMetros(int kilometros) {

		return kilometros * 1000;
	}

	@Override
	public int correrEnMetros(int kilometros) {

		return kilometros * 1000;
	}

	@Override
	public void saltar() {
		System.out.println(nombre+" esta saltando");
	}

	@Override
	public void dormir() {
		System.out.println(nombre+ " esta durmiendo");
	}

	public int calcularDistanciaRecorridaEnKilometros(int distanciaEnMetros) {

		return distanciaEnMetros / 1000;
	}

	/*
	 * A continuaci�n, podemos observar el m�todo comer, el cual es un m�todo que
	 * estamos sobrecargando. La sobrecarga de m�todos es la creaci�n de varios
	 * m�todos con el mismo nombre, pero con diferente lista de tipos de par�metros.
	 * Java utiliza el n�mero y tipo de par�metros para seleccionar cu�l definici�n
	 * de m�todo ejecutar.
	 */

	public void comer(String alimento) {

		System.out.println(nombre+ " esta comiendo " + alimento);
	}

	public void comer(String alimento, String bebida) {

		System.out.println(nombre+ " esta comiendo " + alimento + " y tomando " + bebida);
	}

	public void comer() {

		System.out.println(nombre+ " esta comiendo alimento X y bebiendo Y");
	}

	public String respirar(String queEstasRespirando) {

		return nombre+ " esta respirando" + queEstasRespirando;
	}

	public String pensar() {

		return nombre+ " esta pensando algo";
	}
}
