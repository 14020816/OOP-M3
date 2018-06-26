package Mini_3;

public class Booking {
	
	private int BookingID;
	private Customer Customer;
	private Car Car;
	private Driver Driver;
	private String Pickup_city;
	private String Pickup_location;
	private String Pickup_drop;
	private boolean WaitBooking = false; 
	
	public void addBooking(int Booking_ID, Customer Customer, Car Car, String Pickup_city, String Pickup_location, String Pickup_drop){
		this.BookingID = Booking_ID;
		this.Customer = Customer;
		this.Car = Car;
		this.Pickup_city = Pickup_city;
		this.Pickup_location = Pickup_location;
		this.Pickup_drop = Pickup_drop;
	}
	
	public void changeType()
	{
		WaitBooking = !WaitBooking;
	}
	public void showBooking()
	{
		if(this.Customer == null || this.Car == null)
		{
			System.out.println("Invalid Booking");
		}
		else{
			System.out.println("Booking Information ---------------------------------------");
			System.out.println("BookingID: " + this.BookingID);
			this.Customer.showInfor();
			this.Car.showInfor();
			System.out.println("City: "+ this.Pickup_city);
			System.out.println("Pickup location: "+ this.Pickup_location);
			System.out.println("Drop location: "+ this.Pickup_drop);
		}
	}
	

}
