
class Inheritance {
  public static void main(String[] args) {
    //single level inheritance
    	//Cat cat=new Cat();
    	//cat.printCatInfo();
    //Multilevel inheritance
    	//JungliCat cat=new JungliCat();
    	//cat.printCatInfo();
    //Hierarchical inheritance
    	Dog dog=new Dog();
    	dog.printDogInfo();
    	Donkey donkey=new Donkey();
    	donkey.printDonkeyInfo();
    
  }
}

class Animal{
  int count=30;
}
//single inheritance
class Cat extends Animal{
  int catCount=5;
  void printCatInfo(){
    System.out.println("total cats are "+catCount+" in total "+count+" Animals");
  }
}
//multilevel inheritance
class JungliCat extends Cat{
  int jungliCatCount=2;
  void printCatInfo(){
    System.out.println("total jungli cats are "+jungliCatCount+" in total "+catCount+" Cats and total Animals are"+count);
  }
}
//hierarchical inheritance
class Dog extends Animal{
  void printDogInfo(){
    int dogCount=4;
     System.out.println("total dogs are "+dogCount+" in total "+count+" Animals");
  }
}

class Donkey extends Animal{
  void printDonkeyInfo(){
    int donkeyCount=8;
     System.out.println("total dogs are "+donkeyCount+" in total "+count+" Animals");
  }
}