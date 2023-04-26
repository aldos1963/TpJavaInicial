package futbol;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.*;

public class LectorCsv {
	
	 String rutaArchivoPronosticos;
	 String rutaArchivoResultados;
	 
	 public LectorCsv(String rutaArchivoResultados, String rutaArchivoPronosticos) {
		 
		 this.rutaArchivoResultados = rutaArchivoResultados;
		 this.rutaArchivoPronosticos = rutaArchivoPronosticos;
	 }
	 
	 @SuppressWarnings("unused")
	public void obtenerDatos(){
		 
		 ArrayList<ArchivoResultados> resultados =  new ArrayList<ArchivoResultados>();
		 ArrayList<ArchivoPronosticos> pronosticos =  new ArrayList<ArchivoPronosticos>();
		 
	     try {
	    	CSVReader reader = new CSVReaderBuilder(new FileReader(rutaArchivoResultados)).withSkipLines(1).build();
	    	String[] nextLine;
	    	while((nextLine = reader.readNext()) != null) {
				ArchivoResultados archivoResultados = new ArchivoResultados();
				archivoResultados.setIdResultados(Integer.parseInt(nextLine[0]));
				archivoResultados.setFase(Integer.parseInt(nextLine[1]));
				archivoResultados.setRonda(Integer.parseInt(nextLine[2]));
				archivoResultados.setEquipo1(nextLine[3]);
				archivoResultados.setEquipo2(nextLine[4]);
				archivoResultados.setCantGoles1(Integer.parseInt(nextLine[5]));
				archivoResultados.setCantGoles2(Integer.parseInt(nextLine[6]));
				resultados.add(archivoResultados);
	    	}
		} catch (IllegalStateException | IOException | CsvValidationException e) {
			e.printStackTrace();
		}
	     
	    try {
		   CSVReader reader = new CSVReaderBuilder(new FileReader(rutaArchivoPronosticos)).withSkipLines(1).build();
		   String[] nextLine;
		   while((nextLine = reader.readNext()) != null) {
			   ArchivoPronosticos archivoPronosticos = new ArchivoPronosticos();
			   archivoPronosticos.setIdPronostico(nextLine[0]);
			   archivoPronosticos.setParticipante(nextLine[1]);
			   archivoPronosticos.setEquipo1(nextLine[2]);
			   archivoPronosticos.setEquipo2(nextLine[3]);
			   archivoPronosticos.setGana1(nextLine[4]);
			   archivoPronosticos.setGana2(nextLine[5]);
			   archivoPronosticos.setEmpata(nextLine[6]);
			   pronosticos.add(archivoPronosticos);
		   }
		   
		   //La idea era instanciar las clases dentro de las clases "ArchivoPronosticos" y "ArchivoResultados" lamentablemente no me alcanso el tiempo.
		   //De ese modo la base de datos o archivo podrian crecer indefinidamente y no habria que asignar datos manualmente, pero faltan las condiciones para no crear 2 veces la misma clase o participantes y equipos...
		   //Por el momento se deja aca el instanciado de las clases lo que podria ser un problema si crece la base de datos o los datos en los archivos csv.
		   
		   //Participantes.
		   Participante mariana = pronosticos.get(0).crearParticipante();
		   Participante pedro = pronosticos.get(14).crearParticipante();
		   Participante juan = pronosticos.get(28).crearParticipante();
		   Participante marcos = pronosticos.get(42).crearParticipante();
		   
		   //Equipos.
		   Equipo argentina = resultados.get(0).crearEquipo1();
		   Equipo francia = resultados.get(0).crearEquipo2();
		   Equipo arabiaSaudita = resultados.get(1).crearEquipo1();
		   Equipo chile = resultados.get(1).crearEquipo2();
		   Equipo polonia = resultados.get(2).crearEquipo1();
		   Equipo brazil = resultados.get(2).crearEquipo2();
		   Equipo mexico = resultados.get(3).crearEquipo1();
		   Equipo inglaterra = resultados.get(3).crearEquipo2();
		    
		   //Partidos.
		   Partido argentinaVsFrancia = resultados.get(0).crearPartido(argentina, francia, resultados.get(0).getCantGoles1(), resultados.get(0).getCantGoles2());
		   Partido arabiaSauditaVsChile = resultados.get(1).crearPartido(arabiaSaudita, chile, resultados.get(1).getCantGoles1(), resultados.get(1).getCantGoles2());
		   Partido poloniaVsBrazil = resultados.get(2).crearPartido(polonia, brazil, resultados.get(2).getCantGoles1(), resultados.get(2).getCantGoles2());
		   Partido mexicoVsInglaterra = resultados.get(3).crearPartido(mexico, inglaterra, resultados.get(3).getCantGoles1(), resultados.get(3).getCantGoles2());
		   Partido argentinaVsChile = resultados.get(4).crearPartido(argentina, chile, resultados.get(4).getCantGoles1(), resultados.get(4).getCantGoles2());
		   Partido franciaVsArabiaSaudita = resultados.get(5).crearPartido(francia, arabiaSaudita, resultados.get(5).getCantGoles1(), resultados.get(5).getCantGoles2());
		   Partido poloniaVsInglaterra = resultados.get(6).crearPartido(polonia, inglaterra, resultados.get(6).getCantGoles1(), resultados.get(6).getCantGoles2());
		   Partido brazilVsMexico = resultados.get(7).crearPartido(brazil, mexico, resultados.get(7).getCantGoles1(), resultados.get(7).getCantGoles2());
		   Partido argentinaVsArabiaSaudita = resultados.get(8).crearPartido(argentina, arabiaSaudita, resultados.get(8).getCantGoles1(), resultados.get(8).getCantGoles2());
		   Partido poloniaVsMexico = resultados.get(9).crearPartido(polonia, mexico, resultados.get(9).getCantGoles1(), resultados.get(9).getCantGoles2());
		   Partido argentinaVsMexico = resultados.get(10).crearPartido(argentina, mexico, resultados.get(10).getCantGoles1(), resultados.get(10).getCantGoles2());
		   Partido arabiaSauditaVsPolonia = resultados.get(11).crearPartido(arabiaSaudita, polonia, resultados.get(11).getCantGoles1(), resultados.get(11).getCantGoles2());
		   Partido argentinaVsPolonia = resultados.get(12).crearPartido(argentina, polonia, resultados.get(12).getCantGoles1(), resultados.get(12).getCantGoles2());
		   Partido poloniaVsArgentina = resultados.get(13).crearPartido(polonia, argentina, resultados.get(13).getCantGoles1(), resultados.get(13).getCantGoles2());
		     
		   //Rondas.
		   Ronda ronda1Fase1 = resultados.get(0).crearRonda(resultados.get(0).getRonda(), argentinaVsFrancia, arabiaSauditaVsChile, poloniaVsBrazil, mexicoVsInglaterra);
		   Ronda ronda2Fase1 = resultados.get(4).crearRonda(resultados.get(4).getRonda(), argentinaVsChile, franciaVsArabiaSaudita, poloniaVsInglaterra, brazilVsMexico);
		   Ronda ronda1Fase2 = resultados.get(8).crearRonda(resultados.get(8).getRonda(), argentinaVsArabiaSaudita, poloniaVsMexico);
		   Ronda ronda2Fase2 = resultados.get(10).crearRonda(resultados.get(10).getRonda(), argentinaVsMexico, arabiaSauditaVsPolonia);
		   Ronda ronda1Fase3 = resultados.get(12).crearRonda(resultados.get(12).getRonda(), argentinaVsPolonia);
		   Ronda ronda2Fase3 = resultados.get(13).crearRonda(resultados.get(13).getRonda(), poloniaVsArgentina);
		     
		   //Fases.
		   Fase fase1 = resultados.get(0).crearFase(resultados.get(0).getFase(), ronda1Fase1, ronda2Fase1);
		   Fase fase2 = resultados.get(8).crearFase(resultados.get(8).getFase(), ronda1Fase2, ronda2Fase2);
		   Fase fase3 = resultados.get(12).crearFase(resultados.get(12).getFase(), ronda1Fase3, ronda2Fase3);
		   
		   //Pronosticos.
		   Pronostico partido1Mariana = pronosticos.get(0).crearPronostico(mariana, argentinaVsFrancia, argentina, pronosticos.get(0).getGana1(), pronosticos.get(0).getGana2(), pronosticos.get(0).getEmpata());
		   Pronostico partido2Mariana = pronosticos.get(1).crearPronostico(mariana, arabiaSauditaVsChile, arabiaSaudita, pronosticos.get(1).getGana1(), pronosticos.get(1).getGana2(), pronosticos.get(1).getEmpata());
		   Pronostico partido3Mariana = pronosticos.get(2).crearPronostico(mariana, poloniaVsBrazil, polonia, pronosticos.get(2).getGana1(), pronosticos.get(2).getGana2(), pronosticos.get(2).getEmpata());
		   Pronostico partido4Mariana = pronosticos.get(3).crearPronostico(mariana, mexicoVsInglaterra, mexico, pronosticos.get(3).getGana1(), pronosticos.get(3).getGana2(), pronosticos.get(3).getEmpata());
		   Pronostico partido5Mariana = pronosticos.get(4).crearPronostico(mariana, argentinaVsChile, argentina, pronosticos.get(4).getGana1(), pronosticos.get(4).getGana2(), pronosticos.get(4).getEmpata());
		   Pronostico partido6Mariana = pronosticos.get(5).crearPronostico(mariana, franciaVsArabiaSaudita, arabiaSaudita, pronosticos.get(5).getGana1(), pronosticos.get(5).getGana2(), pronosticos.get(5).getEmpata());
		   Pronostico partido7Mariana = pronosticos.get(6).crearPronostico(mariana, poloniaVsInglaterra, polonia, pronosticos.get(6).getGana1(), pronosticos.get(6).getGana2(), pronosticos.get(6).getEmpata());
		   Pronostico partido8Mariana = pronosticos.get(7).crearPronostico(mariana, brazilVsMexico, brazil, pronosticos.get(7).getGana1(), pronosticos.get(7).getGana2(), pronosticos.get(7).getEmpata());
		   Pronostico partido9Mariana = pronosticos.get(8).crearPronostico(mariana, argentinaVsArabiaSaudita, argentina, pronosticos.get(8).getGana1(), pronosticos.get(8).getGana2(), pronosticos.get(8).getEmpata());
		   Pronostico partido10Mariana = pronosticos.get(9).crearPronostico(mariana, poloniaVsMexico, polonia, pronosticos.get(9).getGana1(), pronosticos.get(9).getGana2(), pronosticos.get(9).getEmpata());
		   Pronostico partido11Mariana = pronosticos.get(10).crearPronostico(mariana, argentinaVsMexico, argentina, pronosticos.get(10).getGana1(), pronosticos.get(10).getGana2(), pronosticos.get(10).getEmpata());
		   Pronostico partido12Mariana = pronosticos.get(11).crearPronostico(mariana, arabiaSauditaVsPolonia, arabiaSaudita, pronosticos.get(11).getGana1(), pronosticos.get(11).getGana2(), pronosticos.get(11).getEmpata());
		   Pronostico partido13Mariana = pronosticos.get(12).crearPronostico(mariana, argentinaVsPolonia, argentina, pronosticos.get(12).getGana1(), pronosticos.get(12).getGana2(), pronosticos.get(12).getEmpata());
		   Pronostico partido14Mariana = pronosticos.get(13).crearPronostico(mariana, poloniaVsArgentina, argentina, pronosticos.get(13).getGana1(), pronosticos.get(13).getGana2(), pronosticos.get(13).getEmpata());
		   Pronostico partido1Pedro = pronosticos.get(14).crearPronostico(pedro, argentinaVsFrancia, argentina, pronosticos.get(14).getGana1(), pronosticos.get(14).getGana2(), pronosticos.get(14).getEmpata());
		   Pronostico partido2Pedro = pronosticos.get(15).crearPronostico(pedro, arabiaSauditaVsChile, arabiaSaudita, pronosticos.get(15).getGana1(), pronosticos.get(15).getGana2(), pronosticos.get(15).getEmpata());
		   Pronostico partido3Pedro = pronosticos.get(16).crearPronostico(pedro, poloniaVsBrazil, polonia, pronosticos.get(16).getGana1(), pronosticos.get(16).getGana2(), pronosticos.get(16).getEmpata());
		   Pronostico partido4Pedro = pronosticos.get(17).crearPronostico(pedro, mexicoVsInglaterra, mexico, pronosticos.get(17).getGana1(), pronosticos.get(17).getGana2(), pronosticos.get(17).getEmpata());
		   Pronostico partido5Pedro = pronosticos.get(18).crearPronostico(pedro, argentinaVsChile, chile, pronosticos.get(18).getGana1(), pronosticos.get(18).getGana2(), pronosticos.get(18).getEmpata());
		   Pronostico partido6Pedro = pronosticos.get(19).crearPronostico(pedro, franciaVsArabiaSaudita, francia, pronosticos.get(19).getGana1(), pronosticos.get(19).getGana2(), pronosticos.get(19).getEmpata());
		   Pronostico partido7Pedro = pronosticos.get(20).crearPronostico(pedro, poloniaVsInglaterra, inglaterra, pronosticos.get(20).getGana1(), pronosticos.get(20).getGana2(), pronosticos.get(20).getEmpata());
		   Pronostico partido8Pedro = pronosticos.get(21).crearPronostico(pedro, brazilVsMexico, mexico, pronosticos.get(21).getGana1(), pronosticos.get(21).getGana2(), pronosticos.get(21).getEmpata());
		   Pronostico partido9Pedro = pronosticos.get(22).crearPronostico(pedro, argentinaVsArabiaSaudita, argentina, pronosticos.get(22).getGana1(), pronosticos.get(22).getGana2(), pronosticos.get(22).getEmpata());
		   Pronostico partido10Pedro = pronosticos.get(23).crearPronostico(pedro, poloniaVsMexico, mexico, pronosticos.get(23).getGana1(), pronosticos.get(23).getGana2(), pronosticos.get(23).getEmpata());
		   Pronostico partido11Pedro = pronosticos.get(24).crearPronostico(pedro, argentinaVsMexico, argentina, pronosticos.get(24).getGana1(), pronosticos.get(24).getGana2(), pronosticos.get(24).getEmpata());
		   Pronostico partido12Pedro = pronosticos.get(25).crearPronostico(pedro, arabiaSauditaVsPolonia, arabiaSaudita, pronosticos.get(25).getGana1(), pronosticos.get(25).getGana2(), pronosticos.get(25).getEmpata());
		   Pronostico partido13Pedro = pronosticos.get(26).crearPronostico(pedro, argentinaVsPolonia, polonia, pronosticos.get(26).getGana1(), pronosticos.get(26).getGana2(), pronosticos.get(26).getEmpata());
		   Pronostico partido14Pedro = pronosticos.get(27).crearPronostico(pedro, poloniaVsArgentina, argentina, pronosticos.get(27).getGana1(), pronosticos.get(27).getGana2(), pronosticos.get(27).getEmpata());
		   Pronostico partido1Juan = pronosticos.get(28).crearPronostico(juan, argentinaVsFrancia, argentina, pronosticos.get(28).getGana1(), pronosticos.get(28).getGana2(), pronosticos.get(28).getEmpata());
		   Pronostico partido2Juan = pronosticos.get(29).crearPronostico(juan, arabiaSauditaVsChile, arabiaSaudita, pronosticos.get(29).getGana1(), pronosticos.get(29).getGana2(), pronosticos.get(29).getEmpata());
		   Pronostico partido3Juan = pronosticos.get(30).crearPronostico(juan, poloniaVsBrazil, brazil, pronosticos.get(30).getGana1(), pronosticos.get(30).getGana2(), pronosticos.get(30).getEmpata());
		   Pronostico partido4Juan = pronosticos.get(31).crearPronostico(juan, mexicoVsInglaterra, mexico, pronosticos.get(31).getGana1(), pronosticos.get(31).getGana2(), pronosticos.get(31).getEmpata());
		   Pronostico partido5Juan = pronosticos.get(32).crearPronostico(juan, argentinaVsChile, argentina, pronosticos.get(32).getGana1(), pronosticos.get(32).getGana2(), pronosticos.get(32).getEmpata());
		   Pronostico partido6Juan = pronosticos.get(33).crearPronostico(juan, franciaVsArabiaSaudita, arabiaSaudita, pronosticos.get(33).getGana1(), pronosticos.get(33).getGana2(), pronosticos.get(33).getEmpata());
		   Pronostico partido7Juan = pronosticos.get(34).crearPronostico(juan, poloniaVsInglaterra, inglaterra, pronosticos.get(34).getGana1(), pronosticos.get(34).getGana2(), pronosticos.get(34).getEmpata());
		   Pronostico partido8Juan = pronosticos.get(35).crearPronostico(juan, brazilVsMexico, mexico, pronosticos.get(35).getGana1(), pronosticos.get(35).getGana2(), pronosticos.get(35).getEmpata());
		   Pronostico partido9Juan = pronosticos.get(36).crearPronostico(juan, argentinaVsArabiaSaudita, argentina, pronosticos.get(36).getGana1(), pronosticos.get(36).getGana2(), pronosticos.get(36).getEmpata());
		   Pronostico partido10Juan = pronosticos.get(37).crearPronostico(juan, poloniaVsMexico, mexico, pronosticos.get(37).getGana1(), pronosticos.get(37).getGana2(), pronosticos.get(37).getEmpata());
		   Pronostico partido11Juan = pronosticos.get(38).crearPronostico(juan, argentinaVsMexico, argentina, pronosticos.get(38).getGana1(), pronosticos.get(38).getGana2(), pronosticos.get(38).getEmpata());
		   Pronostico partido12Juan = pronosticos.get(39).crearPronostico(juan, arabiaSauditaVsPolonia, polonia, pronosticos.get(39).getGana1(), pronosticos.get(39).getGana2(), pronosticos.get(39).getEmpata());
		   Pronostico partido13Juan = pronosticos.get(40).crearPronostico(juan, argentinaVsPolonia, argentina, pronosticos.get(40).getGana1(), pronosticos.get(40).getGana2(), pronosticos.get(40).getEmpata());
		   Pronostico partido14Juan = pronosticos.get(41).crearPronostico(juan, poloniaVsArgentina, argentina, pronosticos.get(41).getGana1(), pronosticos.get(41).getGana2(), pronosticos.get(41).getEmpata());
		   Pronostico partido1Marcos = pronosticos.get(42).crearPronostico(marcos, argentinaVsFrancia, argentina, pronosticos.get(42).getGana1(), pronosticos.get(42).getGana2(), pronosticos.get(42).getEmpata());
		   Pronostico partido2Marcos = pronosticos.get(43).crearPronostico(marcos, arabiaSauditaVsChile, chile, pronosticos.get(43).getGana1(), pronosticos.get(43).getGana2(), pronosticos.get(43).getEmpata());
		   Pronostico partido3Marcos = pronosticos.get(44).crearPronostico(marcos, poloniaVsBrazil, brazil, pronosticos.get(44).getGana1(), pronosticos.get(44).getGana2(), pronosticos.get(44).getEmpata());
		   Pronostico partido4Marcos = pronosticos.get(45).crearPronostico(marcos, mexicoVsInglaterra, mexico, pronosticos.get(45).getGana1(), pronosticos.get(45).getGana2(), pronosticos.get(45).getEmpata());
		   Pronostico partido5Marcos = pronosticos.get(46).crearPronostico(marcos, argentinaVsChile, argentina, pronosticos.get(46).getGana1(), pronosticos.get(46).getGana2(), pronosticos.get(46).getEmpata());
		   Pronostico partido6Marcos = pronosticos.get(47).crearPronostico(marcos, franciaVsArabiaSaudita, arabiaSaudita, pronosticos.get(47).getGana1(), pronosticos.get(47).getGana2(), pronosticos.get(47).getEmpata());
		   Pronostico partido7Marcos = pronosticos.get(48).crearPronostico(marcos, poloniaVsInglaterra, polonia, pronosticos.get(48).getGana1(), pronosticos.get(48).getGana2(), pronosticos.get(48).getEmpata());
		   Pronostico partido8Marcos = pronosticos.get(49).crearPronostico(marcos, brazilVsMexico, brazil, pronosticos.get(49).getGana1(), pronosticos.get(49).getGana2(), pronosticos.get(49).getEmpata());
		   Pronostico partido9Marcos = pronosticos.get(50).crearPronostico(marcos, argentinaVsArabiaSaudita, argentina, pronosticos.get(50).getGana1(), pronosticos.get(50).getGana2(), pronosticos.get(50).getEmpata());
		   Pronostico partido10Marcos = pronosticos.get(51).crearPronostico(marcos, poloniaVsMexico, polonia, pronosticos.get(51).getGana1(), pronosticos.get(51).getGana2(), pronosticos.get(51).getEmpata());
		   Pronostico partido11Marcos = pronosticos.get(52).crearPronostico(marcos, argentinaVsMexico, argentina, pronosticos.get(52).getGana1(), pronosticos.get(52).getGana2(), pronosticos.get(52).getEmpata());
		   Pronostico partido12Marcos = pronosticos.get(53).crearPronostico(marcos, arabiaSauditaVsPolonia, polonia, pronosticos.get(53).getGana1(), pronosticos.get(53).getGana2(), pronosticos.get(53).getEmpata());
		   Pronostico partido13Marcos = pronosticos.get(54).crearPronostico(marcos, argentinaVsPolonia, argentina, pronosticos.get(54).getGana1(), pronosticos.get(54).getGana2(), pronosticos.get(54).getEmpata());
		   Pronostico partido14Marcos = pronosticos.get(55).crearPronostico(marcos, poloniaVsArgentina, argentina, pronosticos.get(55).getGana1(), pronosticos.get(55).getGana2(), pronosticos.get(55).getEmpata());
		   
		   System.out.println("Mariana tiene " +mariana.getPuntos()+ " puntos.");
		   System.out.println("Pedro tiene " +pedro.getPuntos()+ " puntos.");
		   System.out.println("Juan tiene " +juan.getPuntos()+ " puntos.");
		   System.out.println("Marcos tiene " +marcos.getPuntos()+ " puntos.");
		   
		} catch (IllegalStateException | IOException | CsvValidationException e) {
			e.printStackTrace();
		}
	 }
}