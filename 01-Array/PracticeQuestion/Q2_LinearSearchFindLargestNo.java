class Q2_LinearSearchFindLargestNo{
  public static int largestNo(int arr[]){
    int no=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      if(no<arr[i]){
        no=arr[i];
      }
    }
    return no;
  }
  public static void main(String[]args){
    int numbers[]={4,23,65,12,100,34,78};
    int largestNo=largestNo(numbers);
    System.out.println("Largest No is:"+largestNo);
  }
}