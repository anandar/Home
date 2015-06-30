class Assignment{

public static void main(String args[])
		{
	ZDigit zd1=new ZDigit('A');  
	ZDigit zd2=new ZDigit('0');  

	ZNumber zn1 = new ZNumber('A','B','C','D','E'); //could be any no. of character or any length ofstring
	ZNumber zn2 = new ZNumber("CDEF");
	ZNumber zn3 = new ZNumber("EFGHI");

	ZDigit[] z1=zn1.getDigits();
	ZDigit[] z2=zn2.getDigits();
	ZDigit[] z3=zn3.getDigits();

	System.out.println(zn1+" "+zn1.toDecimal());
	System.out.println(zn2+" "+zn2.toDecimal());
	System.out.println(zn3+" "+zn3.toDecimal());

	System.out.println(z1[0].ch+" "+z1[1].ch);
	System.out.println(z2[0].ch+" "+z2[1].ch);
	System.out.println(z3[0].ch+" "+z3[1].ch);
	
	}
}
