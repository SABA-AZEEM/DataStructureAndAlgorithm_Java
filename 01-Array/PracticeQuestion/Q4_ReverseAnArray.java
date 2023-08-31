import java.util.Arrays;
class Q4_ReverseAnArray {
  public static int[] reverseArray(int arr[]){
    int start=0;
    int end=arr.length-1;
    int temp=0;
    while(start<end){
      temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--;
    }
    
    return arr;
  }
  
  public static void main(String[] args) {
    int arr[]={2,4,6,8,10,12};
    int newArr[]=reverseArray(arr);
    System.out.println("Reverse Array is: "+ Arrays.toString(newArr));
    
  }
}
