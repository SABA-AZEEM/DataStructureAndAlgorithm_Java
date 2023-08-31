//Prerequisites:array should be sorted
     
   

class Q3_BinarySearch {
  public static int binarySearch(int arr[],int key){
    int start=0;
    int end=arr.length-1;
    int mid;
    while(start<=end){
      mid=(start+end)/2;
      if(arr[mid]==key){
        return mid;
      }else if(key<arr[mid]){
        end=mid-1;
      }else{
        start=mid+1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    
    int arr[]={2,4,6,8,10,12,14};
    int index=binarySearch(arr,2);
    if(index==-1){
      System.out.println("Key doesn't exist in this array.");
    }else{
      System.out.println("Key exist at index:"+index);
    }
  }
}
