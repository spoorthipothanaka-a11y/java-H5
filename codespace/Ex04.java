class Student{
	final String rollno;
	int marks;
	Student(String rollno,int marks){
		this.rollno=rollno;
		this.marks=marks;
	}
	 final String grading(){
		if(marks>=90) return "0";
		else if(marks>=80)return"A+";
		else if(marks>=70)return"A";
		else if(marks>=60)return"B+";
		else if(marks>=50)return"B";
		else if(marks>=40)return"C";
		else return "F";
	}
	void show(){
		System.out.println("rollno: "+rollno);
		System.out.println("marks: "+marks);
		System.out.println("grade: "+grading());
	}
}
class Ex04{
	public static void main(String args[]){
		Student s1=new Student("h5",85);
		s1.show();
	}
}