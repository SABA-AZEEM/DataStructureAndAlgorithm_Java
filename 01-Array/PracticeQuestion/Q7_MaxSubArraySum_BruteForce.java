import java.util.*;
class Q7_MaxSubArraySum_BruteForce {
  public static int printMaxSubarrays(int arr[]){
    int sum=0;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        sum=0;
        for(int k=i;k<=j;k++){
          sum=sum+arr[k];
          
        }
       	if(max<sum){
          max=sum;
        }
      }
     
    }
    return max;
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
    
    int max=printMaxSubarrays(arr);
    System.out.println("Max of Subarrays, in array are: "+max);
    
  }
}
