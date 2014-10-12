import java.util.*;

public class statistika
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

		ArrayList<Double> Cisla = new ArrayList<Double>();

		double Max = 0;
		double Min = 0;
		double Prumer = 0;
		double Suma = 0;

		boolean zadano = false;

		while(in.hasNextDouble())
		{
			double a = in.nextDouble();

			if(Cisla.size()==0)
			{
				Max = a;
				Min = a;
				zadano = true;
			}
			else
			{
				if(a > Max)
					Max = a;
				if(a < Min)
					Min = a;	
			}
			Suma += a;

			Cisla.add(a);
			
		}
		
		if(Cisla.size()!=0)
		{	
			Prumer = Suma / Cisla.size();

			double SumaOdchylek = 0;

			for(int i = 0; i<Cisla.size(); i++)
			{
				double d = Cisla.get(i);
				SumaOdchylek += Math.pow( (d - Prumer),2);
								
			}
			
			double Rozptyl = ( (1/(double)Cisla.size() ))*SumaOdchylek;
			

			double SmerodatnaOdchylka = Math.sqrt(Rozptyl);
						
			System.out.println("Maximum : " + Max + "\nMimimum : " + Min + "\nPrumer : " + Prumer +  "\nSmerodatna odchylka : " + SmerodatnaOdchylka);
		}
		else
			System.out.println("Nic nebylo zadano");
	}

}
