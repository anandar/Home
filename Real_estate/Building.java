class Building
{
	String buildingName;
	int noOfFloor;
	int[] floorStatus;
	String[] tenantName;//= new String[noOfFloor];
	int areaOfFloors;
	int vacantFloors;
	

	Building(String buildingName,int noOfFloor,int areaOfFloors)
	{
		this.buildingName = buildingName;
		this.noOfFloor = noOfFloor;
		this.areaOfFloors = areaOfFloors;

		tenantName= new String[noOfFloor];
		floorStatus= new int[noOfFloor];
		for(int i=0;i<noOfFloor;i++)
		{
			floorStatus[i]=1;	//1 means available;
		}
		vacantFloors=noOfFloor;
	}
	
	
	void allotFloor(String name,int reqArea)
	{
		int availableArea = vacantFloors*areaOfFloors;
		if(reqArea>availableArea)
		{
			System.out.println("No floor available! Inconvenience caused is deeply regretted");
		}
		else
		{	int i=0;
			while(reqArea>0)
			{
				if(floorStatus[i]==1)
				{
					floorStatus[i]=0;
					tenantName[i]=name;
					vacantFloors--;
					reqArea=reqArea-areaOfFloors;
					System.out.println(name+" "+(i)+" "+ buildingName);	
				}
				i++;
			}	
		}
	}
	
	void deallocateFloor(int floorNo)
	{
		floorStatus[floorNo]=1; System.out.println("vacated floor No. "+floorNo+" from "+buildingName);
		vacantFloors++;
		tenantName[floorNo]=null;	
	}	














}
