package Dic;
import java.util.*;


public class The_Blacklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n = Integer.parseInt(sc.nextLine().trim());
            int ult = 500;
            Map<String, String> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                int idx = line.indexOf(',');
                String num = line.substring(0, idx);
                String criminal = line.substring(idx + 1);
                if(criminal.equals("") && num.startsWith("N")) {
                	criminal = "Nom ocult";
                }else if( !num.startsWith("N")) {
                	criminal = num;
                	num = "N"+String.valueOf(ult);
                	ult++;                	
                }
                map.put(num, criminal);
            }
            String input = sc.nextLine();
            while(!input.equals("DIE")){
            	
            	boolean continuar = true;
            	String rem = "";
            	for (Map.Entry<String,String> e : map.entrySet()) {            		
                    if(e.getValue().equals(input) || e.getKey().equals(input)) {
                    	continuar = false;
                    	rem = e.getKey();                    	
                    }
                }
            	
            	map.remove(rem);
            	if(continuar) {
            		if(!input.startsWith("N")) {
            			map.putIfAbsent("N"+ult, input); 
            		}else {
            			map.putIfAbsent(input, "N"+ult); 
            		}
            		           		
            	}
            	input = sc.nextLine();
            }  sc.close();         
            for (Map.Entry<String,String> e : map.entrySet()) {
                System.out.println(e.getKey() + "=" + e.getValue());
            }     	   
    }
}