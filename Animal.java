

public class Animal{

	String name;
	int legs;

	public Animal(String name, int legs){
		this.name = name;
		this.legs = legs;
	}
	public String toString(){
		return this.name+this.legs;
	}
	public int getLegs(){
		return this.legs;
	}
}
