package OBJETOS;
import java.util.*;


public class votaciomapas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int caseNum = 0; caseNum < t; caseNum++) {
            int n = Integer.parseInt(sc.nextLine().trim());
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {            	
                String mapa = sc.next();
                map.putIfAbsent(mapa, 1);
                Integer ans = map.get(mapa);
                if (ans == null) {
                	map.put(mapa, 1);
                }
                else{ 
                	 map.merge(mapa, 1, Integer::sum);
                }
            }
            
            
            
        }sc.close();
    }
}