class Solution{
public int findMaxConsecutiveOnes(int[] nums){
  int currentLength=0;
int maxCount=0;

for(int i=0;i<n;i++){
if(arr[i]==1){
currentLength++;
maxCount=Math.max(maxCount,currentLength);
}
  else{
    currentCount=0;
  }
}
  return maxCount;
}
}

//TIME COMPLEXITY=O(1);


