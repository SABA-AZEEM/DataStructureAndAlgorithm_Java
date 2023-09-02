
class PrintNto1 {
  
  static void printNno(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    System.out.println(n);
    printNno(n-1);
  }
  
  public static void main(String[] args) {
    printNno(10);
  }
}
