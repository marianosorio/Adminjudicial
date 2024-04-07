package clases;


import java.util.Scanner;

import clases.Demandante;
import clases.Persona;
import clases.Policia;
import clases.Testigo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
	static Scanner scanner = new Scanner(System.in);
	 
    public static void main(String[] args) {
	    ArrayList<String> delitosSeleccionados = new ArrayList<>();
        String _codigoexpediente;
        boolean centinelasistema = true;
        Scanner scanner = new Scanner(System.in);
	      Scanner scanner1 = new Scanner(System.in);

        while (centinelasistema) {
            System.out.println("--------------- Bienvenido al sistema ---------------");
            System.out.println("Presione la tecla de acceso.");
            String teclaAcceso = scanner.nextLine();
            System.out.println("El acceso ha sido concedido.");

            System.out.println("/// Comienzo de creacion de un nuevo expediente ///");
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
            _codigoexpediente = fechaHoraActual.format(formatter);
            LocalDate fechaActual = LocalDate.now();

            System.out.println("El código autogenerado del expediente es: " + _codigoexpediente);

            //Ingresar información de demandantes
        
        boolean agregarOtroDemandante = true;

        while (agregarOtroDemandante) {
         System.out.println("/// Ingrese la información de los demandantes ///");
            System.out.println("Fecha actual: " + fechaActual);
            
	        System.out.print("Escriba el nombre(s) del demandante: ");
	             _nombre = scanner.next();
	        System.out.println("Escriba el apellido(s) del demandante: ");
	            _apellido1 = scanner.next();
	        System.out.println("Escriba el numero de identidad:");
	            _ID = scanner.next();
	           
	            System.out.println("Ingrese la dirección del testigo:");
	            System.out.println("Numero de casa:");
	            String casa = scanner.next();
	            System.out.println("Calle:");
	            String calle = scanner.next();
	            System.out.println("Ciudad:");
	            String ciudad = scanner.next();
	            System.out.println("Departamento:");
	            String departamento = scanner.next();

	            String[] direccion = {casa, calle, ciudad, departamento};
	           
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
	                System.out.println("Escoja un delito de la lista (Ingrese el numero correspondiente al delito):");
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
	           
	            demandante.add(
	    	            new Demandante(_nombre, _apellido, _ID, _sex, _genero, _razondemandante, _delitod)
	    	          );
	            System.out.println("La informacion ha sido guardada.");

               
                System.out.println("¿Desea mostrar la información guardada? (Escriba Si/No");
                String respuesta = scanner.next();
                  if (respuesta.equalsIgnoreCase("No")) {
                     
                  } else {
                	  System.out.println("Información guardada de los demandantes:");
                	      System.out.println("1. Nombre: " + _nombre);
                	      System.out.println("2. Apellido: " + _apellido1);
                	      System.out.println("3. Direccion:  \r -El numero de casa es: " + casa + "\n " + "-La calle es: " + calle + "\n " + "-La ciudad es: " + ciudad + "\n " + "-El departamento es: " + departamento);
                	      System.out.println("4. ID: " + _ID);
                	      System.out.println("5. Sexo: " + _sex);
                	      System.out.println("6. Genero: " + _genero);
                	      System.out.println("7. Razón del demandante: " + _razondemandante);
                	      System.out.println("8. Delito sugerido: " );
                	      for (String delito : delitosSeleccionados) {
		    	                System.out.println(delito);
		    	            };
                	      System.out.println("-------------------------------------");
                  }
                  
                      System.out.println("¿Desea agregar otro demandante? (Si/No)");
            String respuestad = scanner.next();
            if (respuesta.equalsIgnoreCase("No")) {
                agregarOtroDemandante = false;
            }
            scanner.nextLine(); 
        
    }

            // Ingresar información de demandados
        
        boolean agregarOtroDemandado = true;

        while (agregarOtroDemandado) {
            System.out.println("/// Ingrese la información de los demandados ///");
            System.out.println("Fecha actual: " + fechaActual);
            
	        System.out.print("Escriba el nombre(s) del demandado: ");
	             _nombre = scanner.next();
	        System.out.println("Escriba el apellido(s) del demandado: ");
	            _apellido1 = scanner.next();
	        System.out.println("Escriba el numero de identidad:");
	            _ID = scanner.next();
	           
	            System.out.println("Ingrese la dirección del demandado:");
	            System.out.println("Numero de casa:");
	            String casa1 = scanner.next();
	            System.out.println("Calle:");
	            String calle1 = scanner.next();
	            System.out.println("Ciudad:");
	            String ciudad1 = scanner.next();
	            System.out.println("Departamento:");
	            String departamento1 = scanner.next();

	            String[] direccion1 = {casa1, calle1, ciudad1, departamento1};
	           
	        System.out.println("¿Cual es el sexo del demandado? (Hombre o Mujer)");
	            _sex = scanner.next();
	        System.out.println("Escoja una opcion para el genero:"
	            		+ "\r1. Masculino."
	            		+ "\r2.Femenino."
	            		+ "\r3.Otro.");
	           int opcionsexo1 = scanner.nextInt();
	          
	            scanner.nextLine();
	            switch (opcionsexo1) {
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
	            System.out.println("Narración de los hechos:");
	            _razondemandante = scanner.next();
	            System.out.println("Escoja el delito que se sugiere que ha cometido el demandado:");
                String[] delitosd1 = {"Estafa", "Robo", "Fraude", "Homicidio", "Secuestro"};
	            
	            System.out.println("Lista de delitos disponibles:");
	            for (int i = 0; i < delitosd1.length; i++) {
	                System.out.println((i + 1) + ". " + delitosd1[i]);
	            }

	           
	            boolean seleccionarMasDelitosd1 = true;
	            while (seleccionarMasDelitosd1) {
	                System.out.println("Escoja un delito de la lista (Ingrese el numero correspondiente al delito):");
	                int opcionDelito = scanner.nextInt();
	                scanner.nextLine(); 

	                if (opcionDelito >= 1 && opcionDelito <= delitosd1.length) {
	                    String delitoSeleccionado = delitosd1[opcionDelito - 1];
	                    delitosSeleccionados.add(delitoSeleccionado);
	                    System.out.println("Usted ha seleccionado el delito: " + delitoSeleccionado);
	                    System.out.println("Desea seleccionar otro delito? (Escriba Si/No)");
	                    String respuesta1 = scanner.nextLine();
	                    if (!respuesta1.equalsIgnoreCase("Si")) {
	                        seleccionarMasDelitosd1 = false;
	                    }
	                } else {
	                    System.out.println("Opción inválida. Por favor, seleccione un delito de la lista.");
	                }
	            }
	           
	            System.out.println("Narración de los hechos:");
	            _razondemandante = scanner.next();
	            System.out.println("Antecedentes penales:");
	            _antecedentespenales = scanner.next();
	            demandante.add(
	    	            new Demandante(_nombre, _apellido, _ID, _sex, _genero, _razondemandante, _delitod)
	    	          );
	            System.out.println("La informacion ha sido guardada.");

               
                System.out.println("¿Desea mostrar la información guardada? (Escriba Si/No");
                String respuesta1 = scanner.next();
                  if (respuesta1.equalsIgnoreCase("No")) {
                     
                  } else {
                	  System.out.println("Información guardada del demandado:");
                	      System.out.println("1. Nombre: " + _nombre);
                	      System.out.println("2. Apellido: " + _apellido1);
                	      System.out.println("3. Direccion:  \r -El numero de casa es: " + casa1 + "\n " + "-La calle es: " + calle1 + "\n " + "-La ciudad es: " + ciudad1 + "\n " + "-El departamento es: " + departamento1);
                	      System.out.println("4. ID: " + _ID);
                	      System.out.println("5. Sexo: " + _sex);
                	      System.out.println("6. Genero: " + _genero);
                	      System.out.println("7. Antecedentes: " + _antecedentespenales);
                	      System.out.println("8. Delito sugerido: " );
                	      for (String delito : delitosSeleccionados) {
		    	                System.out.println(delito);
		    	            };
                	      System.out.println("-------------------------------------");
                  }
                  
                     System.out.println("¿Desea agregar otro demandado? (Si/No)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("No")) {
                agregarOtroDemandado = false;
            }
            scanner.nextLine(); 
        
    }


            // Ingresar información de los testigos
             
        boolean agregarOtroTestigo = true;

        while (agregarOtroTestigo) {
            System.out.println("/// Ingrese la información de los testigos involucrados ///");
 System.out.println("Fecha actual: " + fechaActual);
            
	        System.out.print("Escriba el nombre(s) del testigo: ");
	             _nombre = scanner.next();
	        System.out.println("Escriba el apellido(s) del testigo: ");
	            _apellido1 = scanner.next();
	        System.out.println("Escriba el numero de identidad:");
	            _ID = scanner.next();
	           
	            System.out.println("Ingrese la dirección del testigo:");
	            System.out.println("Numero de casa:");
	            String casa2 = scanner.next();
	            System.out.println("Calle:");
	            String calle2 = scanner.next();
	            System.out.println("Ciudad:");
	            String ciudad2 = scanner.next();
	            System.out.println("Departamento:");
	            String departamento2 = scanner.next();

	            String[] direccion2 = {casa2, calle2, ciudad2, departamento2};
	           
	        System.out.println("¿Cual es el sexo del testigo? (Hombre o Mujer)");
	            _sex = scanner.next();
	        System.out.println("Escoja una opcion para el genero:"
	            		+ "\r1. Masculino."
	            		+ "\r2.Femenino."
	            		+ "\r3.Otro.");
	           int opcionsexo2 = scanner.nextInt();
	          
	            scanner.nextLine();
	            switch (opcionsexo2) {
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

               
                System.out.println("¿Desea mostrar la información guardada? (Escriba Si/No");
                String respuesta2 = scanner.next();
                  if (respuesta2.equalsIgnoreCase("No")) {
                     
                  } else {
                	  System.out.println("Información guardada del testigo:");
                	      System.out.println("1. Nombre: " + _nombre);
                	      System.out.println("2. Apellido: " + _apellido1);
                	      System.out.println("3. Direccion:  \r -El numero de casa es: " + casa2 + "\n " + "-La calle es: " + calle2 + "\n " + "-La ciudad es: " + ciudad2 + "\n " + "-El departamento es: " + departamento2);
                	      System.out.println("4. ID: " + _ID);
                	      System.out.println("5. Sexo: " + _sex);
                	      System.out.println("6. Genero: " + _genero);
                	      System.out.println("7. Relacion del testigo con los involucrados: " + _relacion);
                	      System.out.println("8. Declaracion: " + _declaracion );
                	      System.out.println("8. Numero de celular: " + _numerocelular);
                	      System.out.println("-------------------------------------");
                  }
                       System.out.println("¿Desea agregar otro testigo? (Si/No)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("No")) {
                agregarOtroTestigo = false;
            }
            scanner.nextLine(); 
        
    }

            // Ingresar información de policias
             
        boolean agregarOtroPolicia = true;

        while (agregarOtroPolicia) {
            System.out.println("/// Ingrese la información de los policias ///");
 System.out.println("Fecha actual: " + fechaActual);
            
	        System.out.print("Escriba el nombre(s) del policia: ");
	             _nombre = scanner.next();
	        System.out.println("Escriba el apellido(s) del policia: ");
	            _apellido1 = scanner.next();
	        System.out.println("Escriba el numero de identidad:");
	            _ID = scanner.next();
	           
	            System.out.println("Ingrese la dirección del policia:");
	            System.out.println("Numero de casa:");
	            String casa4 = scanner.next();
	            System.out.println("Calle:");
	            String calle4 = scanner.next();
	            System.out.println("Ciudad:");
	            String ciudad4 = scanner.next();
	            System.out.println("Departamento:");
	            String departamento4 = scanner.next();

	            String[] direccion4 = {casa4, calle4, ciudad4, departamento4};
	           
	        System.out.println("¿Cual es el sexo del policia? (Hombre o Mujer)");
	            _sex = scanner.next();
	        System.out.println("Escoja una opcion para el genero:"
	            		+ "\r1. Masculino."
	            		+ "\r2.Femenino."
	            		+ "\r3.Otro.");
	           int opcionsexo4 = scanner.nextInt();
	          
	            scanner.nextLine();
	            switch (opcionsexo4) {
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
	            System.out.println("Rango acreditado:");
	            _rango = scanner.next();
	            System.out.println("Código del policía involucrado:");
	            _codigopoli = scanner.next();
	            Policia.add(
	    	            new Policia(_nombre, _apellido, _ID, _sex, _genero, _rango, _codigopoli)
	    	          );
	            System.out.println("La informacion ha sido guardada.");

               
                System.out.println("¿Desea mostrar la información guardada? (Escriba Si/No");
                String respuesta4 = scanner.next();
                  if (respuesta4.equalsIgnoreCase("No")) {
                     
                  } else {
                	  System.out.println("Información guardada del policia:");
                	      System.out.println("1. Nombre: " + _nombre);
                	      System.out.println("2. Apellido: " + _apellido1);
                	      System.out.println("3. Direccion:  \r -El numero de casa es: " + casa4 + "\n " + "-La calle es: " + calle4 + "\n " + "-La ciudad es: " + ciudad4 + "\n " + "-El departamento es: " + departamento4);
                	      System.out.println("4. ID: " + _ID);
                	      System.out.println("5. Sexo: " + _sex);
                	      System.out.println("6. Genero: " + _genero);
                	      System.out.println("7. Rango acreditado: " + _rango);
                	      System.out.println("8. Codigo: " + _codigopoli );
                	      System.out.println("-------------------------------------");
                  }
                   System.out.println("¿Desea agregar otro policía involucrado? (Si/No)");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("No")) {
                agregarOtroPolicia = false;
            }
            scanner.nextLine(); 
        
    }

            // Verificar si el usuario desea salir del sistema
            System.out.println("¿Desea salir del sistema? (Si/No)");
            String respuesta5 = scanner.next();
            if (respuesta5.equalsIgnoreCase("Si")) {
                centinelasistema = false;
            }
            scanner.nextLine(); 
        }
    }

 

    static ArrayList<clases.Persona> persona = new ArrayList<Persona>();
	 static String _nombre; static String _apellido; static String _apellido1; static String _ID;  static String _sex; static String _genero; static String [] _direccion;
	
	 static ArrayList<clases.Demandante> demandante = new ArrayList<Demandante>();
	 static String _razondemandante; static String _delitod;
	  
	 static ArrayList<clases.Demandado> demandado = new ArrayList<clases.Demandado>();
    static String _antecedentespenales; static String _delitos;
	  
	 static ArrayList<clases.Policia> policia = new ArrayList<clases.Policia>(); 
	 static String _rango; static String _codigopoli;
	  
	 static ArrayList<clases.Testigo> testigo = new ArrayList<clases.Testigo>();
	 static String _relacion; static String _declaracion; static int _numerocelular;
	
}

