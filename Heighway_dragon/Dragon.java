class Dragon extends Most
{
	Most most ;
	long[][] a = new long[25][5];
	int i=0;

	void findCoordinate2PowerN()
	{	most = new Most();
		most.step(50);		
		//most.print();	
	}		


/*recursive fn to find out which of the coordinate of intermediate steps are required in order to calculate  coordinate required step */
	public void fooRecursion(long n)	
	{
		int r=0;
		long t=1L;
		long rem=0L;
		long rec=0L;

		while(n/t!=1)
		{
			t=2*t; 
			r++;
		}
		rem=n%t;
		rec=t-rem;	
		a[i][0]=n;
		a[i][1]=r;
			i++;
		if(rem>=1) fooRecursion(rec);
	}
/*calculate coordinate of all intermediate steps and store in a array. To calculate this method use 'Most' class file*/
	void findCoordinate()
	{	
		int k;
		i=i-1;
		int p= (int)a[i][1]; //System.out.println(p+" "+most.b[p-1][1]);
		a[i][2]=most.b[p][0];
		a[i][3]=most.b[p][1];
		for(k=i-1;k>=0;k--)
		{	
			int x2,y2;
			p= (int)a[k][1];
			x2= most.b[p][0];
			y2= most.b[p][1]; 
			a[k][2]=x2+y2-a[k+1][3];
			a[k][3]=y2+a[k+1][2]-x2;
		}	
	}


	void printCoordinate()
	{ 
		int j;
		//for(j=0;j<i;j++)
		System.out.println(a[0][0]+"= ("+a[0][2]+" "+a[0][3]+")");	
	}



	public static void main(String[] args)
	{
		long starttime = System.nanoTime();
		Dragon dragon=new Dragon();
		dragon.findCoordinate2PowerN();
		dragon.fooRecursion(1000000000000L);		//enter step to calculate coordinate of the step
		dragon.findCoordinate();
		dragon.printCoordinate();
		long endtime=System.nanoTime();
		System.out.println("Time:"+(endtime-starttime)+"ns");
		//System.out.println(temp.num);
	}
}
