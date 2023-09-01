import java.util.*;
class Q2_SpiralMatrix {
  
  public static void printSpiralMatrix(int arr[][]){
    int startRow=0;
    int endRow=arr.length-1;
    int startCol=0;
    int endCol=arr[0].length-1;
    while(startRow<=endRow && startCol<=endCol){
      //Top
      for(int i=startCol;i<=endCol;i++){
        System.out.print(arr[startRow][i]+" ");
      }
      
      //Right
      for(int i=startRow+1;i<=endRow;i++){
        System.out.print(arr[i][endCol]+" ");
      }
      //Bottom
      for(int i=endCol-1;i>=startCol;i--){
        //Special Case
        if(startRow==endRow){
          break;
        }
        System.out.print(arr[endRow][i]+" ");
      }
      //left
      for(int i=endRow-1;i>=startRow+1;i--){
        //Special Case
        if(startCol==endCol){
          break;
        }
        System.out.print(arr[i][startCol]+" ");
      }
      //Increment and Decrement
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
  }
  
  public static void main(String[] args) {
    
    int arr[][]=new int[3][4];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no in 2D Array");
    
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[0].length;j++){
        arr[i][j]=sc.nextInt();
      }
    } 
    printSpiralMatrix(arr);
  
  }
  
}
