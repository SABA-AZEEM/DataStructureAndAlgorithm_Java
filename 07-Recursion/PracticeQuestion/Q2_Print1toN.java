
class Print1toN {
  static void printNno(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    printNno(n-1);
    System.out.println(n);
  }
  
  public static void main(String[] args) {
    printNno(10);
  }
}
