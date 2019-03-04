package pizzaMania;

public class TrabzonPizzası extends SimplePizzaFactory{

	@Override
	public Pizza createPizza(String Type) {
		// TODO Auto-generated method stub
		Pizza z;
		 if(Type.equals("Peynir"))
			 z=  new TUpeynirliPizza();
		 else
			 z=  new TUpeynirliPizza();
		 
		return z;
	}

}
