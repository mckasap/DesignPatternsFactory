package pizzaMania;

public class BUpeyniriPizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Bafra usulü hazırlanıyor");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Bafra usulü fırınla");
			
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Bafra usulü kes");
			
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Bafra usulü paketle");
			
	}

}
