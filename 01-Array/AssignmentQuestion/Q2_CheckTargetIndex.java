//Question 2:There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index
//k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],
//...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed). 
//For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot
//index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and
//an integer target, returnthe index oftarget if it is in nums,
//or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.
import java.util.*;
class Q2_CheckTargetIndex {
  
  //function call from main function
  
  public static int checkTargetIndex(int arr[],int target){
    
    //min will have index of minimum element of arr[]
    	int min=minSearch(arr);
    //find target in sorted left
    	if(arr[min]<=target && target<=arr[arr.length-1]){
          return search(arr,min,arr.length-1,target);
        }
    //find target in sorted right
    	else{
          return search(arr,0,min,target);
        }
    
  }
  
  //function to find min no
  
  public static int minSearch(int [] nums){
    int left=0;
    int right=nums.length-1;
    while(left<right){
      int mid=(left+right)/2;
      if(mid>0 && nums[mid-1]>nums[mid]){
        return mid;
      }else if(nums[left]<=nums[mid] && nums[mid]>nums[right]){
        left=mid+1;
      }else{
        right=mid-1;
      }
    }
    return left;
  }
  
  //Binary search to find target in left to right boundary
  
  public static int search(int []nums,int left,int right,int target){
    while(left<=right){
      int mid=(left+right)/2;
      if(nums[mid]==target){
        return mid;
      }else if(nums[mid]>target){
        right=mid-1;
      }else{
        left=mid+1;
      }
    }
    return -1;
  }
  
  //main function
  
  public static void main(String[] args) {
    
   	int arr[]=new int[7];
    int target=0;
    //input object
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
      System.out.println("Enter no-"+(i+1)+" in array:");
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter Taget:");
    target=sc.nextInt();
    //call function
    System.out.println("Index NO of target is:"+checkTargetIndex(arr,target));

    
  }
}
