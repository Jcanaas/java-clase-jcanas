package OBJETOS;
import java.util.*;


public class Mimejoramigoesunindioquenosebaña {
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
                
                if(map.get(mapa) == null) {
                	map.putIfAbsent(mapa, vount);
                }else {
                	map.replace(mapa, vount);
                }
                
            }
            String buscar = sc.next();
            
            System.out.println( map.get(buscar) );
            
            
            
            
        }
        sc.close();
    }
}