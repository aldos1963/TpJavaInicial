package lector;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Lectura 
{
	public Lectura(){}
	//Metodo que utiliza Scanner para recorrer el contenido del archivo y extraer linea por linea.
	public static List<List<String>> lectorArchivo (String direccionArchivo) throws FileNotFoundException
	{	
		Scanner scannerDatos = new Scanner(new File(direccionArchivo));
		List<List<String>> grabarDatos = new ArrayList<>();
		scannerDatos.useDelimiter(";");
		while (scannerDatos.hasNextLine()) 
		{
	        grabarDatos.add(conseguirDatosDeLinea(scannerDatos.nextLine()));
	    }		
		return grabarDatos;
	}
	//Metodo para guardar las lineas en un Array.
	public static List<String> conseguirDatosDeLinea(String linea) 
	{
	    List<String> datos = new ArrayList<String>();
	    try (Scanner scannerLinea = new Scanner(linea)) 
	    {
	        scannerLinea.useDelimiter(";");
	        while (scannerLinea.hasNext()) 
	        {
	            datos.add(scannerLinea.next());
	        }
	    }
	    return datos;
	}
	//Metodo para comprobar si un String puede ser convertido a numero.
	public static boolean comprobarNumero(String str)
	{
		return str != null && str.matches("[0-9.]+");
	}
	
}