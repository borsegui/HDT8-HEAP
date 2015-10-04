import java.util.PriorityQueue;

public class Clinica {

	private PriorityQueue<Paciente> pacientes = new PriorityQueue<Paciente>();
	
	public void AgregarPaciente(String paciente){
		String[] Datos = paciente.split(",");
		Paciente nuevoPaciente = new Paciente(Datos[0], Datos[1], Datos[2]);
	
		pacientes.offer(nuevoPaciente);
	}
	
	
	public void MostrarLista(){
		int cont =pacientes.size();
		for (int i=0; i< cont; i++){
			Paciente salida = pacientes.poll();
			System.out.println(salida.getNombre() + "," + salida.getEnfermedad() + " , " + salida.getPrioridad());
		}
		
	}
	
}
