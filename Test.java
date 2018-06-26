package Mini_3;
import java.util.*;
import java.io.*;

public final class Test {

	private static String CITY = "HANOI";
	private static int ID_Next;
	private static int CustemerID_Next;
	private Car[] ListCar = new Car[100];
	private Driver[] ListDriver = new Driver[100];

	private Customer[] ListCustomer = new Customer[100];
	private void createCar()
	{
		for(int i=0 ; i < 50 ; i++)
		{
			ListCar[i] = new Car(i, "Honda", 4);
		}
		for(int i =50 ; i < 100; i++)
		{
			ListCar[i] = new Car(i, "Ford", 7);
		}
	}

	private void createDriver()
	{
		for(int i = 0 ; i < 50 ; i++)
		{
			ListDriver[i] = new Driver(i, "Jon.Snow"+ Integer.toString(i), "09665xxx", "Hanoi", 1);
		}
	}

	private void assignDriver()
	{
		for(int i = 0 ; i < 50 ; i++)
		{
			this.ListCar[i].changeDriver(this.ListDriver[i]);
		}
	}

	private  Booking newBooking(Customer Customer, String Pickup_location, String Pickup_drop)
	{
		for(int i = 0; i < 100 ; i++)
		{
			if(ListCar[i].getMake() == false )
			{
				Booking newBook = new Booking();
				newBook.addBooking(ID_Next, Customer, ListCar[i], this.CITY, Pickup_location, Pickup_drop);
				ListCar[i].getBooking(); 
				ID_Next ++;
				return newBook;
			}
		}
		Booking newBook = new Booking();
		newBook.changeType();
		return newBook;
	}
	
	
	private Customer newCustomer(String Name, String Mail, String Address)
	{
		if(this.CustemerID_Next > 0){
			for(int i = 0; i < this.CustemerID_Next ; i++)
			{
				if(ListCustomer[i].getMail() == Mail)
				{
					System.out.println("This email has already been used");
					return this.ListCustomer[i];
				}
				else
				{
					Customer tmp = new Customer(this.CustemerID_Next,Name, Mail, Address, 1);
					this.CustemerID_Next ++;
					ListCustomer[tmp.getId()] = tmp;
					return tmp;
				}
			}
		}
		else 
		{
			Customer tmp = new Customer(this.CustemerID_Next,Name, Mail, Address, 1);
			this.CustemerID_Next ++;
			ListCustomer[tmp.getId()] = tmp;
			return tmp;
		}
		return null;
		
		
	}
	
	

	public static void main(String[] args){
		Test T = new Test();
		T.createCar();
		T.createDriver();
		T.assignDriver();
		Customer Luc = null;
		Booking BK1 = new Booking();
		Customer Luc2 = null;
		Booking BK2 = new Booking();
		
		
		FileInputStream file = null;
		try {
			file = new FileInputStream("Input.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(file))) {
			Luc = T.newCustomer(br.readLine(), br.readLine(), br.readLine());
			BK1 = T.newBooking(Luc, br.readLine(), br.readLine());
			Luc2 = T.newCustomer(br.readLine(), br.readLine(), br.readLine());
			BK2 = T.newBooking(Luc, br.readLine(), br.readLine());
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BK1.showBooking();
		BK2.showBooking();
		//T.ListCustomer[0].showInfor();
	}
}
