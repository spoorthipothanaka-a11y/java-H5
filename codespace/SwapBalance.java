import java.util.Scanner;
public class SwapBalance{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account1 balance: ");
		double balance1=sc.nextDouble();
		System.out.println("Enter Account2 balance: ");
		double balance2=sc.nextDouble();
		balance1=balance1+balance2;
		balance2=balance1-balance2;
		balance1=balance1-balance2;
		System.out.println("After swapping:");
		System.out.println("Account1 balance:"+balance1);
 		System.out.println("Account2 balance:"+balance2);
		sc.close();
	}
}