
public class Stock {
	public int num;
	public int qty;
	public String name; 
	
	Stock ()
	{
		this.num = 0;
		this.qty = 5;
		this.name = "Oracle";
	}
	
	public String print()
	{
		return name;
	}
	
	public int qty()
	{
		return qty;
	}
}
