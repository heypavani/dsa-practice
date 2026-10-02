class Solution{
  public int secondLargest(int[] nums){
    int n=nums.length;

  if(n<2){
    return -1;
  }
    int largest=nums[0];

  for(int i=0;i<n;i++){
    if(nums[i]> largest){
      largest=nums[i];
    }
  }
    int secondlargest=0;
    boolean hasSecond=false;

 // only values smaller than largest can be valid for second largest

  for(int i=0;i<n;i++){
    if(nums<largest){

    //keep the greatest valid value
    //found below the maximum

    if(!hasSecond || num> secondlargest){
      secondlargest=num;
      hasSecond=true;

    }
    }
  }
    if(!hasSecond){
      return -1;
    }
    return secondlargest;
  }
}
      
