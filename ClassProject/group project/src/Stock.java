
public class Stock
{

	//instance vars
	private String name = null;
	private int count = 0;
	private double price = 0.0;
	private String unitOfMeasure = null;
	private String manufacturer = null;
	private String location = null;
	private int ID = 0;
	
	/* ----------------------------------------
	 * Constructor
	 * ----------------------------------------
	 */
	
	public Stock(String name, int count, double price, String unitOfMeasure, 
				 String manufacturer, String location, int ID)
	{
		this.name = name;
		this.count = count;
		this.price = price;
		this.unitOfMeasure = unitOfMeasure;
		this.manufacturer = manufacturer;
		this.location = location;
		this.ID = ID;
	}
	
	
	/* ----------------------------------------
	 * Setters
	 * ----------------------------------------
	 */
	
	//name
	public void setName(String name)
	{
		this.name = name;
	}
	
	//count
	public void setCountint (int count)
	{
		this.count = count;
	}
	
	//price
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	//unit of measure
	public void setUnitOfMeasure(String unit)
	{
		this.unitOfMeasure = unit;
	}
	
	//manufacturer
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
	//location
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	//ID
	public void setID(int id)
	{
		this.ID = id;
	}
	
	/* ----------------------------------------
	 * Getters
	 * ----------------------------------------
	 */
	
	//name
	public String getName()
	{
		return name;
	}
	
	//count
	public int getCount()
	{
		return count;
	}
	
	//price
	public double getPrice()
	{
		return price;
	}
	
	//unit of measure
	public String getUnitOfMeasure()
	{
		return unitOfMeasure;
	}
	
	//manufacturer
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	//location
	public String getLocaton()
	{
		return location;
	}
	
	//ID
	public int getID()
	{
		return ID;
	}
	
	//displays formated Stock information for readability
	public String toString()
	{
		return name+" | Count : "+count+" | price : $"+price+" | "+unitOfMeasure+" | " +manufacturer+" | "+location+ " | ID: "+ID;
		
	}
	
	
	
	
	
}
