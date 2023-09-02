
class EvenOrOdd {
  
  public static void checkNo(int n){
    int bitMask=1;
    if((n & bitMask) !=0){
      System.out.println("Given no is odd");
    }else{
      System.out.println("Given no is even");
    }
  }
  
  public static void main(String[] args) {
    int n=2;
    checkNo(n);
    
  }
}
