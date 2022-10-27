package interfac;

public class Fish implements Prey,Predator{

	@Override
	public void hunt() {
		System.out.println("the hawk");
	}

	@Override
	public void flee() {
		System.out.println("the rabbit");
		
	}
	

}
