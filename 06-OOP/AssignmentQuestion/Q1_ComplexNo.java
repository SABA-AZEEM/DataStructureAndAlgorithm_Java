import java.util.*;

class ComplexNo {
  public static void main(String[] args) {
    
    Complex obj1=new Complex(3,4);
    Complex obj2=new Complex(4,-3);
    
    Complex obj3=Complex.add(obj1,obj2);
    Complex obj4=Complex.subtract(obj1,obj2);
    Complex obj5=Complex.product(obj1,obj2);
    
    obj3.printComplex();
    obj4.printComplex();
    obj5.printComplex();
    
  }
}

class Complex{
  int real;
  int imag;
  
  public Complex(int r,int i){
    real=r;
    imag=i;
  }
  
  public static Complex add(Complex obj1,Complex obj2){
    return new Complex((obj1.real+obj2.real),(obj1.imag+obj2.imag));
  }
  
  public static Complex subtract(Complex obj1,Complex obj2){
    return new Complex((obj1.real-obj2.real),(obj1.imag-obj2.imag));
  }
  
  public static Complex product(Complex obj1,Complex obj2){
    return new Complex((obj1.real*obj2.real)-(obj1.imag*obj2.imag),(obj1.real*obj2.imag)+(obj1.imag*obj2.real));
  } 
  
  public void printComplex(){
    if(real==0 && imag!=0){
      System.out.println(imag+"i");
    }
    else if(imag==0 && real!=0){
      System.out.println(real);
    }else{
      System.out.println(real+"+"+imag+"i");
    }
  }
}