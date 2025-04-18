public class Main
{
	public static void main(String[] args) {
	   // Offering offering = new Coffee();
	    Offering offering = new Tea();
	   // Offering offering = new Gin();
	   // Offering offering = new Roohavza();
	    
	    offering = new Rum(offering);
	    offering = new Rum(offering);
	    
		System.out.println(offering.getName() + " " + offering.getPrice());
	}
}