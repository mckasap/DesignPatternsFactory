package pizzaMania;

public class Driver {

	public static void main(String[] arg) {
		
		
		Store s= new TsPizzaStore();
		
		Pizza z=s.OrderPizza("Peynir");
		
		s.setFactory(new BafraPizzası());
		s.OrderPizza("Peynir");
	}
	
}
