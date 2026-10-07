class Solution{
  public int removeDulpicates(int arr[]){
    int n=arr.length;
    if(n<=1){
      return;
    }
    List<Integer> answer=new ArrayList<>(); //create  a list
    for(int i=0;i<n;i++){
    boolean alreadyPresent=false; craetae a variable
    
    for(int value: temp){ //create temp
      if(value==i){
        alreadypresent=true; // if any values is already presented in the temp then break from the loop
      break;
    }
    }

      if(!alreadypresent){ //if not presented in the temp then add to the temp
        temp.add(i);
      }

      for(int i=0;i<temp.size();i++){ arrange the elements which are unique nothing but which are stored in the temp
        
        arr[i]=temp.get(i);//size is up to temp
                                     //receiving all the stored elements in the temp to array
        
      }
      return temp.size(); // return the size of the array
    }
  }
}
