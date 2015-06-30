import java.util.Scanner;
import java.text.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.io.IOException;
import java.util.Arrays;
import java.io.*;
class Xor{
	public static void main(String args[]) throws IOException
	{
		int i,count,growth;
		Scanner s = new Scanner(new File("p059_cipher.txt")).useDelimiter("\\s*,\\s*");
		int a[] = new int[100];
		count=0;
		growth=1;
		while(s.hasNextInt()) // store integer in array 
		{
			if(a.length==count)
			{
				a=Arrays.copyOf(a, a.length+growth);
			}
			a[count++]=s.nextInt();	

		}
		s.close(); 
		System.out.println(count--);
		int[][] result= new int [100][1200];
		int temp,j,k,r,flag=0;
		temp=0;
		for(i=97;i<123;i++)//decode genuine msg by all possible keys
		{
			for(j=97;j<123;j++)
			{
				for(k=97;k<123;k++)
				{

					flag=1;int t;

					for(r=0;r<count&&flag==1;r++)
					{
						if(r%3==0)
						{
							t=result[temp][r]= a[r]^i;t=result[temp][r];

							if(!( (t>31&&t<35)||(t>38&&t<42)||t==44||t==46||(t>47&&t<60)||(t>64&&t<91)||(t>96&&t<123))) //conditions
								flag=-1;
						}
						if(r%3==1)
						{
							result[temp][r]=a[r]^j;t=result[temp][r];
							if(!( (t>31&&t<35)||(t>38&&t<42)||t==44||t==46||(t>47&&t<60)||(t>64&&t<91)||(t>96&&t<123))) //conditions
								flag=-2;
						}
						if(r%3==2)
						{
							result[temp][r]=a[r]^k;t=result[temp][r];
							if(!( (t>31&&t<35)||(t>38&&t<42)||t==44||t==46||(t>47&&t<60)||(t>64&&t<91)||(t>96&&t<123))) //conditions
								flag=-3;
						}
					} 
					if(flag==1) temp++;
					else if(flag==-2||flag==-1) break;

				}
				if(flag==-1) 
					break;
			}
		} //System.out.println(temp);
		for(i=0;i<1;i++)//print genuine msg
		{
			for(j=0;j<count;j++)
			{
				System.out.print((char)result[i][j]);
			}System.out.println("");
		}

	}
}

