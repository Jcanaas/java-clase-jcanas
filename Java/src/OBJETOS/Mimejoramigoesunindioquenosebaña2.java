package OBJETOS;
import java.util.*;


public class Mimejoramigoesunindioquenosebaña2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int caseNum = 0; caseNum < t; caseNum++) {
            int n = sc.nextInt();
            Map<String, String> map = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {            	
                String mapa = sc.next();
                String vount = sc.next();
                Boolean esta = false;
                String borrar ="";
                for (String y : map.keySet()) {
                	
                	  if(y.equals(mapa) || y.equals(vount) || map.get(y).equals(mapa) || map.get(y).equals(vount)  ) {
                		  esta = true;
                		  borrar = y;
                	  }
                	}
                if(!esta) {
                	map.put(mapa, vount );
                }else {        
                	map.remove(borrar);
                	map.put(mapa, vount );
}                
                }
            	String buscar = sc.next();
            	for (String y : map.keySet()) {
                	
              	  if(y.equals(buscar)) {
              		  System.out.println(map.get(y)); 
              	  }
              	  if(map.get(y).equals(buscar)) {
              		System.out.println(y); 
            	  }
              	}
            	
                
            }sc.close();
            
            
            
            
            
        }
       
    
}