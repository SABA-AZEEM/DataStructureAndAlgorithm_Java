import java.util.*;
class Q2_AnogramsStrings {
  
  public static boolean checkAnogramStrings(String str1,String str2){
    if(str1.length()==str2.length()){
      for(int i=0;i<str1.length();i++){
        boolean check=false;
        for(int j=0;j<str2.length();j++){
          if(str1.charAt(i)== str2.charAt(j)){
            check=true;
          }
        }
        if(check !=true){
          return false;
        }
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String one:");
    String str1=sc.nextLine();
    System.out.println("Enter String two:");
    String str2=sc.nextLine();
    //method call
    boolean check=checkAnogramStrings(str1,str2);
    if(check==true){
      System.out.println("Both strings are Anograms.");
    }else{
       System.out.println("Both strings are not Anograms.");
    }
  }
}
