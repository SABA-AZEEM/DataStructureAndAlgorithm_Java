
class FibbonacciSeries {
  
  public static int printNthFibbonacciNo(int n){
    if(n==1 || n==0)
      return n;
    return printNthFibbonacciNo(n-1)+printNthFibbonacciNo(n-2);
  }
  
  public static void main(String[] args) {
    int nthNO=6;
    int result=printNthFibbonacciNo(nthNO);
    System.out.println(nthNO+"th fibbonaci no is:"+result);
    
  }
}
