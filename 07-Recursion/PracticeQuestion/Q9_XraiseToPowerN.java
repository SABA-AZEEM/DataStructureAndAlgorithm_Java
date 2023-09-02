//print x^n
class XraiseToPowerN {
  
  //method-1 with O(n) time complexity
     /* public static int calculate(int x,int n){
        if(n==0)
          return 1;
        return x*calculate(x,n-1);
      }*/
  //method-2 with O(log n) time complexity
  	  /*public static int calculate(int x,int n){
      if(n==0)
        return 1;
      else if(n==1)
        return x;
      else
      	return x*x* calculate(x,n-2);
      }*/
  //method-3:Mam's code with O(log n) time complexity
      public static int calculate(int x,int n){
      if(n==0)
		return 1;
      int halfPower=calculate(x,n/2);
      int halfPowerSquare=halfPower*halfPower;
      if(n%2 != 0)
        halfPowerSquare=x*halfPowerSquare;
      return halfPowerSquare;
      }
  
  
  public static void main(String[] args) {
    
    int x=2;
    int n=3;
    int result=calculate(x,n);
    System.out.println(x+" ^ "+n+" = "+result);
    
  }
}
