class myfact implements Runnable{
	public void run(){
		int n=4,fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
class ThrdEx4{
	public static void main(String args[]){
		myfact obj=new myfact();
		Thread t=new Thread(obj);
		t.start();
	}
}