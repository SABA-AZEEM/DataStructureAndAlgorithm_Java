//Question 2 :You are given a number (eg -  2019), convert it into a String of
//english like “two zero one nine”.  Use a recursive function to solve this problem.
//NOTE-The digits of the number will only be in the range 0-9 and the last digit of 
//a number can’t be 0.

class IntegerToString {
  
  public static void intToString(int no){
    if(no==0)
      return;
    int remainder=no%10;
    no=no/10;
    intToString(no);
    String[] noMapping={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    String character=noMapping[remainder];
    System.out.print(character+" ");
  }
  
  public static void main(String[] args) {
    int no=2019;
    System.out.println("No.s in string form are:");
    intToString(no);
  }
}
