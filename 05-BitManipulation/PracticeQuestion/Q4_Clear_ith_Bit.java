
class Clear_ith_Bit {
  
  public static void clearBit(int n,int i){
    int bitMask=~(1<<i);
    n=n & bitMask;
    System.out.println("After clear "+i+"th bith, the new no is:"+n);
  }
  
  public static void main(String[] args) {   
    int n=10;
    int i=1;
    clearBit(n,i);    
  }
}
