//UNIVERSIDAD DEL VALLE DE GUATEMALA
//PABLO IGNACIO ARRIOLA DIAZ
 //DIEGO ALEJANDRO DE LEON PUAC
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Interfaz {
	public static void main(String[] args) {
		
	   	  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      Clinica clinica = new Clinica();
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("pacientes.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         
	         String linea;
	         
	         while((linea=br.readLine())!=null){
	        	 clinica.AgregarPaciente(linea);
	         }
	 		
	         clinica.MostrarLista();
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
	}
}
	
