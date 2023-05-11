package inheritance;

public class SmartWatch extends Watch{

	String colour = "Silver";
	int price = 2500;
	
	public void displaySmartWatch()
	{
		System.out.println("===============================");
		System.out.println("Model : " + " SmartWatch");
		System.out.println("Colour : " + colour);
		System.out.println("Price : " + price);
	}

}
