import java.util.*;
class Q8_MaxSubArraySum_PrefixSum {
  
  public static int printMaxSubarrays(int arr[]){
    int sum=0;
    int max=Integer.MIN_VALUE;
    int newArr[]=new int[arr.length];
    //Assign 0th index first
    newArr[0]=arr[0];
    
    //Create Prefix array
    for(int i=1;i<newArr.length;i++){
      newArr[i]=newArr[i-1]+arr[i];
    }
    
    //Find max of subarray
    for(int i=0;i<arr.length;i++){
      sum=0;
      for(int j=i;j<arr.length;j++){
        //sum of the subarray
        if(i==0){
          sum=newArr[j];
        }else{
          sum=newArr[j]-newArr[i-1];
        }
        //max sum of subarray
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
