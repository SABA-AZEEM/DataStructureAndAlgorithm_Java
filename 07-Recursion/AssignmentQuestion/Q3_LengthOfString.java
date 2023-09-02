//Question 3 :Write a program to findLength of a String using Recursion.
class LengthOfString {
  
  public static int lengthFind(String str){
    if(str.length()==0)
      return 0;
    return lengthFind(str.substring(1))+1;
  }
  
  public static void main(String[] args) {
    String str="Saba";
    System.out.println("Length of a string is: "+lengthFind(str));
    
  }
}
