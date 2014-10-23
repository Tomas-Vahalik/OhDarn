public class Cislo
{
	private int cislo = 0;
	private int pocet = 0;
	
	public Cislo(int c, int p)
	{
		cislo = c;
		pocet = p;
	}
	
	public boolean znam(int a)
	{
		if (a == cislo)
		{
			return true;
		}
		else
			return false;
	}
	public void pridej()
	{
		pocet++;	
	}
	
	public int VratCislo()
	{
		return(cislo);		
	}
	public int VratPocet()
	{
		return(pocet); 
	}
}
