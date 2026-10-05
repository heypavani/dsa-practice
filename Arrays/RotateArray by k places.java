class Solution{
  public int rotateArraybyKplace(int [] arr){
     int n=arr.length;

  if(n<=1){
    return;
  }
  int k=k%n; // number of rotations required  
    //if k=2; 2%5=2;

    for(int rotation=0;rotation <k; rotation++){

      int first=arr[0];// store thefirst elememnt

      for(int i=1;i<n;i++){

        arr[i-1]=arr[i];
      }

      arr[n-1]=first;
    }
  }
}

      
      
    
  
