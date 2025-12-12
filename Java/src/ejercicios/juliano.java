package ejercicios;

import java.util.*;

public class juliano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> dias = new ArrayList<>(Arrays.asList(31,28,31,30,31,30,31,31,30,31,30,31));
        int mes = (sc.nextInt() -1 );
        int dia = sc.nextInt();
        if (dias.get(mes) < dia) {
			System.out.println("DATA INVALIDA");
		} else {
			System.out.println("DATA VALIDA");
			int suma = mes;
			for(int i = 0; i < (mes - 1); i++) {
				suma = suma + dias.get(i);
			}
			System.out.println("Estem en el dia " + suma + " del any");
		}
        sc.close();
        
        
    }
}
