import java.util.*;
class Q3_SearchForKeyInSortedMatrix {
  
  public static boolean searchForKeyInSortedMatrix(int arr[][],int key){
    for(int i=0,j=arr[i].length-1; i<arr.length; i++){
      if(key>=arr[i][0] && key<=arr[i][j]){
        int start=0;
        int end=arr[0].length-1,mid;
        while(start<=end){
          mid=(start+end)/2;
          if(key==arr[i][mid]){
            System.out.println("Key found at ("+i+","+mid+")");
            return true;
          }else if(key< arr[i][mid]){
            end= --mid;
          }else{
            start=++mid;
          }
        }
      }
    }
    
    return false;
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
    System.out.println("Enter Key that you want to find:");
    int key=sc.nextInt();
    boolean check=searchForKeyInSortedMatrix(arr,key);
    if (check == true) {
    	System.out.println("Successful!");
	} else {
    	System.out.println("Key not found");
	}

  }
}
