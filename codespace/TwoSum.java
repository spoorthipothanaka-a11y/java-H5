import java.util.Scanner;
class Solution{
public int[] twosum(int[] nums,int target){
int[]arr=new int[2];
for(int i=0;i<nums.length;i++)
for(int j=i+1;j<nums.length;j++){
if(nums[i]+nums[j]==target){
arr[0]=i;
arr[1]=j;
break;
}
}
return arr;
}
}
class TwoSum{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter size of array: ");
int n = sc.nextInt();
int[] nums = new int[n];
System.out.println("Enter array elements:");
for (int i = 0; i < n; i++) {
nums[i] = sc.nextInt();
}
System.out.print("Enter target: ");
int target = sc.nextInt();
Solution obj = new Solution();
int[] result = obj.twosum(nums, target);
System.out.println("Indices are: " + result[0] + " " + result[1]);
sc.close();
}
}