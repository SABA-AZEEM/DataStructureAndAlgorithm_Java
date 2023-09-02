/*Given a 2*n size of board and size of tiles is 2*1, count the no of ways to tile
the given boeard using the 2*1 tiles.
(A tile can be place horizontally/vertically) */

class TilingProblem {
  
  public static int noOfWays(int n){
    if(n==0 || n==1)
      return 1;
    return noOfWays(n-1)+noOfWays(n-2);
  }
  
  public static void main(String[] args) {
    
    System.out.println("no of ways to tile the board: "+noOfWays(4));
    
  }
}
