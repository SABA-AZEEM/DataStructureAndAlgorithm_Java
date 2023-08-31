//Question 4:Given n non-negative integers representing an elevation map
//where the width of each bar is 1, compute how much water it can trap after raining.

class Q4_TotalTrapWater {
  
  //Method for find total trapped water
  public static int trapWater(int arr[],int width){
    int left_max[]=new int[arr.length];
    int right_max[]=new int[arr.length];
    int waterLevel=0;
    int trappedWater,totalTrapWater=0;
    //create array for find left max pillar
    for(int i=0;i<arr.length;i++){
      if(i==0){
        left_max[i]=arr[i];
      }else{
        left_max[i]=Math.max(arr[i],left_max[i-1]);
      }
    }
    //create array for find right max pillar
    for(int i=arr.length-1;i>=0;i--){
      if(i==arr.length-1){
        right_max[i]=arr[i];
      }else{
        right_max[i]=Math.max(arr[i],right_max[i+1]);
      }
    }
    //now find total trapped water
    for(int i=0;i<arr.length;i++){
      //min pillar from left and right max
      waterLevel=Math.min(left_max[i],right_max[i]);
      trappedWater=(waterLevel-arr[i])*1;
      totalTrapWater=totalTrapWater+trappedWater;
    }
    return totalTrapWater;
  }
  
  //main method
  public static void main(String[] args) {
    int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
    int width=1;
    System.out.println("Total Trapped Water is:"+trapWater(arr,width));
    
  }
}
