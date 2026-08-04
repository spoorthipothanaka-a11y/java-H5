class A{
	int i=20;
	A(){}
	A(int i){
	  this.i=i;
	System.out.println("parent class i= "+i);
	}
}
class B extends A{
	int i=40;
	B(int i){
		super(i);
		System.out.println("child class i= "+this.i);
		System.out.println("child class i= "+super.i);
	}
}
class ConstructorEx2{
	public static void main(String args[]){
		B obj=new B(60);
	}
}