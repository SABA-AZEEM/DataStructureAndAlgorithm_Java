public class Q1_LinearSearch{
  public static int linearSearch(int numbers[],int key){
    for(int i=0;i<numbers.length;i++){
      if(numbers[i]==key){
        return i;
      }
    }
    return -1;
  }
  
  public static void main(String args[]){
    int numbers[]={4,2,3,7,9,10,1,5,8,6};
    int key=6;
    int index=linearSearch(numbers,key);
    if(index==-1){
      System.out.println("Key is'nt found");
    }else{
      System.out.println("Key is present at:"+ index);
    }
  }
}