
public class ClassesAndObj {
  public static void main(String[] args) {
    //Pen object
    Pen p1=new Pen();
    p1.setColor("Blue");
    p1.setPrice(50);
    System.out.println(p1.color);
    System.out.println(p1.price);
    p1.color="Black";
    System.out.println(p1.color);
    //Student Object
    Student s1=new Student();
    s1.name="Saba Azeem";
    System.out.println(s1.name);
    System.out.println(s1.age); //0
    s1.age=24;
    System.out.println(s1.age);
    //s1.avg=34.5;  //we can't access it
    s1.avgCalculate(80,89,90);
  }
}

//Pen class
class Pen{
  String color;
  int price;
  
  void setColor(String color){
    this.color=color;
  }
  void setPrice(int price){
    this.price=price;
  }
}

//Student class
class Student{
  String name;
  int age;
  private float avg;
  
  void avgCalculate(int phy,int math,int chem){
    avg=(phy+math+chem)/3;
    System.out.println("Average is:"+avg);
  }
}