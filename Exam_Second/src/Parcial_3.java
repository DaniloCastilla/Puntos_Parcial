	import java.util.Scanner;

	public class Parcial_3 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Digite tamaño del arreglo");
			int T = sc.nextInt();
			
			int Tm [] = new int [T] ;
			
			System.out.println("Escriba los numeros dentro del arreglo");
			
			for (int i = 0; i <  Tm.length; i++) {
				
				Tm[i] = sc.nextInt(); 
				
			}
			
			int Aux = 0;
			
			for (int i = 0; i < Tm.length; i++) {
				for (int j = 0; j < Tm.length; j++) {
					
					if(!(Tm[i] == Tm[j])){
						
						Aux = Tm[j];
						
					}
			}
			
		}
			System.out.println("El Numero que no se repite es "	+ Aux);
	}
}