package Mini_3;

public class Customer {
	private int ID;
	private String Name;
	private String Mail;
	private String Address;
	private int Rate;
	
	public Customer(int ID, String Name, String Mail, String Address, int Rate)
	{
		this.ID = ID;
		this.Name = Name;
		this.Mail = Mail;
		this.Address = Address;
		this.Rate = Rate;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getMail()
	{
		return this.Name;
	}

	public int getId()
	{
		return this.ID;
	}
	
	public void showInfor()
	{
		System.out.println("Customer ID: " + this.ID);
		System.out.println("Customer Information: ");
		System.out.println("Name: " + this.Name);
		System.out.println("Mail: " + this.Mail);
		System.out.println("Address: " + this.Address);
		System.out.println("Rate: " + Rate);
	}
	

}
