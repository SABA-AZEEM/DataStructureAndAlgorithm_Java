import java.util.ArrayList;
import java.util.Scanner;
class _01_PrintReverse {
  public static void main(String[] args) {
    //create object in heap for taking input
    Scanner sc=new Scanner(System.in);
    //create Array list
    ArrayList<Integer> list=new ArrayList<>();
    //Add values in ArrayList
    for(int i=0;i<5;i++){
      System.out.println("Enter value at "+i+"-index:");
      int value=sc.nextInt();
      list.add(value);
    }
    //Print List values
    System.out.println("Our list before reverse is:"+list);
    //Reverse a list
    for(int i=list.size()-1;i>=0;i--){
      System.out.print(list.get(i)+" ");
    }
    
  }
}
