import java.util.*;
class Q1_DiagonalSum {
  
  public static void printDiagonalSum(int arr[][]){
    int primarySum=0;
    int sum=0;
    int secondarySum=0;
    for(int i=0,j=arr[0].length-1; i<arr.length; i++,j--){
      primarySum += arr[i][i];
      if(i!=j){
        secondarySum += arr[i][j];
      }
    }
    sum=primarySum+secondarySum;
    System.out.println("Sum of diagonals of matrix are:"+sum);
  }
  
  public static void main(String[] args) {
    
    int arr[][]=new int[4][4];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no in 2D Array");
    
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    } 
    printDiagonalSum(arr);
    
  }
}
