//Question1:Count how many times lowercase vowels occurred in a String entered by the user.

import java.util.*;

class Q1_CountLowerCaseVowels {
  
  public static void countVowels(String str){
    int count=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
        count++;
      }
    }
    System.out.println("Number of vowels are:"+count);
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String:");
    String str=sc.nextLine();
    countVowels(str);
  }
}
