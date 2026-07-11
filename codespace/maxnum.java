class maxnum {
  public static void main(String args[]){
  int[] myArray={49,56,122,36,225,89,69};
  int max=myArray[0];
  for(int i=0;i<myArray.length;i++){
     if(myArray[i]>max){
       max=myArray[i];
     }
   }
  }
}