
class FastExponent {
  
  public static int fastExpo(int no, int expo){
    int ans=1;
    while(expo>0){
      if((expo & 1)!=0){
        ans *=no;
      }
      no *= no;
      expo=expo>>1;
    }
    return ans;
  }
  
  public static void main(String[] args) {
    int no=3;
    int expo=5;
    int ans=fastExpo(no,expo);
    System.err.println(no+" ^ "+expo+" = "+ans);
  }
}
