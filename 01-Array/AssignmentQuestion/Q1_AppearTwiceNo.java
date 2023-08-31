//Question 1:Given an integer array nums, return true if anyvalue appears at least twice in 
//the array, and return false if every element is distinct
import java.util.*;
class Q1_AppearTwiceNo {
  
  public static boolean appearTwiceNo(int arr[]){
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          return true;
        }
      }
    }
    return false;
  }
  
  public static void main(String[] args) {
    
    int arr[]=new int[5];
    //input object
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      System.out.println("Enter no-"+(i+1)+" in array:");
      arr[i]=sc.nextInt();
    }
    //call function
    System.out.println(appearTwiceNo(arr));

  }
}
