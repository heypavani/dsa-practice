class solution{
  public int removeDuplicates(int [] arr){

    int n=arr.length;
    
  if(n<=0){
    return;
  }
 List<Integer> temp=new ArrayList<>(); // create a list with name temp
  temp.add(arr[0]); // add the 1st element to the temp

  for(int i=1;i<n;i++){
    if(arr[i]!=arr[i-1]){ //if second element not equals to the firts element then add that element to the temp
      temp.add(arr[i]);
    }
  }

  for(int i=0;i<temp.size();i++){ //travere through the temp 
    arr[i]=temp.get(i);  // shift the elements of temp to original array
  }
    return tempsize(); // return the temp size
  }
}
}
