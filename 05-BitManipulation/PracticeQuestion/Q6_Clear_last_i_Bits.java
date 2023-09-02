
class Clear_last_i_Bits {
  
 //my method
/*   public static void clearLastBits(int n,int i){
    for(int j=0;j<i;j++){
      int bitMask= ~(1<<j);
      n=n & bitMask;
    }
    System.out.println("After clear last bits, the new no is:"+n);
  }  */
 
  //mam method
  public static void clearLastBits(int n, int i){
    //int bitMask=-1<<i;    OR
    int bitMask= ~0 << i;
    n=n & bitMask;
    System.out.println(n);
  }
  
  public static void main(String[] args) {
    int n=10;
    int i=3;
    clearLastBits(n,i); 
  }
}
