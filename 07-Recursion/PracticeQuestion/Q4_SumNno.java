
class SumNno {
  
  public static int sum(int n){
    if(n==1)
      return n;
    return n+sum(n-1);
  }
  
  public static void main(String[] args) {
    int result=sum(4);
    System.out.println(result);
  }
}
