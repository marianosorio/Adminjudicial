package clases;

public abstract class Persona {
		  String _nombre;
		  String _apellido;
		  String ID;
		  String _sexo;
		  String _genero;
		  String [] _direccion;
		  
		public Persona() {
			super();
		}
		public Persona(String _nombre, String _apellido, String iD, String _sexo, String _genero, String[]_direccion) {
			super();
			this._nombre = _nombre;
			this._apellido = _apellido;
			ID = iD;
			this._sexo = _sexo;
			this._genero = _genero;
			this._direccion = _direccion;
		}
		
		public String get_nombre() {
			return _nombre;
		}
		public void set_nombre(String _nombre) {
			this._nombre = _nombre;
		}
		public String get_apellido() {
			return _apellido;
		}
		public void set_apellido(String _apellido) {
			this._apellido = _apellido;
		}
		public String getID() {
			return ID;
		}
		public void setID(String iD) {
			ID = iD;
		}
		public String get_sexo() {
			return _sexo;
		}
		public void set_sexo(String _sexo) {
			this._sexo = _sexo;
		}
		public String get_genero() {
			return _genero;
		}
		public void set_genero(String _genero) {
			this._genero = _genero;
		}
		public String[] get_direccion() {
			return _direccion;
		}
		public void set_direccion(String[] _direccion) {
			this._direccion = _direccion;
		}
		protected static void add(Demandante demandante) {
			// TODO Auto-generated method stub
			
		}
		
		
		  
		
	 
}


