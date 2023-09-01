//print the no of 'n' in 2d array.
import java.util.*;
class Q1_NoOfN {
  
  public static void printNoOfKey(int arr[][],int key){
    int count=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        if(arr[i][j]==key){
          count++;
        }
      }
    }
    System.out.println("No of "+key+"s in given 2D array are:"+count);
  }
  
  public static void main(String[] args) {
    
    int arr[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no in 2D Array");
    
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    } 
    System.out.println("Enter Key that you want to search:");
    int key=sc.nextInt();
    printNoOfKey(arr,key);
    
  }
}
