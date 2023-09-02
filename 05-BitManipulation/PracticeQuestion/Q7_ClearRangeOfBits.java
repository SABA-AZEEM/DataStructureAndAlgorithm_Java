
class ClearRangeOfBits {
  
  public static void clearRangeOfBits(int n,int i, int j){
    //mam;s method
/*  int bitMask=-1<<j+1;
    int temp=(1<<i)-1;
    bitMask=bitMask | temp;
    n=n & bitMask;
    System.out.println(n);
*/
    //my method
    int a= (~0) <<j+1;
    int b= (1<<i)-1;
    int bitMask= a|b;
    n=n & bitMask;
    System.out.println(n);
  }
  
  public static void main(String[] args) {
    int n=10;
    int i=0;
    int j=2;
    clearRangeOfBits(n,i,j);   
  }
}
