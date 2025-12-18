import *;



// JCbuscar - Buscar valor en lista - Devuelve índice o -1
static int JCbuscar(List<Integer> lista, int valor) {
	for (int i = 0; i < lista.size(); i++) {
		if (lista.get(i) == valor) {
			return i;
		}
	}
	return -1;
}

// JCmover - Mover elemento x posiciones a la derecha - Circular
static void JCmover(List<Integer> lista, int indice, int posiciones) {
	int valor = lista.remove(indice);
	int nuevaPosicion = (indice + posiciones) % lista.size();
	lista.add(nuevaPosicion, valor);
}

// JCcomparar - Comparar listas 1 a 1 - Devuelve true si son iguales
static boolean JCcomparar(List<Integer> lista1, List<Integer> lista2) {
	for (int i = 0; i < lista1.size(); i++) {
		if (! lista1.get(i).equals(lista2.get(i))) {
			return false;
		}
	}
	return true;
}

// JCcontiene - Comprobar si lista contiene todos los valores del array
static boolean JCcontiene(List<Integer> lista, int[] valores) {
	for (int i = 0; i < valores. length; i++) {
		boolean encontrado = false;
		for (int j = 0; j < lista.size(); j++) {
			if (lista.get(j) == valores[i]) {
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			return false;
		}
	}
	return true;
}

// JCintercambiar - Intercambiar dos valores en lista
static void JCintercambiar(List<Integer> lista, int indice1, int indice2) {
	int temp = lista.get(indice1);
	lista.set(indice1, lista.get(indice2));
	lista.set(indice2, temp);
}

// JCsinRepetidos - Quitar elementos repetidos - Devuelve nueva lista sin duplicados
static List<Integer> JCsinRepetidos(List<Integer> lista) {
	List<Integer> resultado = new ArrayList<>();
	for (int i = 0; i < lista.size(); i++) {
		if (! resultado.contains(lista.get(i))) {
			resultado.add(lista.get(i));
		}
	}
	return resultado;
}