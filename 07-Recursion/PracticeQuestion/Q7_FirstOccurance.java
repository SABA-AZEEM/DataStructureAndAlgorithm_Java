//Find first occurance of an element
class FirstOccurance {
  
  public static int checkOccurance(int arr[],int idx,int key){
    if(idx==arr.length)
      return -1;
    if(arr[idx]==key)
      return idx;
    return checkOccurance(arr,idx+1,key);
  }
  
  public static void main(String[] args) {
    
    int arr[]={1,2,3,4,5,1,2,3,4,5};
    int idx=0;
    int key=13;
    int result=checkOccurance(arr,idx,key);
    if(result==-1){
      System.out.println("Element not exist");
    }else{
      System.out.println("First occurance of an element is at index:"+result);
    }
    
  }
}
