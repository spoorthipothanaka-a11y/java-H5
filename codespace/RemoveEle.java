import java.util.Arrays;
class solution{
public int removeElement(int[]nums,int val){
int k=0;
for(int i=0;i<nums.length;i++){
if(nums[i]!=val){
nums[k]=nums[i];
k++;
}
}
return k;
}
}
class RemoveEle{
public static void main(String args[]){
int[] nums={10,30,40,20,10,50,10};
int val=10;
solution ob=new solution();
int k=ob.removeElement(nums,val);
System.out.println(k);
System.out.println(Arrays.toString(nums));
}
}