import java.util.*;
class _04_SortingAnArrayList {
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
    //Before sort Array list is
    System.out.println("Before Sort Array list is:"+list);
    //Sort an ArrayList in ascending order
    Collections.sort(list);
    //After sortin ascending order Array list is:
    System.out.println("After sort an ArrayList in Ascending order is:"+list);
    //Sort an ArrayList in descending order
    Collections.sort(list,Collections.reverseOrder());
    //After sortin descending order Array list is:
    System.out.println("After sort ArrayList in Descending order is:"+list);
    
  }
}
