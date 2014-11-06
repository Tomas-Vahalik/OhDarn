import java.util.*;
public class Scitani {
	public static void main(String [] args){
		int priklady = 0;
		int pokusy = 0;
		Scanner in = new Scanner(System.in);
		while(priklady < 5){
			Random cislo = new Random();
			int a = cislo.nextInt(10);
			int b = cislo.nextInt(10);
			System.out.printf("Kolik je %d + %d ? ",a,b);
			
			int vysledek = a + b;
			if(in.hasNextInt()){
					int odpoved = in.nextInt();
					System.out.printf("%d", odpoved);
					if(odpoved == vysledek){
						priklady++;
						System.out.println();
					}
					else{
							System.out.println("Toto neni spravne");
						
					}
					pokusy++;
			}
			else{
				
				System.out.printf("Zatim jste spocital %d prikladu ", priklady);
				break;
			}
		}
		System.out.printf("Na %d prikladu jste potrebovali %d pokusu", priklady, pokusy);
	}
}
