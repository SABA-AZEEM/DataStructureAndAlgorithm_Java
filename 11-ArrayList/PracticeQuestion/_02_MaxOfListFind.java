import java.util.ArrayList;
import java.util.Scanner;
class _02_MaxOfListFind {
  public static void main(String[] args) {
    //Create object in heap for taking input
    Scanner sc=new Scanner(System.in);
    //Create ArrayList object in heap
    ArrayList<Integer>list=new ArrayList<>();
    //Add value in ArrayList
    for(int i=0;i<5;i++){
      System.out.print("Enter value: ");
      int value=sc.nextInt();
      list.add(value);
    }
    //check for max value in list
    int max=Integer.MIN_VALUE;
      for(int i=0;i<list.size();i++){
        /*if(list.get(i)>max){
          max=list.get(i);
        }*/
        //OR
    	max=Math.max(max,list.get(i));
      }
    
    //Print maximum value in list
    System.out.println("Maximum value in list is:"+max);
    
  }
}
