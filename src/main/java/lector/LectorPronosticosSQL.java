package lector;

import java.util.ArrayList;
import java.sql.*;
import static conexion.SQL.ConectorSQL.DB_URL;
import static conexion.SQL.ConectorSQL.USER;
import static conexion.SQL.ConectorSQL.PASS;


public class LectorPronosticosSQL {
	
	public static ArrayList<Pronostico> ObtenerPronosticos(){
	    Connection conexion = null;
	    Statement consulta = null;
	    ArrayList<Pronostico> pronosticosLeidos = new ArrayList<Pronostico>();  
	    
	    try {
		    //apertura conexion
		      conexion = DriverManager.getConnection(DB_URL,USER,PASS);
		      	    	
		    //ejecutar consulta
		      consulta = conexion.createStatement();
		      String sql = "SELECT equipo1IdP, gana1P, empatap, gana2P, equipo2IdP FROM apuestas.pronostico";
		      
		    //En la variable resultado obtendremos todas filas que nos devolvió la consulta SQL
		      ResultSet resultado = consulta.executeQuery(sql);
		      
		    //obtener objetos e instanciarlos
		      while(resultado.next()) {
	    	 	  	    	  
		    	  int equipo1   = resultado.getInt("equipo1IdP");
		    	  int equipo2   = resultado.getInt("equipo2IdP");
	              String gana1  = resultado.getString("gana1P");
	              String gana2  = resultado.getString("gana2P");
	              String empata = resultado.getString("empatap");
		    	  
	              Pronostico Pronostico = new Pronostico(equipo1,equipo2,gana1,gana2,empata);
	              pronosticosLeidos.add(Pronostico);
	        }   
		    	  
		    
		    //cerrar BD y conexion
		      resultado.close();
		      consulta.close();
		      conexion.close();
		      
		      
		
	    } catch (SQLException se) {
            // Excepción ante problemas de conexión
            se.printStackTrace();
        } finally {
            // Esta sentencia es para que ante un problema con la base igual se cierren las conexiones
            try {
                if (consulta != null)
                    consulta.close();
            } catch (SQLException se2) {
            }
            try {
                if (conexion != null)
                    conexion.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
	    
		return pronosticosLeidos;
	}
     
}
