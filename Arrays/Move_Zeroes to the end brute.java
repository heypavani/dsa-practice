class Solution{
  public void movezeroes(int[] arr){
    list<Integer> temp =new ArrayList<>();
    int n=arr.length;

    for(int i=0;i<n;i++){
      if(i !=0){
        temp.add(i);
      }

      while(temp.size()<n){
        temp.add(0);
      }

      for(int i=0;i<n;i++){
        arr[i]=temp.get(i);
      }
    }
  }

      

  
