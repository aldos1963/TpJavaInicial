package lector;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Aplicacion 
{
	
	public static void main(String[]args) throws FileNotFoundException
	{
		//Variables.
		String direccionArchivo1 = "src\\main\\resources\\resultados.csv";
		
		
		boolean printAyuda = false;
		
		//Listas de Array para los datos leidos, uno por cada linea de los dos archivos.
		
		//Resultados
		ArrayList<String> datosExtraidosA1L1 = new ArrayList<String>();
		ArrayList<String> datosExtraidosA1L2 = new ArrayList<String>();
		
		//Pronosticos
		ArrayList<String> datosExtraidosA2L1 = new ArrayList<String>();
		ArrayList<String> datosExtraidosA2L2 = new ArrayList<String>();
		
		
		//Leemos los datos y asignamos cada linea a un ArrayList.
		
		//Resultados
		datosExtraidosA1L1.addAll(Lectura.lectorArchivo(direccionArchivo1).get(1));
		datosExtraidosA1L2.addAll(Lectura.lectorArchivo(direccionArchivo1).get(2));
		
		
		
		//Pronosticos - lectura SQL
		ArrayList<Pronostico> pronosticosLeidos = LectorPronosticosSQL.ObtenerPronosticos();
		if (pronosticosLeidos.isEmpty()) {
			//no hubo datos desde SQL
			//Pronosticos - lectura CSV
			String direccionArchivo2 = "src\\main\\resources\\pronostico.csv";
			datosExtraidosA2L1.addAll(Lectura.lectorArchivo(direccionArchivo2).get(1));
			datosExtraidosA2L2.addAll(Lectura.lectorArchivo(direccionArchivo2).get(2));
	    
		}
						
		//Print de Ayuda para asignar datos.
		if(printAyuda == true)
			{
				System.out.println(datosExtraidosA1L1);
				System.out.println(" 0	1	    2        3  4  5	     6              7");
				System.out.println(" ");
				System.out.println(datosExtraidosA1L2);
				System.out.println(" 0     1	   2       3  4  5     6         7");
				System.out.println(" ");
				System.out.println(datosExtraidosA2L1);
				System.out.println(" 0 1  2 3  4");
				System.out.println(" ");
				System.out.println(datosExtraidosA2L2);
				System.out.println(" 0 1 2  3  4");
				System.out.println(" ");
			}

		//Creamos un equipo (Argentina).
		Equipo equipo1 = new Equipo(Integer.parseInt(datosExtraidosA1L1.get(0)), datosExtraidosA1L1.get(1), datosExtraidosA1L1.get(2));
		//Creamos un equipo (Arabia Saudita).
		Equipo equipo2 = new Equipo(Integer.parseInt(datosExtraidosA1L1.get(5)), datosExtraidosA1L1.get(6), datosExtraidosA1L1.get(7));
		//Creamos un equipo (Polonia).
		Equipo equipo3 = new Equipo(Integer.parseInt(datosExtraidosA1L2.get(0)), datosExtraidosA1L2.get(1), datosExtraidosA1L2.get(2));
		//Creamos un equipo (Mexico).
		Equipo equipo4 = new Equipo(Integer.parseInt(datosExtraidosA1L2.get(5)), datosExtraidosA1L2.get(6), datosExtraidosA1L2.get(7));
		//Creamos el primer Partido.
		Partido partido1 = new Partido(equipo1, equipo2, Integer.parseInt(datosExtraidosA1L1.get(3)), Integer.parseInt(datosExtraidosA1L1.get(4)));
		//Creamos el segundo Partido.
		Partido partido2 = new Partido(equipo3, equipo4, Integer.parseInt(datosExtraidosA1L2.get(3)), Integer.parseInt(datosExtraidosA1L2.get(4)));
		//Creamos el resultado del Partido 1.
		EstadoDeLosPartidos resultadoPartido1 = new EstadoDeLosPartidos(partido1);
		//Creamos el resultado del Partido 2.
		EstadoDeLosPartidos resultadoPartido2 = new EstadoDeLosPartidos(partido2);

		
		if (!pronosticosLeidos.isEmpty()){
			//Pronosticos creados a partir de lectura SQL
			//Creamos el Pronostico del Partido 1 de "Maria".
						
			Ronda rondaUno = new Ronda(partido1, partido2, pronosticosLeidos);
			
		}
		else {
				
			//Pronosticos creados a partir del CSV
			//Creamos el Pronostico del Partido 1 de "Maria".
			
			Pronostico pronosticoPartido1 = new Pronostico(Integer.parseInt(datosExtraidosA2L1.get(0)), Integer.parseInt(datosExtraidosA2L1.get(4)), datosExtraidosA2L1.get(1), datosExtraidosA2L1.get(2), datosExtraidosA2L1.get(3), partido1, resultadoPartido1);
			//Creamos el Pronostico del Partido 2 de "Maria".
			
			Pronostico pronosticoPartido2 = new Pronostico(Integer.parseInt(datosExtraidosA2L2.get(0)), Integer.parseInt(datosExtraidosA2L2.get(4)), datosExtraidosA2L2.get(1), datosExtraidosA2L2.get(2), datosExtraidosA2L2.get(3), partido2, resultadoPartido2);
		
			//Creamos la ronda 1
			Ronda rondaUno = new Ronda(partido1, partido2, pronosticoPartido1, pronosticoPartido2);
		}
		
		
	}
}