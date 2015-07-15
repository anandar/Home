class rentalService 
{
	Building[] b;
	int noOfBuilding;

	rentalService(Building[] b,int noOfBuilding)
	{ 
		this.b=b;
		this.noOfBuilding=noOfBuilding;
	}


	public void RentAFloor(String building ,int reqArea,String tenantName)
	{
		for(int i=0;i<noOfBuilding;i++)
		{	
			if((b[i].buildingName).equals(building))
			{
				b[i].allotFloor(tenantName,reqArea);
				break;
			}	
		}
	}
	
	public void vacateAFloor(String building,String tenantName, int floor)
	{
		for(int i=0;i<noOfBuilding;i++)
		{	
			if((b[i].buildingName).equals(building))
			{
				b[i].deallocateFloor(floor);
				break;
			}	
		}
	}
	
	public void listOccupancy()
	{
		for(int i=0;i<noOfBuilding;i++)
			for(int j=0;j<b[i].noOfFloor;j++)
			{
				if(b[i].floorStatus[j]==0)
				{
					System.out.println(b[i].buildingName+" "+ j+"th floor by "+ b[i].tenantName[j]);
				}
			}
	}
	

}
