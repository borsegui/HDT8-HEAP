# HDT8-HEAP
pública  interfaz  PriorityQueue <E extiende  Comparable <E>>
{
	pública  E  GetFirst ();
	// Pre: estaVacia ()
	// Post: devuelve el valor mínimo en la cola de prioridad
	
	pública  E  remove ();
	// Pre: estaVacia ()
	// Mensaje: devoluciones y quita valor mínimo de la cola
	
	pública  void  add (E  valor);
	// Pre: el valor no es nulo comparables
	// Mensaje: valor se añade a la cola de prioridad
	
	pública  booleano  estaVacia ();
	// Post: devuelve true si y sólo si no hay elementos están en la cola
	
	pública  int  tamaño ();
	// Post: devuelve el número de elementos en cola
	
	pública  vacío  claro ();
	// Mensaje: elimina todos los elementos de queu

}
