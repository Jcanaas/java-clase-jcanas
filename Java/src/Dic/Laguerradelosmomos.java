package Dic;
import java.util.*;


public class Laguerradelosmomos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            
            Map<String, Integer> map = new HashMap<>();
            String input =  sc.next();
            while(!input.equals("")){
            	map.putIfAbsent(input, 0);
            	map.merge(input, 1, Integer::sum);
            	input = sc.next();
            	}
            sc.close();
            for (Map.Entry<String,Integer> e : map.entrySet()) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
            
            }
            
            
    }
