
class ShallowAndDeepCopy {
  public static void main(String[] args) {
    StudentN stu1=new StudentN();
    stu1.name="Saba Azeem";
    stu1.rollNo=19453;
    stu1.password="Password";
    int marks[]=new int[3];
    for(int i=0;i<marks.length;i++){
      stu1.marks[i]=i+80;
    }
    //call copy constructor with shallow copy
    
    	//StudentN stu2=new StudentN(stu1,false);
    //call copy constructor with deep copy
    
    	StudentN stu2=new StudentN(stu1,true);
    //print stu2
    System.out.println("Name:"+stu2.name+"\nRoll-No:"+stu2.rollNo+"\nPassword:"+stu2.password);
    for(int i=0;i<marks.length;i++){
      System.out.println("\n Marks of "+(i+1)+" is: "+stu2.marks[i]);
    }
    	//now i change in array and other properties and then display it, after call the construtor of stu2 obj,iska mtlb mai bad mai array mai changings kr rhi to stu2 ki array mai koi chagings nhi hone chahye(suppose)
    	  //i change in stu1 obj and display stu2 obj
    	  stu1.name="Ali";
    	  stu1.password="hacker";
          for(int i=0;i<marks.length;i++){
               stu1.marks[i]=i;
           }
    	  //display stu2 obj
    	  System.out.println("Name:"+stu2.name+"\nRoll-No:"+stu2.rollNo+"\nPassword:"+stu2.password);
    	  for(int i=0;i<marks.length;i++){
      			System.out.println("\n Marks of "+(i+1)+" is: "+stu2.marks[i]);
    	  }
    	  //stu1 ki array mai changeings krne se stu2 k obj ki b array change ho gai,aisa is liye huwa k kyu k hm ne stu mai array ka reffernce pass kia tha stu1 ki array ka stu2 mai,jb k deep copy k case mai aise nhi hoga,wha pr aik nai array bne gi
  }
}

class StudentN{
  String name;
  int rollNo;
  String password;
  int marks[];
  //default constructor
  StudentN(){
    marks=new int[3];
  }
  //copy constructor
  
  StudentN(StudentN stu,boolean deepCopy){
    this.name=stu.name;
    this.rollNo=stu.rollNo;
    this.password=stu.password;
    if(deepCopy){
      this.marks=new int[stu.marks.length];
      for(int i=0;i<stu.marks.length;i++){
        this.marks[i]=stu.marks[i];
      }
    }else{
      this.marks=stu.marks;
    }
  }
}
