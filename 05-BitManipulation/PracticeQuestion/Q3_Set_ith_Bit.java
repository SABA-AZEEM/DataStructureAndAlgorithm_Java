
class Set_ith_Bit {
  
  public static void setBit(int n,int i){
    int bitMask=1<<i;
    n=n | bitMask;
    System.out.println("The new no is:"+n);
  }
  
  public static void main(String[] args) {
    int n=10;
    int i=2;
    setBit(n,i); 
  }
}
