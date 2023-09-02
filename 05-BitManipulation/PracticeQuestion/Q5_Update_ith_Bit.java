//update ith bit,when new bit is not given.
class Update_ith_Bit {
  
  public static void updateBit(int n, int i){
    int iBit=n>>i;
    iBit=iBit & 1;
    if(iBit==0){
      int bitMask=1<<i;
      n=n | bitMask;
    }else{
      int bitMask= ~(1<<i);
      n=n & bitMask;
    }
    System.out.println("After update the new no is:"+n);
  }
  
  public static void main(String[] args) { 
    int n=10;
    int i=1;
    updateBit(n,i);   
  }
}
