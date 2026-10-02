class Solution{
pulic int secondLargest (int[] nums){
int n=nums.length;

//at least two values are needed for return the second largest

if(n<2){
return -1;
}
int[] sortedNums=nums.clone();
Arrays.sort(sortedNums);

int largest=sortedNums[n-1];

  //starts from the end of the array 
  //n-1 is the first largest
  for(int i=n-2;i>=0;i--){
    if(sortedNums[index]<largest){
      return sortedNums[index];
    }
  }
  return -1;
}
}
    


