
class NoPowerOf2 {
  
  public static void powerOfTwo(int n){
    if((n & 1)==0){
      System.out.println("yes, "+n+" is power of 2");
    }else{
      System.out.println("no, "+n+" is not power of 2");
    }
  }
  
  public static void main(String[] args) {
    int n=7;
    powerOfTwo(n);
    
  }
}
