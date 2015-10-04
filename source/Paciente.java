
public class Paciente implements Comparable<Paciente> {

	//Atributos
	private String nombre;
	private String enfermedad;
	private String prioridad;
	
	
	
	public Paciente(String nombre, String enfermedad, String prioridad) {
		this.nombre = nombre;
		this.enfermedad = enfermedad;
		this.prioridad = prioridad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public int compareTo(Paciente paciente) {
		// TODO Auto-generated method stub
		char c1 = prioridad.charAt(1);
		int ascii1 = (int)c1;
		
		char c2 = paciente.prioridad.charAt(1);
		
		int num1 = 0;
		switch (c1){
		case 'A':  num1 = 1;break;
		case 'B':  num1 = 2;break;
		case 'C':  num1 = 3;break;
		case 'D':  num1 = 4;break;
		case 'E':  num1 = 5;break;
		}
		
		int num2 = 0;
		switch (c2){
		case 'A':  num2 = 1;break;
		case 'B':  num2 = 2;break;
		case 'C':  num2 = 3;break;
		case 'D':  num2 = 4;break;
		case 'E':  num2 = 5;break;
		}
		
		return num1 - num2;
	}
	
	
	
}
