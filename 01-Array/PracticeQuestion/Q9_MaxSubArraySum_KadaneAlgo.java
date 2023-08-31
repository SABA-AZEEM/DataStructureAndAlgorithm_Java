import java.util.*;
class Q9_MaxSubArraySum_KadaneAlgo {
  
  public static int printMaxSubarrays(int arr[]){
    int sum=0;
    int special=Integer.MIN_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
      
      if(sum<0){
        if(sum>special){
          special=sum;
        }
        sum=0;
      }
      //check max no
      if(max<sum){
        max=sum;
      }
    }
    System.out.println("If all of array no.s are -ve,then max sum of subarray is:"+ special+"otherwise sum is given below");
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
