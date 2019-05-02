package Foundation;

public class Address {
	
	String AddressLine;
	String City;
	String State;
	String Zip;
	
	public Address(String Add,String  Ct,String  St,String  Z)
	{
		this.AddressLine = Add;
		this.City = Ct;
		this.State = St;
		this.Zip = Z;
	}
	
	public String getAddress()
	{
		return AddressLine+", "+City+", "+State+", "+Zip+"\n";
	}
	
}
