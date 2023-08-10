package pack2;
import pack1.Test;

class Demo{


    public static void main(String args[]){
                Test t1=new Test();
                // Test t2=new Test(); It is default method we can't access outside the package.
                // Test t3=new Test(); It is private method we can't access outsitde the class.
                // Test t4=new Test(); It is protected method we can access outside the package but child reference.
               
                

        t1.m1();
        // t2.m2();
        // t3.m3();
        // t4.m4();
        
    }
}