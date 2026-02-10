package OBJETOS;
import java.util.*;


public class Capitals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int caseNum = 0; caseNum < t; caseNum++) {
            int n = Integer.parseInt(sc.nextLine().trim());
            Map<String, String> map = new HashMap<>();
            for (int i = 0; i < n - 1; i++) {
                String line = sc.nextLine();
                int idx = line.indexOf('-');
                String country = line.substring(0, idx);
                String capital = line.substring(idx + 1);
                map.put(country, capital);
            }
            
            String ans = map.get(sc.nextLine());
            if (ans == null) System.out.println("NO HO SE");
            else System.out.println(ans);
        }
    }
}