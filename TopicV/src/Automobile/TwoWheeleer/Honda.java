package Automobile.TwoWheeleer;
import Automobile.*;
public class Honda extends Vehicle  {
	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		
		return "Honda Hornet";
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return "WBchasis655424";
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		
		return "Honda owner";
	}
	
	public int speed()   
	{
		 return 90;    //– Returns the current speed of the vehicle.
	}
	
	public int cdplayer() 
	{
			return 92;				//– provides facility to control the cd player device 
	}
	

}
