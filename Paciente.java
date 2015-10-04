
pública  clase  Paciente <E> implementa  Comparable <E> {
	
	privada  Cadena nombrePaciente;
	privada  Cadena disease;
	privada  Cadena priority;

	pública  Paciente (Cadena  nombrePaciente, Cadena  disease, Cadena  priority) {
		súper ();
		este. nombrePaciente = nombrePaciente;
		esta. disease = disease;
		esta. priority = Prioridad;
	}

	pública  int  compareTo (E  Paciente) {
		// Método generado automáticamente TODO talón
		regresar  este. priority. compareTo (((Paciente) Paciente). getPrioridad ());
	}

	público  Cadena  getNombrePaciente () {
		volver nombrePaciente;
	}

	pública  vacío  setNombrePaciente (Cadena  nombrePaciente) {
		este. nombrePaciente = nombrePaciente;
	}

	público  Cadena  getEnfermedad () {
		volver disease;
	}

	pública  vacío  setEnfermedad (Cadena  disease) {
		esta. disease = disease;
	}

	público  Cadena  getPrioridad () {
		volver priority;
	}

	pública  vacío  setPrioridad (Cadena  priority) {
		esta. priority = Prioridad;
	}

	
}
