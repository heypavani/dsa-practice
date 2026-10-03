class Solution{
  public int findMaxConsecutiveOnes(int [] arr){
    int n=arr.length;
    int maxCount=0;

    for(int i=0;i<n;i++){

      // a consecutive ones range cannot start at 0
      if(arr[i]==0){
        continue;
      }
      int  currentLength=0;

      // Extend the range until first zero breaks the current streak

      for(int j=i;j<n;j++){
        if(arr[j]==0){
          break;
        }

        currentLength++;
        maxCount=Math.max(maxCount,currentLength);

      }
    }
    return maxCount;
  }

}
        

      
  
