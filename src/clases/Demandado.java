package clases;
public class Demandado extends Persona{

	private String _antecedentespenales;
	private String[] _delitos = {"Estafa", "Robo", "Fraude", "Homicidio", "Secuestro"};
	Demandado(String _nombre, String _apellido, String _ID, String _sex, String _genero, String _antecedentespenales, String _delitocometido) {
		super();
	}
	
	

	public Demandado() {
		super();
	}



	public Demandado(String _nombre, String _apellido, String iD, String _sexo, String _genero, String[] _direccion) {
		super(_nombre, _apellido, iD, _sexo, _genero, _direccion);
	}



	public String get_antecedentespenales() {
		return _antecedentespenales;
	}

	public void set_antecedentespenales(String _antecedentespenales) {
		this._antecedentespenales = _antecedentespenales;
	}

	public String[] getDelitosd() {
		return _delitos;
	}

	public void setDelitosd(String[] delitosd) {
		this._delitos = delitosd;
	}

	public static void add(Demandado demandado) {
		
		
	}


		
	

	
	
}
