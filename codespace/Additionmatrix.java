import java.util.Scanner;
class Additionmatrix{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][]A=new int[r][c];
		int[][]B=new int[r][c];
		int[][]res=new int[r][c];
		System.out.println("Enter matrix A: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter matrix B: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				B[i][j]=sc.nextInt();
			}
		}
		System.out.println("performing addition: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				res[i][j]=A[i][j]+B[i][j];
			}
		}
		for(int[] val:res){
			for(int v:val){
				System.out.println(v+" ");
			}
		System.out.println();
		}
	}
}