class Solution{
  public int secondLargest(int [] arr){
    int n=arr.length;

  //if numbers are less than 2 then it will return -1

  if(n<2)
    return -1;

  int largest=arr[0];
    int  secondLargest=0;
    int current=0;
    boolean hasSecond=fasle;
    
for(int i=0;i<n;i++){
//initialize the current elements to current 
    int current=arr[i];
  if(current>  largest){
    secondLargest=largest;
    largest=current;
    hasSecond=true;
  }
    else if(current < laregst){
      
 if(!hasSecond|| secondLargst>largest){

   secondLargest=current;
   hasSecond=true;
 }
    }
}
    if(!hasSecond){
      return -1;
    }
    return secondLargest;
  }
}
   
   
    
  
    
    
    
    
    
