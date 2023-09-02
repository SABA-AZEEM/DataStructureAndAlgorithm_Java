//Question 3 :Add 1 to an integer using Bit Manipulation
//.(Hint: try using Bitwise NOT Operator)
class Add {
  public static void main(String[] args) {
    int no=7;
    int add= -(~no);
    System.out.println("After this bit manipulation operation, 1 is added in "+no+"and the ans is:"+add);
    
  }
}
