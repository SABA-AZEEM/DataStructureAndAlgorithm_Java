
class SortingAlgorithms {
  
  //Bubble Sort
  public static void bubbleSort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    //call method for print
    printSort(arr);
  }
  
  
  //Selection Sort
  public static void selectionSort(int arr[]){
    int swap=0;
    for(int i=0;i<arr.length-1;i++){
      int minPos=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[minPos]>arr[j]){
          minPos=j;
          swap++;
        }
      }
      //swap
      if(swap>0){
        int temp=arr[minPos];
      	arr[minPos]=arr[i];
      	arr[i]=temp;
      }
    }
    //call print method
    printSort(arr);
  }
  
  
  //Insertion Sort
  public static void insertionSort(int arr[]){
    for(int i=1;i<arr.length;i++){
      int temp=arr[i];
      for(int j=i-1;j>=0;j--){
        if(temp<arr[j]){
          arr[j+1]=arr[j];
          arr[j]=temp;
        }
        
      }
    }
    //call print method
    printSort(arr);
  }
  
  
  //Counting Sort
  public static void countingSort(int arr[]){
    int count[]=new int[arr.length];
    //add frequency of no is counting array
    for(int i=0;i<arr.length;i++){
      int k=0;
      for(int j=0;j<arr.length;j++){
        if(i==arr[j]){
          k++;
        }
      }
      count[i]=k;
    }
    //now sort original array according to the frequency of numbers in count array
    int k=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<count[i];j++){
        arr[k]=i;
        k++;
      }
    }
    //call print method
    printSort(arr);
  }
  
  //method for print sorting array
  public static void printSort(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  
  //Main method
  public static void main(String[] args) {
    int arr[]={3,6,2,1,8,7,4,5,3,1};
    System.out.println("Bubble Sort is:-");
    	bubbleSort(arr);
    
    int arr1[]={3,6,2,1,8,7,4,5,3,1};
    System.out.println("Selection Sort is:-");
    	selectionSort(arr1);
    
    int arr2[]={3,6,2,1,8,7,4,5,3,1};
    System.out.println("Insertion Sort is:-");
    	insertionSort(arr2);
    
    int arr3[]={3,6,2,1,8,7,4,5,3,1};
    System.out.println("Counting Sort is:-");
    	countingSort(arr3);
    
  }
}
