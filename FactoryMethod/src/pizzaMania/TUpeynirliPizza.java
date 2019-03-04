package pizzaMania;

public class TUpeynirliPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Trabzon usulü pizza hazırlanır");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Trabzon usulü pizza fırınlanır");
	
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Trabzon usulü pizza kesilir");

	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Trabzon usulü pizza paketlenir");

	}

}
