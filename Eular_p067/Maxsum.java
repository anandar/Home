import java.util.Scanner;
import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.io.IOException;
class Maxsum{
	public static void main(String[] args) throws IOException
	{
		Scanner s = new Scanner(new File("p067_triangle.txt"));
		int i,j;
		int[][] a = new int[100][];
		/*********************************************************************************/
		for(i=0;i<100;i++)
		{ 
			a[i]= new int[i+1];
		}

		for(i=0;i<100;i++)
		{
			for(j=0;j<=i;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		/*********************************array printing*******************************************/
		/*	for(i=0;i<100;i++)
			{
			for(j=0;j<=i;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println("");
			} */
		/*********************************************************************************************/
		for(i=98;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{ 
				int sum1,sum2;
				sum1=a[i][j]+a[i+1][j];
				sum2=a[i][j]+a[i+1][j+1];
				if(sum1>sum2)
					a[i][j]=sum1;
				else a[i][j]=sum2;
			}
		}
	System.out.println(a[0][0]);


	}
}
