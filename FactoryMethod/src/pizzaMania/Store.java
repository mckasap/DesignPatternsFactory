package pizzaMania;

public abstract class Store {
	SimplePizzaFactory spf;
	public Store(SimplePizzaFactory f) {
		spf=f;
	}
	
	public void setFactory(SimplePizzaFactory sp) {
		
		spf=sp;
	}
	
	public Pizza OrderPizza(String type) {
		
		Pizza z=spf.createPizza(type);
		z.bake();
		z.cut();
		z.box();
		return z;
	}
}
