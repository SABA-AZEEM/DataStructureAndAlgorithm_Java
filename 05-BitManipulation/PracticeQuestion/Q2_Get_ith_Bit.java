
class Get_ith_Bit {
  
  public static void printBit(int n,int i){
    n=n>>i;
    n=n & 1;
    
    System.out.println("ith bit is:"+n);
  }
  
  public static void main(String[] args) {
    int n=10;
    int i=0;
    printBit(n,i);
    
  }
}
