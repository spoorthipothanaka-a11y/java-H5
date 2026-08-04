abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	void eat(){
		System.out.println(name+ " is eating");
	}
	abstract void MakeSound();
}
class Dog extends Animal{
	Dog (String name){
		super(name);
	}
	void eat(){
		System.out.println(name+ " is eating");
	}
	void MakeSound(){
		System.out.println("Bow Bow....");
	}
}
class Abs{
	public static void main(String args[]){
		Dog obj=new Dog("Charlie ");
		obj.eat();
		obj.MakeSound();
	}
}