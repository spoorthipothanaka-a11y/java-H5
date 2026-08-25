class Student{
	private String name;
	private int marks;
	public String getname(){
	return name;
	}
	public int getmarks(){
	return marks;
	}
	public void setname(String name){
	this.name=name;
	}
	public void setmarks(int marks){
		if(marks>0 && marks<=100){
			this.marks=marks;
		}else{
			System.out.println("Invalid marks");
		}
	}
}
public class EncapsulationDemo{
	public static void main(String[] args){
	Student s1=new Student();
	s1.setname("Spoorthi");
	s1.setmarks(90);
	System.out.println("name:"+s1.getname());
	System.out.println("marks:"+s1.getmarks());
	}
}