//Convert uppercase characters to lowercase using bits.
class ConvertUppercaseToLower {
  public static void main(String[] args) {
    for(char i='A';i<='Z';i++){
      char smallLetter= (char) (i | ' ');
      System.out.println(smallLetter);
    }
   }
}
