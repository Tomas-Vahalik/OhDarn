import java.util.*;

public class otoceni
{
	public static void main(String args[]) 
	{
		PoleIntu pole = new PoleIntu();
		Scanner in = new java.util.Scanner(System.in);
 
		while (in.hasNextInt())
		{
			int a = in.nextInt();
			pole.pridej(a);
		}
 
		for (int i = pole.delka() - 1; i >= 0; i--)
		{
			System.out.printf(" %d", pole.prvek(i));
		}
 
	System.out.println();
	}
}
