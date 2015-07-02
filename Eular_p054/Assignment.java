import java.util.Scanner;
import java.io.*;
class Assignment{

	public static void main(String[] args)  throws IOException
	{	
		int k=0;
		Scanner s = new Scanner(new File("p054_poker.txt"));
		//Poker p = new Poker
		while(s.hasNext())
		{
			int i;
			String[] s1= new String[5];
			String[] s2= new String[5];
			for(i=0;i<5;i++)
				s1[i]=s.next(); 
			for(i=0;i<5;i++)
				s2[i]=s.next();
			Poker p = new Poker(s1,s2);
			if(p.winner==1) k++;
		}
		System.out.println(k);
	}
}
