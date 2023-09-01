//Find the transporse of matrix
import java.util.*;
class Q3_TransporseOfMatrix {
  
  public static void transporseOfMatrix(int arr[][]){
    int transpose[][]= new int[arr[0].length][arr.length];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        transpose[j][i]=arr[i][j];
      }
    }
    //call for print matrix
    printMatrix(transpose);
  }
  
  //method for print matrix
  public static void printMatrix(int arr[][]){
    System.out.println("Transpose of Matrix is:");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    
    int arr[][]=new int[2][3];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no in 2D Array");
    
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    } 
    transporseOfMatrix(arr);
    
  }
}
