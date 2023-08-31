//Question 5:Given an integer array nums, return all the triplets
//[nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, 
//and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Example:-
//			Input:nums = [-1, 0,  1, 2, -1, -4]
//			Output:   [ [-1, -1, 2] , [-1, 0, 1] ]
class Q5_TripletSum {
  
  //find triplets method
  public static void findTriplets(int arr[]){
    
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        for(int k=j+1;k<arr.length;k++){
          
          if((i!=j && i!=k && j!=k) && (arr[i]+arr[j]+arr[k]==0)){
            System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]"); 
          }
          
        }
      }
    }
    
  }
  
  //main method
  public static void main(String[] args) {
    int arr[]={-1,0,1,2,-1,-4};
    findTriplets(arr);
    
  }
}
