
class CountSetBits {
  
  public static void countSetBits(int n){
    int count=0;
    while(n>0){
      if((n&1) != 0){
        count++;
      }
      n=n>>1;
    }
    System.out.println("No of set bits in n is:"+count);
  }
  
  public static void main(String[] args) {
    int n=10;
    countSetBits(n);
  }
}
