	package OBJETOS;
	import java.util.*;
	
	
	public class Doc {
	    public static void main(String[] args) {
	        Map<String,Integer> map = new HashMap<>(8, 0.75f); // capacidad inicial 8, load factor 0.75
	
	        map.put("manzanas", 3);                 // inserta ("manzanas" -> 3)
	        map.putIfAbsent("naranjas", 5);         // inserta solo si no existe "naranjas"
	        map.put("peras", null);                 // admite null como valor
	
	        System.out.println(map.get("manzanas"));           // devuelve 3
	        System.out.println(map.getOrDefault("platanos", 0)); // no existe -> imprime 0
	
	        map.computeIfAbsent("uvas", k -> 10);  // si no existe "uvas", la crea con 10
	        map.compute("manzanas", (k, v) -> (v == null) ? 1 : v + 2); // actualiza: 3 -> 5
	
	        map.merge("naranjas", 2, Integer::sum); // naranjas: 5 + 2 = 7
	
	        map.replace("peras", 1); // si "peras" estaba presente (aunque su valor era null), lo reemplaza por 1
	        map.remove("peras");     // elimina la entrada "peras"
	
	        // Iteración segura para lectura simple:
	        for (Map.Entry<String,Integer> e : map.entrySet()) {
	            System.out.println(e.getKey() + " -> " + e.getValue());
	        }
	
	        // Si hay múltiples hilos que modifican el mapa:
	        @SuppressWarnings("unused")
			Map<String,Integer> syncMap = Collections.synchronizedMap(new HashMap<>());
	        // Para concurrencia de alto rendimiento, usar ConcurrentHashMap en lugar de HashMap.
	        
	        // Llamada al ejemplo: ordenar el mismo mapa (por clave y por valor)
	        ejemploOrdenarConTreeMap(map);
	    }

	    /**
	     * Ordena el mismo mapa:
	     *  - por clave: TreeMap (orden natural de las claves)
	     *  - por valor: TreeMap con Comparator que compara claves según los valores en 'mapa'
	     *
	     * Nota importante: el Comparator para ordenar por valor consulta 'mapa' para obtener
	     * los valores. Si posteriormente cambias valores en 'mapa' después de construir el TreeMap,
	     * el árbol puede quedar inconsistente (porque la estructura interna no se reordena automáticamente).
	     * Este enfoque funciona como ejemplo estático para ordenar actualmente el mapa.
	     */
	    private static void ejemploOrdenarConTreeMap(Map<String,Integer> mapa) {
	        // Mostrar original
	        System.out.println("Original (mismo mapa): " + mapa);

	        // --- Ordenar por clave usando TreeMap (ascendente por defecto) ---
	        Map<String, Integer> ordenadoPorClave = new TreeMap<>(mapa);
	        System.out.println("Ordenado por clave (TreeMap, ascendente): " + ordenadoPorClave);

	        // --- Ordenar por valor usando TreeMap ---
	        // Comparator que compara POR EL VALOR asociado en 'mapa'; en caso de empate, desempata por la clave (ascendente)
	        Comparator<String> cmpPorValorLuegoClaveAsc =
	                Comparator.<String, Integer>comparing(mapa::get, Comparator.nullsLast(Comparator.naturalOrder()))
	                          .thenComparing(Comparator.naturalOrder());

	        Map<String, Integer> ordenadoPorValor = new TreeMap<>(cmpPorValorLuegoClaveAsc);
	        ordenadoPorValor.putAll(mapa); // llena el TreeMap; queda ordenado por valor (luego por clave)

	        System.out.println("Ordenado por valor (TreeMap, ascendente valores, nulos al final, claves asc): " + ordenadoPorValor);

	        // --- Ejemplos para invertir ordenes ---
	        // Por clave descendente:
	        Map<String,Integer> porClaveDesc = new TreeMap<>(Comparator.reverseOrder());
	        porClaveDesc.putAll(mapa);
	        System.out.println("Ordenado por clave (TreeMap, descendente): " + porClaveDesc);

	        // Por valor descendente (nulos al final) y desempate por clave descendente:
	        Comparator<String> cmpPorValorDescLuegoClaveDesc =
	                Comparator.<String, Integer>comparing(mapa::get, Comparator.nullsLast(Comparator.reverseOrder()))
	                          .thenComparing(Comparator.reverseOrder());
	        Map<String,Integer> porValorDesc = new TreeMap<>(cmpPorValorDescLuegoClaveDesc);
	        porValorDesc.putAll(mapa);
	        System.out.println("Ordenado por valor (TreeMap, descendente valores, nulos al final, claves desc): " + porValorDesc);
	    }
	}