package clases;

import java.time.LocalDate;

public class Policia extends Persona{
	private String _rango;
	private int _codigopoli;
	
	Policia(String _nombre, String _apellido, String _ID, String _sex, String _genero, String _rango2, String _codigopoli2) {
		super();
	}

	
	public Policia() {
		super();
	}


	public Policia(String _nombre, String _apellido, String iD, String _sexo, String _genero, String[] _direccion) {
		super(_nombre, _apellido, iD, _sexo, _genero, _direccion);	
	}


	public String get_rango() {
		return _rango;
	}
	public void set_rango(String _rango) {
		this._rango = _rango;
	}
	public int get_codigopoli() {
		return _codigopoli;
	}
	public void set_codigopoli(int _codigopoli) {
		this._codigopoli = _codigopoli;
	}
	public static void add(Policia policia) {
		
		
	}

	public static void mostrarDetallesExpediente(String codigoExpediente, LocalDate fechaActual, String nombre, String apellido, String ID, String sexo, String genero, String rangoAcreditado, String codigoPolicia) {
	    System.out.println("Detalles del Expediente del Policía Involucrado:");
	    System.out.println("-------------------------------------------------");
	    System.out.println("Código del Expediente: " + codigoExpediente);
	    System.out.println("Fecha actual: " + fechaActual);
	    System.out.println("Nombre(s) del Policía: " + nombre + " " + apellido);
	    System.out.println("Número de Identidad: " + ID);
	    System.out.println("Sexo del Policía: " + sexo);
	    System.out.println("Género seleccionado: " + genero);
	    System.out.println("Rango Acreditado: " + rangoAcreditado);
	    System.out.println("Código del Policía Involucrado: " + codigoPolicia);
	    System.out.println("----------------------------------------------");
	}
}
