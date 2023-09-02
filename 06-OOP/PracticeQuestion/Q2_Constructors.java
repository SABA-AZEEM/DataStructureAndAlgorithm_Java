
public class Constructors {
  public static void main(String[] args) {
    
    Stu s1=new Stu();
    Stu s2=new Stu("Saba");
    Stu s3=new Stu(true);
    Stu s4=new Stu(24);
    s1.printMethod();
    s2.printMethod();
    s3.printMethod();
    s4.printMethod();
  }
}

class Stu{
  String name;
  int age;
  boolean alive;
  
  Stu(){
    System.out.println("This is my default constructor.");
  } //if i didn't define default constructor then error occur
  Stu(String name){
    System.out.println("this is parameterized const. of name");
    this.name=name;
  }
  Stu(int age){
    System.out.println("this is parameterized const. of age");
    this.age=age;
  }
  Stu(boolean alive){
    System.out.println("Parameterized const. of alive status");
    this.alive=alive;
  }
  void printMethod(){
    System.out.println("Name:"+name+"\n Age:"+age+"\nAlive:"+alive);
  }
}