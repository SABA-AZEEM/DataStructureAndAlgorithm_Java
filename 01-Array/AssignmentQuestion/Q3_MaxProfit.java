//Question 3:You  are  given  an  array prices where prices[i] is  the  price  of  a 
//given  stock  on  the ith day.Return the maximum profit
//you can achieve from this transaction. If you cannot achieve any profit, return 0.

class Q3_MaxProfit {
  
  //method to find max profit
  
  public static int maxProfit(int arr[]){
    int buyPrice=Integer.MAX_VALUE;
    int profit;
    int maxProfit=0;
    for(int i=0;i<arr.length;i++){
      if(buyPrice<arr[i]){
        profit=arr[i]-buyPrice;
        maxProfit=Math.max(profit,maxProfit);
      }else{
        buyPrice=arr[i];
      }
    }
    return maxProfit;
  }
  
  //main method
  
  public static void main(String[] args) {
    int arr[]={7,1,5,3,6,4};
    System.out.println("Max Profit is:"+ maxProfit(arr));
  }
}
