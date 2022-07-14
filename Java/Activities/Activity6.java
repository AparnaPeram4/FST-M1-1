package activities;

public class Activity6 {

	public static void main(String[] args) throws InterruptedException
	{
		// Plane with max of 100 Passengers 
		Plane plane = new Plane (100);
		//Add passengers to the plane
		plane.onboard("Kris");
		plane.onboard("John");
		plane.onboard("Peter");
		//Plane takes off
		System.out.println("Plane takes Off at :"+plane.takeOff());
		//List of People onboard 
		System.out.println("People on plane :"+plane.getPassengers());
		Thread.sleep(5000);//Flying
		//Plan is landed 
		plane.land();
		//Plan landing time 
		System.out.println("Plane landed at:"+plane.getLastTimeLanded());
		System.out.println("People on the plane after landing:"+plane.getPassengers());

	}

}