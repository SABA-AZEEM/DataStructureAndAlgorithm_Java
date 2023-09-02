//Question 2 :Swap two numbers without using any thirdvariable
class SwapNo {
  public static void main(String[] args) {
    int x=5;
    int y=3;
    x=x^y;
    y=x^y;
    x=x^y;
    System.err.println("x="+x+"and y="+y);
    
  }
}
