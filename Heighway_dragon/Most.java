/*1. this class file calculate coordinate of step Pow(2,N) where N is any natural number which will help to reduce time complexity of the program 
2. used a mathamatical algo. to find Pow(2,N) coordinate which can be find by analyzing the problem.
3. use rotation property of a complex vector to derive formula for coordiante Pow(2,N)*/
class Most	
{
	int x; int y;
	int[][] b= new int [51][2];
	int power;
	Most()
	{
		x=0;
		y=1;
		power=0;
		b[power][0]=x;
		b[power][1]=y;
	}
	void findCoordinateByRotation()
	{
		int tempx=x; int tempy=y;
		x= tempx+tempy;		//found using complex algebra
		y=tempy-tempx;		//found using complex algebra
		power++;
		b[power][0]=x;		//store in array
		b[power][1]=y;
		//System.out.println("power= "+power+" ( "+x+" ,"+y);
	}
	void step(int n)
	{
		int i;
		for(i=0;i<n;i++)
		findCoordinateByRotation();
	}
	void print()
	{
		for(int i=0;i<50;i++)
		System.out.println(b[i][0]+" "+b[i][1]);
	}
 /* public static void main(String[] args)
	{
	Most most = new Most();
	most.step(50);
	most.print();
	}*/
	
}
