import java.util.*;
public class PoleIntu
{
	private ArrayList<Integer> cisla = new ArrayList<Integer>(); 
	
	public PoleIntu()
	{

	}

	public void pridej(int a)
	{
		cisla.add(a);
		
	}
	
	public int delka()
	{
		return cisla.size();
	}
	public int prvek(int i)
	{
		return cisla.get(i);
	}

}
