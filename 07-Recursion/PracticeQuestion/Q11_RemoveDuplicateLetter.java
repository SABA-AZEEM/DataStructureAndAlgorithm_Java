// appnacollege  ==>  apnacolege
class RemoveDuplicateLetter {
  
  public static void removeDuplicateLetter(String str,int idx,StringBuilder newStr){
    //base Case
    if(idx==str.length()-1){
      System.out.println(newStr.append(str.charAt(idx)));
      return;
    }
    //recursive call
    if(str.charAt(idx)==str.charAt(idx+1)){
      removeDuplicateLetter(str,idx+1,newStr);
    }else{
      removeDuplicateLetter(str,idx+1,newStr.append(str.charAt(idx)));
    }
    
  }
  
  public static void main(String[] args) {
    String str="appnacollege";
   // String str="sabaa";
    int idx=0;
    StringBuilder newStr=new StringBuilder("");
 	removeDuplicateLetter(str,idx,newStr);
    
  }
}
