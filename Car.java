package Mini_3;

public class Car {
	private int RegistrationNO;
	private boolean Make;
	private String Model;
	private int Occupancy;
	private Driver Driver;
	
	public Car(int RegistrationNO, String Model, int Occupancy)
	{
		this.RegistrationNO = RegistrationNO;
		this.Make = false;
		this.Model = Model;
		this.Occupancy = Occupancy;
	}
	public void changeDriver(Driver Driver)
	{
		this.Driver = Driver;
	}
	
	public boolean getMake()
	{
		return Make;
	}
	public void getBooking()
	{
		Make = true;
	}
	public void showInfor()
	{
		System.out.println("Car information: ");
		System.out.println("RegistrationNO: " + this.RegistrationNO);
		System.out.println("Model: " + this.Model);
		System.out.println("Occupancy: " + this.Occupancy);
		if(this.Driver != null)
		{
			this.Driver.showInfor();
		}
	}

}
