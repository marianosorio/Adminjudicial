package clases;

import java.util.ArrayList;

public class Demandante extends Persona{
	private String _razondemandante;
	private String[] delitosd = {"Estafa", "Robo", "Fraude", "Homicidio", "Secuestro"};
	Demandante(String _nombre, String _apellido, String _ID, String _sex, String _genero, String _razondemandante, String _pruebas) {
		super();
	}

	

	public Demandante() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Demandante(String _nombre, String _apellido, String iD, String _sexo, String _genero, String[] _direccion) {
		super(_nombre, _apellido, iD, _sexo, _genero, _direccion);
		// TODO Auto-generated constructor stub
	}



	public String get_razondemandante() {
		return _razondemandante;
	}

	public void set_razondemandante(String _razondemandante) {
		this._razondemandante = _razondemandante;
	}

	public String[] getDelitosd() {
		return delitosd;
	}

	public void setDelitosd(String[] delitosd) {
		this.delitosd = delitosd;
	}

	

	
	
	
	

	
	
	

}
