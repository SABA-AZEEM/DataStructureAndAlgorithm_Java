import java.util.*;
class Q1_StringCompression {
  
  public static String stringCompression(String str){
    StringBuilder newStr=new StringBuilder("");
    for(int i=0;i<str.length();i++){
      Integer count=1;
      while(i+1<str.length() && str.charAt(i+1)==str.charAt(i)){
        count++;
        i++;
      }
      newStr.append(str.charAt(i));
      if(count>1){
        newStr.append(count.toString());
      }
    }
    return newStr.toString();
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String:");
    String str=sc.nextLine();
    //call function
    String newStr=stringCompression(str);
    System.out.println("Compressed String is: "+newStr);
  }
}
