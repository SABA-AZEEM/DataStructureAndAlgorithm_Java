//Check given array is sorted or not
class SortedArray {
  
  public static boolean checkArrayIsSorted(int arr[],int idx){
    if(idx==arr.length-1)
      return true;
    if(arr[idx]>arr[idx+1])
      return false;
    return checkArrayIsSorted(arr,idx+1);
  }
  
  public static void main(String[] args) {
    int arr[]={1,9,3,4,5};
    int idx=0;
    boolean check=checkArrayIsSorted(arr,idx);
    System.out.println(check?"Sorted":"Not Sorted");
  }
}
