
class QuickSort {
  
  public static void quickSort(int arr[],int si,int ei){
    if(si>=ei){
      return;
    }
    int pivot=ei;
    int i=si-1;
    int j=si;
    while(j<pivot){
      if(arr[j]<arr[pivot]){
        i++;
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
      j++;
    }
    
    i++;
	int temp=arr[i];
	arr[i]=arr[pivot];
	arr[pivot]=temp;
  	
    quickSort(arr,0,i-1);
    quickSort(arr,i+1,ei);
  }
  
  public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+", ");
    }
    System.out.println();
  }
  
  public static void main(String[] args) {
    int arr[]={6,3,9,8,2,5};
    System.out.println("Befor Sorting arrays is:");
    print(arr);
    quickSort(arr,0,arr.length-1);
    System.out.println("After Sorting arrays is:");
    print(arr);
    
  }
}
