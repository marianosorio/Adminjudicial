package clases;


import java.util.Scanner;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		  String _codigoexpediente;
		  ArrayList<String> delitosSeleccionados = new ArrayList<>();
	      Scanner scanner = new Scanner(System.in);
	      Scanner scanner1 = new Scanner(System.in);
		  String input = new String();
		    int index;
		    
		    System.out.println(
		    	      "--------------- Bienvenido al sistema ---------------"+
		              "          \r Presione la tecla de acceso. "
		    	         );
		     
		    String teclaAcceso = scanner.nextLine();
	        
	        System.out.println("El acceso ha sido concedido.");    

		    	    while (true) {
		    	      System.out.println(
		    	        "-------------------------------" +
		    	        "\r1: Crear un nuevo expediente." +
		    	        "\r2: Salir." +
		    	        "\r-------------------------------"
		    	      );
		    	      System.out.print("Escoja una opcion: ");

		    	      input = scanner.next();
		    	      switch (input) {
		    	        case "1":
		    	        	boolean centinelasistema=true;
		    	        	 System.out.println( "//////////////////////////////////" +
                              "\r Sea bienvenido a la administracion del sistema, escoja una opción por favor:"+
				    	        "\r1:  -Documentacion del demandante." +
				    	        "\r2:  -Documentacion del demandado. " +
				    	        "\r3:  -Documentacion del policia.   " +
				    	        "\r4:  -Documentacion del testigo.   " +
				    	        "\r     Salir            " +
				    	        "\r//////////////////////////////////"
				    	      );
		    	         
		    	        	 System.out.print("Seleccione el tipo de expediente: ");
				    	      input = scanner.next();
				    	      

				    	      
				    	      switch (input) {
				    	        case "1":
				    	        	boolean agregarOtroDemandante = true;
				    	            while (agregarOtroDemandante) {
				    	            LocalDateTime fechaHoraActual = LocalDateTime.now();
				                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
				                    String fechaHoraFormateada = fechaHoraActual.format(formatter);
				                    _codigoexpediente = fechaHoraFormateada;
				                    LocalDate fechaActual = LocalDate.now();
				                	
				    	        	
				    	        System.out.println("/// Ha seleccionado llenar el formulario de informacion del demandante. ///");

			                    System.out.println("El codigo autogenerado del expediente es: " + _codigoexpediente);
			                 
			                    System.out.println("Fecha actual: " + fechaActual);
			                 
				    	        System.out.print("Escriba el nombre(s) del demandante: ");
				    	             _nombre = scanner.next();
				    	        System.out.println("Escriba el apellido(s) del demandante: ");
				    	            _apellido1 = scanner.next();
				    	        System.out.println("Escriba el numero de identidad:");
				    	            _ID = scanner.next();
				    	           
				    	            System.out.println("Ingrese la dirección del testigo:");
				    	            System.out.println("Número de casa:");
				    	            String casa = scanner.next();
				    	            System.out.println("Calle:");
				    	            String calle = scanner.next();
				    	            System.out.println("Ciudad:");
				    	            String ciudad = scanner.next();
				    	            System.out.println("Departamento:");
				    	            String departamento = scanner.next();

				    	            String[] direccion = {casa, calle, ciudad, departamento};
				    	            System.out.println("-El numero de casa es: " + casa + "\n " + "-La calle es: " + calle + "\n " + "-La ciudad es: " + ciudad + "\n " + "-El departamento es: " + departamento);
				    	        System.out.println("¿Cual es el sexo del demandante? (Hombre o Mujer)");
				    	            _sex = scanner.next();
				    	        System.out.println("Escoja una opcion para el genero:"
				    	            		+ "\r1. Masculino."
				    	            		+ "\r2.Femenino."
				    	            		+ "\r3.Otro.");
				    	           int opcionsexo = scanner.nextInt();
				    	          
				    	            scanner.nextLine();
				    	            switch (opcionsexo) {
				    	            case 1:
				    	                _sex = "Masculino";
				    	                break;
				    	            case 2:
				    	                _sex = "Femenino";
				    	                break;
				    	            case 3:
				    	                _sex = "Otro";
				    	                break;
				    	        }

				    	        System.out.println("El genero seleccionado es: " + _sex);
				    	          
				    	            System.out.println("Narración de los hechos:");
				    	            _razondemandante = scanner.next();
				    	            System.out.println("Escoja el delito que el demandante sugiere haber sufrido:");
                                    String[] delitosd = {"Estafa", "Robo", "Fraude", "Homicidio", "Secuestro"};
				    	            
				    	            System.out.println("Lista de delitos disponibles:");
				    	            for (int i = 0; i < delitosd.length; i++) {
				    	                System.out.println((i + 1) + ". " + delitosd[i]);
				    	            }

				    	           
				    	            boolean seleccionarMasDelitosd = true;
				    	            while (seleccionarMasDelitosd) {
				    	                System.out.println("Escoja un delito de la lista (Ingrese el número correspondiente al delito):");
				    	                int opcionDelito = scanner.nextInt();
				    	                scanner.nextLine(); 

				    	                if (opcionDelito >= 1 && opcionDelito <= delitosd.length) {
				    	                    String delitoSeleccionado = delitosd[opcionDelito - 1];
				    	                    delitosSeleccionados.add(delitoSeleccionado);
				    	                    System.out.println("Usted ha seleccionado el delito: " + delitoSeleccionado);
				    	                    System.out.println("Desea seleccionar otro delito? (Escriba Si/No)");
				    	                    String respuesta = scanner.nextLine();
				    	                    if (!respuesta.equalsIgnoreCase("Si")) {
				    	                        seleccionarMasDelitosd = false;
				    	                    }
				    	                } else {
				    	                    System.out.println("Opción inválida. Por favor, seleccione un delito de la lista.");
				    	                }
				    	            }

				    	            System.out.println("Delitos seleccionados:");
				    	            for (String delito : delitosSeleccionados) {
				    	                System.out.println(delito);
				    	            }
				    	           
				    	            Demandante.add(
						    	            new Demandante(_nombre, _apellido, _ID, _sex, _genero, _razondemandante, _delitod)
						    	          );
				    	            System.out.println("La informacion ha sido guardada.");

				                    System.out.println("¿Desea agregar otro demandante? (Escriba Si/No)");
				                    String respuesta = scanner.next();

				                    if (respuesta.equalsIgnoreCase("No")) {
				                        agregarOtroDemandante = false;
				                    }
				                }
				    	     
				    	        	break;
				    	           
				    	        	
				    	        case "2": 
				    	        	boolean agregarOtroDemandado = true;
				    	            while (agregarOtroDemandado) {
				    	        	
				    	        System.out.println("/// Ha seleccionado llenar el formulario de informacion del demandado. ///");
				    	        LocalDateTime fechaHoraActual1 = LocalDateTime.now();
			                    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			                    String fechaHoraFormateada1 = fechaHoraActual1.format(formatter1);
			                    _codigoexpediente = fechaHoraFormateada1;
			                    LocalDate fechaActual1 = LocalDate.now();
			                	

		                    System.out.println("El codigo autogenerado del expediente es: " + _codigoexpediente);
		                 
		                    System.out.println("Fecha actual: " + fechaActual1);
		                    
				    	    System.out.print("Escriba el nombre(s) del demandado: ");
				    	             _nombre = scanner.next();
				    	    System.out.println("Escriba el apellido(s) del demandado:");
				    	            _apellido = scanner.next();
				    	    System.out.println("Escriba el numero de identidad:");
				    	            _ID = scanner.next();
				    	            
				    	            System.out.println("Ingrese la dirección del testigo:");
				    	            System.out.println("Número de casa:");
				    	            String casa = scanner.next();
				    	            System.out.println("Calle:");
				    	            String calle = scanner.next();
				    	            System.out.println("Ciudad:");
				    	            String ciudad = scanner.next();
				    	            System.out.println("Departamento:");
				    	            String departamento = scanner.next();

				    	           
				    	            String[] direccion = {casa, calle, ciudad, departamento};
				    	            System.out.println("-El numero de casa es: " + casa + "\n " + "-La calle es: " + calle + "\n " + "-La ciudad es: " + ciudad + "\n " + "-El departamento es: " + departamento);
				    	    System.out.println("¿Cual es el sexo del demandado? (Hombre o Mujer)");
				    	            _sex = scanner.next();
				    	    System.out.println("Escoja una opcion para el genero:"
				    	            		+ "\r1. Masculino."
				    	            		+ "\r2.Femenino."
				    	            		+ "\r3.Otro.");
				    	            int opciongenero = scanner.nextInt();
					    	            scanner.nextLine();
					    	            switch (opciongenero) {
					    	            case 1:
					    	                _genero = "Masculino";
					    	                break;
					    	            case 2:
					    	                _genero = "Femenino";
					    	                break;
					    	            case 3:
					    	                _genero = "Otro";
					    	                break;
					    	        }

					    	        System.out.println("El género seleccionado es: " + _genero);
				    	           
				    	          
				    	            System.out.println("Narración de los hechos:");
				    	            _razondemandante = scanner.next();
				    	            System.out.println("Antecedentes penales:");
				    	            _antecedentespenales = scanner.next();
				    	            System.out.println("Identifique el delito por el cual la persona es acusada:");
				    	            String[] delitos = {"-Estafa", "-Robo", "-Fraude", "-Homicidio", "-Secuestro"};
				    	            
				    	            System.out.println("Lista de delitos disponibles:");
				    	            for (int i = 0; i < delitos.length; i++) {
				    	                System.out.println((i + 1) + ". " + delitos[i]);
				    	            }

				    	           
				    	            boolean seleccionarMasDelitos = true;
				    	            while (seleccionarMasDelitos) {
				    	                System.out.println("Escoja un delito de la lista (Ingrese el número correspondiente al delito):");
				    	                int opcionDelito = scanner.nextInt();
				    	                scanner.nextLine(); 

				    	                if (opcionDelito >= 1 && opcionDelito <= delitos.length) {
				    	                    String delitoSeleccionado = delitos[opcionDelito - 1];
				    	                    delitosSeleccionados.add(delitoSeleccionado);
				    	                    System.out.println("Usted ha seleccionado el delito: " + delitoSeleccionado);
				    	                    System.out.println("Desea seleccionar otro delito? (Escriba Si/No)");
				    	                    String respuesta = scanner.nextLine();
				    	                    if (!respuesta.equalsIgnoreCase("Si")) {
				    	                        seleccionarMasDelitos = false;
				    	                    }
				    	                } else {
				    	                    System.out.println("Opción inválida. Por favor, seleccione un delito de la lista.");
				    	                }
				    	            }

				    	            System.out.println("Delitos seleccionados:");
				    	            for (String delito : delitosSeleccionados) {
				    	                System.out.println(delito);
				    	            }
				    	           
				    	            
				    	            	
				    	            Demandado.add(
						    	            new Demandado(_nombre, _apellido, _ID, _sex, _genero, _antecedentespenales, _delitos)
						    	          );
				    	            System.out.println("La informacion ha sido guardada.");
				    	            System.out.println("¿Desea agregar otro demandado? (Si/No)");
				                    String respuesta = scanner.next();

				                    if (respuesta.equalsIgnoreCase("No")) {
				                        agregarOtroDemandado = false;
				                    }
				    	            
				    	            }
				    	           
				    	        	break;
				    	        	
				    	        
				    	        case "3": 
				    	        	boolean agregarOtroPolicia = true;
				    	            while (agregarOtroPolicia) {
				    	        System.out.println("/// Ha seleccionado llenar el formulario de informacion del policia involucrado. ///");
				    	        LocalDateTime fechaHoraActual2 = LocalDateTime.now();
			                    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			                    String fechaHoraFormateada2 = fechaHoraActual2.format(formatter2);
			                    _codigoexpediente = fechaHoraFormateada2;
			                    LocalDate fechaActual2 = LocalDate.now();
			                	
			    	        System.out.println("El codigo autogenerado del expediente es: " + _codigoexpediente);
		                 
		                    System.out.println("Fecha actual: " + fechaActual2);
		                    
				    	    System.out.print("Escriba el nombre(s) del policia: ");
				    	             _nombre = scanner.next();
				    	    System.out.println("Escriba el apellido(s) del policia:");
				    	            _apellido = scanner.next();
				    	    System.out.println("Escriba el numero de identidad:");
				    	            _ID = scanner.next();
				    	            System.out.println("Ingrese la dirección del testigo:");
				    	            System.out.println("Número de casa:");
				    	            String casa = scanner.next();
				    	            System.out.println("Calle:");
				    	            String calle = scanner.next();
				    	            System.out.println("Ciudad:");
				    	            String ciudad = scanner.next();
				    	            System.out.println("Departamento:");
				    	            String departamento = scanner.next();

				    	            
				    	            String[] direccion = {casa, calle, ciudad, departamento};
				    	            System.out.println("-El numero de casa es: " + casa + "\n " + "-La calle es: " + calle + "\n " + "-La ciudad es: " + ciudad + "\n " + "-El departamento es: " + departamento);
				    	    System.out.println("¿Cual es el sexo del policia? (Hombre o Mujer)");
				    	            _sex = scanner.next();
				    	    System.out.println("Escoja una opcion para el genero:"
				    	            		+ "\r1. Masculino."
				    	            		+ "\r2.Femenino."
				    	            		+ "\r3.Otro.");
				    	            int opciongenero2 = scanner.nextInt();
				    	            scanner.nextLine();
				    	            switch (opciongenero2) {
				    	            case 1:
				    	                _genero = "Masculino";
				    	                break;
				    	            case 2:
				    	                _genero = "Femenino";
				    	                break;
				    	            case 3:
				    	                _genero = "Otro";
				    	                break;
				    	        }

				    	        System.out.println("El género seleccionado es: " + _genero);
				    	            System.out.println("Rango acreditado:");
				    	            _rango = scanner.next();
				    	            System.out.println("Código del policía involucrado:");
				    	            _codigopoli = scanner.next();
				    	            Policia.add(
						    	            new Policia(_nombre, _apellido, _ID, _sex, _genero, _rango, _codigopoli)
						    	          );
				    	            System.out.println("La informacion ha sido guardada.");
				    	            System.out.println("¿Desea agregar otro policia involucrado? (Si/No)");
				                    String respuesta = scanner.next();

				                    if (respuesta.equalsIgnoreCase("No")) {
				                        agregarOtroPolicia = false;
				                    }
				                    
				    	            
				    	            }
				    	          
				    	        	break;
				    	        	
				    	        	
				    	        	
				    	        case "4":
				    	        	boolean agregarOtroTestigo = true;
				    	            while (agregarOtroTestigo) {	
				    	        System.out.println("/// Ha seleccionado llenar el formulario de informacion del testigo. ///");
				    	        LocalDateTime fechaHoraActual3 = LocalDateTime.now();
			                    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			                    String fechaHoraFormateada3 = fechaHoraActual3.format(formatter3);
			                    _codigoexpediente = fechaHoraFormateada3;
			                    LocalDate fechaActual3 = LocalDate.now();

		                    System.out.println("El codigo autogenerado del expediente es: " + _codigoexpediente);
		                 
		                    System.out.println("Fecha actual: " + fechaActual3);
		                    
				    	    System.out.print("Escriba el nombre(s) del testigo: ");
				    	             _nombre = scanner.next();
				    	    System.out.println("Escriba el apellido(s) del testigo:");
				    	            _apellido = scanner.next();
				    	    System.out.println("Escriba el numero de identidad:");
				    	            _ID = scanner.next();
				    	            System.out.println("Ingrese la dirección del testigo:");
				    	            System.out.println("Número de casa:");
				    	            String casa = scanner.next();
				    	            System.out.println("Calle:");
				    	            String calle = scanner.next();
				    	            System.out.println("Ciudad:");
				    	            String ciudad = scanner.next();
				    	            System.out.println("Departamento:");
				    	            String departamento = scanner.next();

				    	            
				    	            String[] direccion = {casa, calle, ciudad, departamento};
				    	            System.out.println("-El numero de casa es: " + casa + "\n " + "-La calle es: " + calle + "\n " + "-La ciudad es: " + ciudad + "\n " + "-El departamento es: " +departamento);
				    	             
				    	    System.out.println("¿Cual es el sexo del testigo? (Hombre o Mujer)");
				    	            _sex = scanner.next();
				    	    System.out.println("Escoja una opcion para el genero:"
				    	            		+ "\r1. Masculino."
				    	            		+ "\r2.Femenino."
				    	            		+ "\r3.Otro.");
				    	            int opciongenero3 = scanner.nextInt();
				    	            scanner.nextLine();
				    	            switch (opciongenero3) {
				    	            case 1:
				    	                _genero = "Masculino";
				    	                break;
				    	            case 2:
				    	                _genero = "Femenino";
				    	                break;
				    	            case 3:
				    	                _genero= "Otro";
				    	                break;
				    	        }

				    	        System.out.println("El género seleccionado es: " + _genero);
				    	            
				    	          
				    	            System.out.println("Relacion del testigo con los involucrados:");
				    	            _relacion = scanner.next();
				    	            System.out.println("Escriba una breve declaracion del testigo:");
				    	            _declaracion = scanner.next();
				    	            System.out.println("Numero de celular:");
				    	            _numerocelular = scanner.nextInt();
				    	            Testigo.add(
						    	            new Testigo(_nombre, _apellido, _ID, _sex, _genero, _relacion, _declaracion, _numerocelular)
						    	          );
				    	            System.out.println("La informacion ha sido guardada.");
				    	            System.out.println("¿Desea agregar otro testigo? (Si/No)");
				                    String respuesta = scanner.next();

				                    if (respuesta.equalsIgnoreCase("No")) {
				                        agregarOtroTestigo = false;
				                    }
				    	            
				    	           }
				    	        	break;
				    	        default:
				    	          break;
				    	    }
				  
				    	      if (input.equals("Salir")) {
				    	        break;
				  
				    	      }
		    	          
		    	        case "2":
		    	        	centinelasistema = false;
		    	        	System.out.println("Has salido del sistema.");
		    	        	break;
		    	        	default:
		    	        	break;
		    	        	
		    	       
		    	      }
		    	      if (input.equals("exit")) {
			    	        break;
			    	      }
		    	    }
		  }
	   	     
		    	
	 static ArrayList<clases.Persona> persona = new ArrayList<Persona>();
	 static String _nombre;
	 static String _apellido;
	 static String _apellido1;
	 static String _ID;
	 static String _sex;
	 static String _genero;
	 static String [] _direccion;
	
	 static ArrayList<clases.Demandante> demandante = new ArrayList<Demandante>();
	 static String _razondemandante;
	 static String _delitod;
	  
	 static ArrayList<clases.Demandado> demandado = new ArrayList<clases.Demandado>();
     static String _antecedentespenales;
	 static String _delitos;
	  
	 static ArrayList<clases.Policia> policia = new ArrayList<clases.Policia>(); 
	 static String _rango;
	 static String _codigopoli;
	  
	 static ArrayList<clases.Testigo> testigo = new ArrayList<clases.Testigo>();
	 static String _relacion;
	 static String _declaracion;
	 static int _numerocelular;
	

}

