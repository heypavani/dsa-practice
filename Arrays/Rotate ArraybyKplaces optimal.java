class Solution{
  int void leftRotate(int [] arr,int k){

  int n=arr.length;

  if(int i<=n){
    return;
  }

  k=((k%n)+n)%n;

  if(k==0)
    return;

  reverse (arr,0,k-1);
    reverse(arr,k,n-1);
    reverse (arr,0,n-1);

  }

  public void reverse(int[] arr,int start,int end){
    while(start<end){
      int[temp]=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
  }
    }
    
      
    
    
