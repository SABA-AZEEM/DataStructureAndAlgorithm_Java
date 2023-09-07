//given two index and a list, task is to swap the given index values.
import java.util.ArrayList;
import java.util.Scanner;

class _03_SwapTwoNumbers {
  
  public static void swap(ArrayList<Integer>list,int idx1,int idx2){
    int temp=list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);
  }
  
  public static void main(String[] args) {
    //create ArrayList object in heap
    ArrayList<Integer> list= new ArrayList<>();
    //create scanner object in heap
    Scanner sc=new Scanner(System.in);
    //Add element in array list
    for(int i=0;i<5;i++){
      System.out.println("Enter value: ");
      int value=sc.nextInt();
      list.add(value);
    }
    //Enter index of swap element
    System.out.println("Enter first index:");
    int idx1=sc.nextInt();
    System.out.println("Enter second index:");
    int idx2=sc.nextInt();
    //Before swap list is:
    System.out.println("Before swap list is:"+list);
    //swap function call
    swap(list,idx1,idx2);
    //After swap list is:
    System.out.println("Before swap list is:"+list);
  }
}
