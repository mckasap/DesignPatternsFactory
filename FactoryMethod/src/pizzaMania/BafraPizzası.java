package pizzaMania;

public class BafraPizzası extends SimplePizzaFactory{

	@Override
	public Pizza createPizza(String Type) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Pizza z;
				 if(Type.equals("Peynir"))
					 z=  new BUpeyniriPizza();
				 else
					 z=  new BUpeyniriPizza();
				 
				return z;
	}

}
