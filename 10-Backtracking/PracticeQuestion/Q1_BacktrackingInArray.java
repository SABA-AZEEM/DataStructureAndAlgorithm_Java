//Given an array you should fill it with first 1 to ... values and then in backtracking store
//value-2, on each index. 
//As, arr=[] 5 length; then after recursion it become [1,2,3,4,5] and in backtracking process
// it become [-1,0,1,2,3];

class Q1_BacktrackingInArray {
  
  //function for backtracking
  public static void changeArray(int arr[],int idx,int value){
    //Base Case
    if(idx==arr.length){
      //check array before backtracking
      System.out.println("before backtracing and after recursion the array is:");
      print(arr);
      return;
    }
    //Recursion
    arr[idx]=value;
    changeArray(arr,idx+1,value+1);
    //Backtracking
    arr[idx]=arr[idx]-2;
  }
  
  //function for print array
  public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    
    int arr[]=new int[5];
    int startingIndex=0;
    int startingValue=1;
    changeArray(arr,startingIndex,startingValue);
    //check array after backtracking
    System.out.println("After backtracking the array is:");
    print(arr);
    
  }
}
