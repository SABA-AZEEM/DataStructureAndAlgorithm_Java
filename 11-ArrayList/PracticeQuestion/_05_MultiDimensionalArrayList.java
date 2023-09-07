//[[1,2,3,4,5],[2,4,6,8,10],[3,6,9,12,15]];
import java.util.*;

class _05_MultiDimensionalArrayList {
  public static void main(String[] args) {
    //Create main list
    ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
    //Create sub lists
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    ArrayList<Integer> list3=new ArrayList<>();
    //Add values in sub array list
    for(int i=1;i<=5;i++){
      list1.add(i*1);
      list2.add(i*2);
      list3.add(i*3);
    }
    //Add list in main list
    mainList.add(list1);
    mainList.add(list2);
    mainList.add(list3);
    //Print main list
    System.out.println("Main list is: "+mainList);
    //Now access individual ArrayLists
    for(int i=0;i<mainList.size();i++){
      ArrayList<Integer> list=mainList.get(i);
      System.out.println("Sub ArrayList "+i+" is: ");
      for(int j=0;j<mainList.get(i).size();j++){
        System.out.print(list.get(j)+"  ");
      }
      System.out.println();
    }
    
  }
}
