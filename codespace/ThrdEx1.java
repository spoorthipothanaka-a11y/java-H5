import java.util.Scanner;
class factorial extends Thread{
	public void run(){
		int factorial=1,n=5;
		for(int i=1;i<=n;i++){
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}
}
class ThrdEx1{
	public static void main(String[] args){
		factorial t=new factorial();
		t.start();
	}
}