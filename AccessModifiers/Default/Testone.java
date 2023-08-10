package pack1;
import pack.Test;

class Testone{


    public static void main(String[] args){
            Test t1=new Test();
            // t1.m1();    // Here m1 method is not public in Test class so it shows error.

            t1.m1(); // Here we access the public for the m1 method in Test class so it executes succcessfully.
    } 
}