/**
 * Autor: Michael Bince Bedoya Cano
 * Ultima fecha de modificación: 17/12/2018 
 */
package Accenture.com.App;

/*
 * Las clases en Java son plantillas para la creación de objetos, en los que se
 * encuentran los métodos (Funcionalidades) y los atributos (características)
 * que definen cada objeto.
 */

public class Persona extends SerVivo implements InterfaceSerVivo {

	/*
	 * Lo que tenemos a continuación son constructores, Un constructor es un método
	 * especial de una clase que se llama automáticamente siempre que se instancia
	 * un objeto de esa clase. Su función es inicializar el objeto y sirve para
	 * asegurarnos que los objetos siempre contengan valores válidos.
	 */

	/*
	 * A continuación, podemos observar los constructores, los cuales los estamos
	 * sobrecargando. Cuando en una clase existen constructores múltiples, se dice
	 * que hay sobrecarga de constructores. La sobrecarga de constructores es la
	 * creación de varios constructores con diferente lista de tipos de parámetros.
	 * Java utiliza el número y tipo de parámetros para seleccionar cuál definición
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
	 * A continuación, podemos observar el método comer, el cual es un método que
	 * estamos sobrecargando. La sobrecarga de métodos es la creación de varios
	 * métodos con el mismo nombre, pero con diferente lista de tipos de parámetros.
	 * Java utiliza el número y tipo de parámetros para seleccionar cuál definición
	 * de método ejecutar.
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
