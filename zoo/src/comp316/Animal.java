package comp316;

public abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void say() {
		System.out.println("I am animal!");
	}
}
