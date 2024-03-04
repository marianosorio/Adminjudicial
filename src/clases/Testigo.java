package clases;

public class Testigo extends Persona{
	private String _relacion;
	private String _declaracion;
	private int _numerocelular;
	public Testigo(String _nombre, String _apellido, String _ID, String _sex, String _genero, String _relacion2, String _declaracion2, int _numerocelular2) {
		super();
	}
	
	
	public Testigo() {
		super();
	}


	public Testigo(String _nombre, String _apellido, String iD, String _sexo, String _genero, String[] _direccion) {
		super(_nombre, _apellido, iD, _sexo, _genero, _direccion);
	}


	public String get_relacion() {
		return _relacion;
	}
	public void set_relacion(String _relacion) {
		this._relacion = _relacion;
	}
	public String get_declaracion() {
		return _declaracion;
	}
	public void set_declaracion(String _declaracion) {
		this._declaracion = _declaracion;
	}
	public int get_numerocelular() {
		return _numerocelular;
	}
	public void set_numerocelular(int _numerocelular) {
		this._numerocelular = _numerocelular;
	}
	public static void add(Testigo testigo) {
		
	}
	
	

	
}
