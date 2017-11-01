import java.util.*;
public class Parcial_2 {

public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tamaño del arreglo");
        int N = sc.nextInt();
        int Tm_1 [] = new int [N];
        int Tm_2 [] = new int [N];
        
        for (int i = 0; i < Tm_1.length; i++) {
            
        	System.out.println("Escriba el numero en la posicion " + (i+1));
            Tm_1[i] = sc.nextInt();
            
        }
        
        
        for (int i = 0; i < Tm_1.length ; i++) {
            int Valor = 1;
            for (int j = 0; j < Tm_1.length; j++) {
                
               if(i!=j)
               {
                   Valor *= Tm_1[j];
                   Tm_2[i] = Valor; 
               }  
            }  
        }
        
        System.out.println("\n");
        
         for (int L = 0; L < Tm_1.length; L++) {
                    
                    System.out.println("El Numero en la Posicion " + (L+1) + " Es " + Tm_2[L]);
                    
                }
        
    }
    
}
