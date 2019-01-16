package Automobile.TwoWheeleer;
import Automobile.*;
public class Hero extends Vehicle  {

	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		
		return "Hero Xblade";
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return "WBchasis256474";
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		
		return "hero owner";
	}
	
	public int speed() 
	{
		return 100;
		                             //– Returns the current speed of the vehicle.
	}
	public void radio() 
	{
		 System.out.println("Radio working");                      //– provides facility to control the radio device 
	}

}
