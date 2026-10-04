class  Solution{
  public void leftRotateArray(int [] arr){
     int n=arr.length;
    if(n<=1){
    return ;
    }
    int temp=new int[n];
    for (int i=1;i<n;i++){
      temp[i-1]=arr[i];
    }
    temp[n-1]=arr[0];

    for(int i=0;i<n;i++){
      arr[i]=temp[i];
    }
  }
}
      

      
      
      
    
  
