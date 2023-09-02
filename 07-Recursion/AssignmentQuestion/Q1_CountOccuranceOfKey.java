//Question1:For a given integer array of size N.You have to find all the occurrences(indices) 
//  of a given element(Key) and print them.Use a recursive function to solve this problem.
//  Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2,Sample Output: 1 5 7 8

class CountOccuranceOfKey {
  
  public static int countOccurance(int arr[],int key,int count,int idx){
    if(idx==arr.length)
      return count;
    if(key==arr[idx])
      count++;
   return countOccurance(arr,key,count,idx+1);
    
  }
  
  public static void main(String[] args) {
    int arr[]={1,2,3,4,2,5,2,6,2,7,2};
    int key=2;
    System.out.println("Occurance of "+key+" in array is:"+countOccurance(arr,key,0,0));
    
  }
}
