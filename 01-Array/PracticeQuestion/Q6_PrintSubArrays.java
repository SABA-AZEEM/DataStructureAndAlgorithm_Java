import java.util.*;
class Q6_PrintSubArrays {
  public static void printSubarrays(int arr[]){
   
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        for(int k=i;k<=j;k++){
          if((k==i && j==i) || k==j){
            System.out.print(arr[k]);
          }else{
            System.out.print(arr[k]+",");
          }
          
        }
        System.out.print("   ");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    //create new array
    int arr[]=new int[5];
    //Take input in array
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
       System.out.println("Enter "+(i+1)+" No. in Array:");
       arr[i]=sc.nextInt();
    }
   	//call the functionn
    System.out.println("Subarrays in array are:-");
    printSubarrays(arr);
    
  }
}
