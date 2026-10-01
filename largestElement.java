class Solution{
  public int largestElement(int[] nums){

    //initially we consider first element as  max element
    int maxElement=arr[0];
int n=nums.length;
    fot(int i=0;i<n;i++){

      //compare every element with the largest found so far
      if(nums[i]>maxElement){
        maxElement=nums[i];
      }
    }
    return maxElement;
  }
}
      
        
