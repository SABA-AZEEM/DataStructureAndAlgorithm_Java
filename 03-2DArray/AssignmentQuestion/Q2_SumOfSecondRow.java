//print the sum of second row.
import java.util.*;
class Q2_SumOfSecondRow {
  
  public static void sumOfSecondRow(int arr[][]){
    int sum=0;
    for(int i=0;i<arr[0].length;i++){
      sum += arr[1][i];
    }
    System.out.println("Sum of second row is:"+sum);
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
    sumOfSecondRow(arr);
    
  }
}
