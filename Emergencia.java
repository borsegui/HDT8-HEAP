
importación  java.io.BufferedReader;
importación  java.io.File;
importación  java.io.FileNotFoundException;
importación  java.io.FileReader;
importación  java.io.IOException;
importación  java.util.Vector;

pública  clase  Emergencia {
	privada  Vector <Paciente> Pacientes =  nuevo  vector <Paciente> ();
	privadas  int cantPatients =  0;
	públicos  vacíos  entrarPacientes (Cadena  archivo) lanza  FileNotFoundException {
		File archivo =  nuevo  archivo (archivo);
		Cadena palabra =  "";
		Cuerda [] Palabras;
		BufferedReader br =  nuevo  BufferedReader (nueva  FileReader (archivo));
	    Cadena línea =  nula;
        tratar {
			mientras que ((línea = br. readLine ())! =  nula) {
			    Palabras = línea. split (",");
			    Pacientes. add (nueva  Paciente (Palabras [0]. reemplazar ("", ""), Palabras [1]. reemplazará ("", ""), Palabras [2]. reemplazará ("", ""))) ;   
			    cantPatients + = 1;
			}
		} Catch (IOException e) {
			e. printStackTrace ();
		}
	} 
	// Ordena La Lista del txt proporcionado
	
	público  Cadena  devolverPacientesEnOrden () {
		Cadena pacientesEnOrden = "";
		VectorHeap2 montón =  nuevos  VectorHeap2 (Pacientes);
		para (int i = 0; i <cantPatients; i ++) {
			Paciente Paciente = (Paciente) del montón. Remove ();
			pacientesEnOrden = pacientesEnOrden + paciente . getNombrePaciente() + "  " + " , " + paciente . getEnfermedad() + "  " + " , " + paciente . getPrioridad() + " \n " ;
		}
		volver pacientesEnOrden;
	}
}
