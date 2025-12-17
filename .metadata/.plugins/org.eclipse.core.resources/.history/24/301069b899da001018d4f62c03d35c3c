package ejercicios;

import java.util.*;

public class Parada_en_Boxers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        List<Integer> listav = new ArrayList<>();
       int n = sc.nextInt();
       sc.nextLine();
       for(int i = 0; i < n; i++) {
    	  lista.add(sc.next()); 
       }
       for(int i = 0; i < n; i++) {
     	  listav.add((n - i)-1); 
        }
       List<String> listad = new ArrayList<>();
       
       for(int i = 0; i < n; i++) {
    	  int rest = sc.nextInt();
    	  int cambiar = listav.get(i);
    	  for(int w = 0; w < n; w++) {
    		  if( listav.get(w) < listav.get(i) && listav.get(w) < (cambiar - rest) ) {
    			  Collections.replaceAll(listav, listav.get(w), listav.get(w)+1);
    		  }
    	  }
    	  Collections.replaceAll(listav, cambiar, (listav.get(i) - rest));
    	  
       }
       for(int i = 0; i < n; i++) {
      	  listad.add(lista.get((listav.get(i)- 1))); 
         }
       System.out.println(listad);
       
    	
       }
    }