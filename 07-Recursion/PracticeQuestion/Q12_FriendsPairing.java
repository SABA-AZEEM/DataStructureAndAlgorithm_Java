
class FriendsPairing {
  
  public static int countTotalWays(int n){
    if(n==1 || n==2)
      return n;
    return countTotalWays(n-1)+(n-1)*countTotalWays(n-2);
  }
  
  public static void main(String[] args) {
    System.out.println("Total ways of pairing friends are: "+countTotalWays(4));
  }
}
