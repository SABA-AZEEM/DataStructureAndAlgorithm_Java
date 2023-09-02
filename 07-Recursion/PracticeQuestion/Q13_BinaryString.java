//print all binary string of length 'n',without consecutive 1.
class BinaryString {
  
  public static void binaryStrings(int n,int lastPlace,String str){
    if(n==0){
      System.out.println(str);
      return;
    }
    binaryStrings(n-1,0,str+"0");
    if(lastPlace==0)
      binaryStrings(n-1,1,str+"1");
  }
  
  public static void main(String[] args) {
    int n=2;
    String str="";
    int lastPlace=0;
    binaryStrings(n,lastPlace,str);
    System.out.println("Binary strings without consecutive 1 of length "+n+" are:");
    
  }
}
