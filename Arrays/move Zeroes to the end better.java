class Solution{
  public void movezeroes(int[] arr){
    int n=arr.length;
    insertposition=0;

  for(int i=0;i<ni++){
    if(arr[i]!=0){
      arr[insertposition]=arr[i];
      insertposition++;
    }
    }

    while(insertposition<n){
     arr[ insertposition]=0;
      insertposition++;
    }
  }
}
