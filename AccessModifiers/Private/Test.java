// Private Access Modifier: The private access modifier is accessible only within the class.

class Test{
     
     private static void m1(){
        System.out.println("Hello,Gm");
     }
    public static void main(String[] args){
              m1(); 

    }
}

class A{

    public static void main(String[] args){
                Test t1=new Test();
               t1.m1();
    }
}

// So here it shows a compile time error that it is a private cannot access out side.