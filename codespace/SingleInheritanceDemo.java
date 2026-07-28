
class A{
	int i,j;
	void showij(){
		System.out.println("i= "+i);
		System.out.println("j= "+j);
	}	
}
class B extends A{
	int k;
	void showk(){
		System.out.println("k= "+k);
	}
	void sum(){
		int res=i+j+k;
		System.out.println("sum= "+res);
	}
}
class SingleInheritanceDemo{
	public static void main(String args[]){
		B obj=new B();
		obj.i=10;
		obj.j=30;
		obj.k=45;
		obj.showij();
                obj.showk();
		obj.sum();
		
	}
}