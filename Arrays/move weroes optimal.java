class Solution{
  public void moveZeros(int [] arr){
    int zeroposition=0;
    int n=arr.length;

    for(int i=0;i<n;i++){
      if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[zeroposition];
        arr[zeroposition]=temp;

        zeroposition++;
      }
    }
  }
}
        

      
