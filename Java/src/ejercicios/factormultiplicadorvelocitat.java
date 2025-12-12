package ejercicios;
import java.util.*;
public class factormultiplicadorvelocitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> llistaS = new ArrayList<>(Arrays.asList(sc.next().split(",")));
        List<Integer> llista = new ArrayList<>();
        for(int i = 0; i < llistaS.size(); i++) {
        	llista.add(Integer.parseInt(llistaS.get(i)));
        }
        int m = sc.nextInt();
        sc.nextLine();
        int cont = 0;
        List<String> llistaSv = new ArrayList<>(Arrays.asList(sc.next().split(",")));
        List<Integer> llistav = new ArrayList<>();
        for(int i = 0; i < llistaSv.size(); i++) {
        	llistav.add(Integer.parseInt(llistaS.get(i)));
        }
        for(int i = 0; i < llistaS.size(); i++) {
        	if (llistav.get(i) >= (llista.get(i) * m) ) {
        		cont++;
        	}
        }
        if (cont == (llista.size() - 1 )) {
        	System.out.println("BEN APROFITAT!");
        } else {
        	System.out.println("ETS UN PAQUET!");
        }
        sc.close();
        }
    }