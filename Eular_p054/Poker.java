import java.util.Scanner;
import java.io.*;

class Poker
{
	int winner =0;	

	public Poker(String[] s1,String[] s2)
	{
		int i,j;
		char[][] a = new char[5][2];
		char[][] b = new char[5][2];


		for(i=0;i<5;i++)
		{
			a[i]=s1[i].toCharArray();	
		}
		for(i=0;i<5;i++)
		{
			b[i]=s2[i].toCharArray();	
		}


		sort(a);
		sort(b);
		Findrank rankPlayer1 = new Findrank(a);
		Findrank rankPlayer2 = new Findrank(b);

		if(rankPlayer1.rank==rankPlayer2.rank)
		{
			winner = equalRank(a,b,rankPlayer1.rank);
		}
		else if(rankPlayer1.rank>rankPlayer2.rank)
			winner = 1;
		else winner =2;	
	}

/******************************************decide winner when both player has same rank**************************************************/
	public int equalRank(char a[][],char b[][],int rank)
	{	
		int i,j;
		if(rank==1)
		{
			i=4;
			while(a[i][0]==b[i][0]&&i>=0)
			{
				 i--;
			}
			if(a[i][0]>b[i][0]) return 1;
			else return 2;
		}
		else if(rank==2)
		{
			i=0;
			while(a[i][0]!=a[i+1][0])
			{
				i++;
			}
			j=0;
			while(b[j][0]!=b[j+1][0])
			{
				j++;
			}

			if(a[i][0]>b[j][0]) return 1;
			else if(a[i][0]<b[j][0]) return 2;
			else 
			{
				i=4;
				while(a[i][0]==b[i][0]&&i>=0)
				{ 
					i--;
				}
				if(a[i][0]>b[i][0]) return 1;
				else return 2;				
			}		
		}
		else return 1;
	}

/***********************************************Sort cards in asending order ***********************************************************/
	public void sort(char c[][]) 
	{
		int i,j;
		for(i=0;i<5;i++)
		{
			switch(c[i][0])
			{
				case '2': c[i][0]='a'; break;
				case '3': c[i][0]='b'; break;
				case '4': c[i][0]='c'; break;
				case '5': c[i][0]='d'; break;
				case '6': c[i][0]='e'; break;
				case '7': c[i][0]='f'; break;
				case '8': c[i][0]='g'; break;
				case '9': c[i][0]='h'; break;
				case 'T': c[i][0]='i'; break;
				case 'J': c[i][0]='j'; break;
				case 'Q': c[i][0]='k'; break;
				case 'K': c[i][0]='l'; break;
				case 'A': c[i][0]='m'; break;
			}
		}
		for(i=0;i<5;i++)
			for(j=0;j<4;j++)
			{
				if(c[j][0]>c[j+1][0])
				{
					char temp1= c[j][0];
					char temp2= c[j][1];
					c[j][0]=c[j+1][0];
					c[j][1]= c[j+1][1];
					c[j+1][0]= temp1;
					c[j+1][1]= temp2; 
				}
			}		

	}

/*********************No use. Only to check correct input*************************************************************************/

	public void print(String[] s1,String[] s2)
	{	
		int i;
		for(i=0;i<5;i++)
			System.out.print(s1[i]+" ");
		System.out.print("   ");for(i=0;i<5;i++)
			System.out.print(s2[i]+" ");System.out.println();
	}
}
