import java.util.*;
class Q10_TrappingRainWater {
    //calculate total trapped water
    public static void trappingRainWater(int arr[],int width){
        
        int leftMax[]=new int[arr.length];
        int rightMax[]=new int[arr.length];
        int waterLevel=0;
        int trappedWater=0;
        int totalTrappedWater=0;
        //Calculate left max for each bar
        for(int i=0;i<arr.length;i++){
            if(i==0){
                leftMax[i]=arr[i];
            }else{
                leftMax[i]=Math.max(arr[i],leftMax[i-1]);
            }
        }
        //Calculate right max for each bar
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                rightMax[i]=arr[i];
            }else{
                rightMax[i]=Math.max(arr[i],rightMax[i+1]);
            }
        }
        //loop for calculate total trapped water
        for(int i=0;i<arr.length;i++){
            waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater=(waterLevel-arr[i])*width;
            totalTrappedWater=totalTrappedWater+trappedWater;
        }
        //print total trapped water
        System.out.println("Total  Trapped Water is:"+totalTrappedWater);
        
    }
    //main Method
    public static void main(String[] args) {
        int arr[]=new int[7];
        int width=0;
        //Take input in array
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Length of the no-"+(i+1)+" bar:");
            arr[i]=sc.nextInt();
        }
        //Take input for width
        System.out.print("Enter Width of the bar:");
        width=sc.nextInt();
        //call the function
        trappingRainWater(arr,width);
    }
}