package Mini_3;

public class Driver {
	private int ID;
	private String Name;
	private String Phone;
	private String Address;
	private int Rate;
	
	public Driver(int ID, String Name, String Phone, String Address, int Rate)
	{
		this.ID = ID;
		this.Name = Name;
		this.Phone = Phone;
		this.Address = Address;
		this.Rate = Rate;
	}
	
	public void showInfor()
	{
		System.out.println("Driver infotmation:");
		System.out.println("ID: " + this.ID);
		System.out.println("Name: " + this.Name);
		System.out.println("Phone: " + this.Phone);
		System.out.println("Address: " + this.Address);
		System.out.println("Rate: " + this.Rate);
	}
	
}
