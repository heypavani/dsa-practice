class Solution{
  public void rotateArray(int[], int k){
    if(arr[i]<=1){
      return ;
    }
    int temp[]=new int[k];

    k=k%n;
    if(k%==0){
      return;
    }

    for(int i=0;i<k;i++){
      temp[i]=arr[i];// store the first k elements in temp
    }

    for (int i=k;i<n;i++){
      arr[i-k]=arr[i];
    }

    for(int i=0;i<k;i++){
      arr[n-k+i]=temp[i];
    }
  }
}

      

      
    

    
      
    
    
  
