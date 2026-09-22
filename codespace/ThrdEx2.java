class students extends Thread{
	private String name;
	public students(String name){
		this.name=name;
	}
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(name+"writing page"+i);
		}
		System.out.println(name+"complete writing");
	}
}
class ThrdEx2{
	public static void main(String args[]){
		students t1=new students("t1");
		t1.start();
		students t2=new students("t2");
		t2.start();
	}
}