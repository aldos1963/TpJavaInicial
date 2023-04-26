package futbol;

public class Aplicacion {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("No ingresaste ningun archivo de datos como argumento!");
			System.out.println(" ");
			System.out.println("Utilizando Base de Datos Sql...");
			//Lector SQL.
			LectorSql lectorSql = new LectorSql();
			lectorSql.obtenerDatos();
			System.out.println("Utilizando Archivos Csv de respaldo...");

			//Lector CSV.
			LectorCsv lectorCsv = new LectorCsv("src/main/resources/resultados.csv", "src/main/resources/pronosticos.csv");
			lectorCsv.obtenerDatos();
			System.out.println(" ");
			System.out.println("Datos procesados, clases creadas, cerrando...");
			System.exit(88);
		}else {
			LectorCsv lectorDeArchivos = new LectorCsv(args[0], args[1]);
			lectorDeArchivos.obtenerDatos();

			System.exit(88);
		}

//Falta //Implementar calculos para decidir un ganador entre los cuatro participantes.
//Echo	//*Recibir como argumento un archivo con los resultados. (En Caso de que la Base de Datos falle se utiliza el archivo).
//Echo	//*Recibir como argumento un archivo con los pronosticos. (En Caso de que la Base de Datos falle se utiliza el archivo).
//Falta	//Recibir como argumento un archivo con la configuracion. (Conexion a Base de Datos, Puntaje por partido, Puntos Extras, etc).
//Falta //Mover instaciacion de clases a las clases archivo para soportar una base de datos en crecimiento(Falta crear reglas para no crear objetos duplicados en el while).
//Falta	//Al leer cada línea del archivo de resultados, se debe verificar que la misma sea correcta: número correcto de campos y que la cantidad de goles sea un número entero.
//Falta	//Implementar un test (Para eso importe Junit)(al menos uno, pero se recomienda hacer más) que calcule el puntaje de una persona en 2 (dos) rondas consecutivas.
//Echo	//*Se suman puntos cuando un participante acierta el resultado de un partido.
//Falta	//Se suman puntos extra cuando el participante acierta todos los resultados de una ronda.
//Falta	//Se suman puntos extra cuando el participante acierta todos los resultados de una fase.
		
	}
}