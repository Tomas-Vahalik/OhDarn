import java.util.*;

public class Cetnost
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int pozice = 0;

		Cislo [] cisla = new Cislo [500];
		
		while(in.hasNextInt())
		{
			int a = in.nextInt();
			boolean znam = false;

			if(pozice == 0)
			{
				cisla [0] = new Cislo(a, 1);
				pozice ++;
			}
			else
			{
				for(int x = 0; x< pozice; x++)
				{	
					

					if( cisla [x].znam(a) )
					{
						cisla [x].pridej();
						znam = true;
					}
					if (znam)
						break;
					
				}
				if(!znam)
				{
					cisla [pozice] = new Cislo(a, 1);
					pozice ++;
				}
			}
			
						
		} 
		
		for(int y = 0; y < pozice; y++)
		{
			System.out.println("Cislo " + cisla[y].VratCislo() + " se objevuje " + cisla[y].VratPocet() + " krat");
		}
	
	}

}
