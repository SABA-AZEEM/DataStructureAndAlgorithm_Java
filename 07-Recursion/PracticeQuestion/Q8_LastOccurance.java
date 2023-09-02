
class LastOccurance {
  public static int checkOccurance(int arr[],int idx,int key){
    if(idx<0)
      return -1;
    if(arr[idx]==key)
      return idx;
    return checkOccurance(arr,idx-1,key);
  }
  
  public static void main(String[] args) {
    
    int arr[]={1,2,3,4,5,1,2,3,4,5};
    int idx=arr.length-1;
    int key=-3;
    int result=checkOccurance(arr,idx,key);
   if(result==-1){
      System.out.println("Element not exist");
    }else{
      System.out.println("Last occurance of an element is at index:"+result);
    }
    
  }
}
