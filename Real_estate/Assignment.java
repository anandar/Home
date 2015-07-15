class Assignment 
{
	
	public static void main(String[] args)
	{
		int noOfBuilding=2;
		Building[] b= new Building[noOfBuilding];
		b[0] = new Building("Kavuri Ridge",5,15000);
		b[1] = new Building("Pankaj Villa",6,10000);
		System.out.println(b[0].buildingName+""+b[1].areaOfFloors);
		
		rentalService r = new rentalService(b,noOfBuilding);
		r.RentAFloor("Kavuri Ridge",11000,"Ananda");  
		r.RentAFloor("Kavuri Ridge",11000,"Ananda");
		r.vacateAFloor("Kavuri Ridge","Ananda",0);
		r.RentAFloor("Kavuri Ridge",11000,"Anandaram");
		r.RentAFloor("Pankaj Villa",21000,"Ananda");
		r.listOccupancy();
	}
}
