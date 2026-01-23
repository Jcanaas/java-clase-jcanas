package ejercicios;

import java.util.*;

public class matriuidentitat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[][] matriu = new int[n][n];
        
            
            for (int w = 0; w < n; w++) {
                for (int z = 0; z < n; z++) {
                    if (w == z) {
                    	matriu[w][z] = 1;
                    }else {
                    	matriu[w][z] = 0;
                    }
                    System.out.print(matriu[w][z]+ " ");
                }
                System.out.println();
            }
        }
   }
    
            