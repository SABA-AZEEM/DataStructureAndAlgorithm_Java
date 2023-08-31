import java.util.*;
class Q5_PairsInArray {
  public static void pairsOfArray(int num[]){
    int count=0;
    for(int i=0;i<num.length;i++){
      for(int j=i+1;j<num.length;j++){
        System.out.print("("+num[i]+","+num[j]+")");
        count++;
      }
      System.out.println();
    }
    System.out.println("The total no of pairs are:"+count);
  }
  public static void main(String[] args) {
    int num[]=new int[5];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<num.length;i++){
      System.out.println("Enter no-"+(i+1)+" in Array:");
      num[i]=sc.nextInt();
    }
    pairsOfArray(num);
  }
}
