import java.io.BufferedReader;
import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
public class ZNumber
{
	char[] a;
	String str;
	int i;//sum=0;
	ZDigit [] zdigit;

	ZNumber(char... a)
	{
		this.a=new char[a.length];
		zdigit = new ZDigit[a.length];
		for (i=0;i<a.length;i++)
		{ 	zdigit[i]=new ZDigit(a[i]);
			this.a[i]=a[i];
		}
		str = new String(a);
	}

	ZNumber(String str) 	
	{
		char[] a= str.toCharArray();
		int len= a.length;
		zdigit = new ZDigit[len];
		for(i=0;i<len;i++)
		{
			zdigit[i]=new ZDigit (a[i]);
		}
		this.str=str; 
	}

	public int toDecimal()
	{	
		char[] array= str.toCharArray();
		int len= array.length;
		int j=0;
		int sum=0;
		int i;
		for(i=len-1;i>=0;i--)
		{
			int temp= (array[j++]-'A');
			sum = sum + (int)Math.pow(26 ,i)* (temp+1);
		}
		return sum;	
	}

	public ZDigit[] getDigits()
	{ 
		return zdigit;
	}	

	public String toString()	
	{
		return str;	
	}

	/**********************************************************************************************/	

	/*public static void main(String args[])
	  {

	  ZNumber zn1 = new ZNumber('A','B','C','a');
	  ZNumber zn2 = new ZNumber("ABCDE");
	  ZNumber zn3 = new ZNumber("ABCDEF");
	  ZDigit[] z=zn1.getDigits();
	  System.out.println(z[3].ch);
	  System.out.println(zn1);
	  System.out.println(zn3);
	  }*/
}
