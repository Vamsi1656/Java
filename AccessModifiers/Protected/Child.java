package pack2;
import pack1.Parent;
class Child extends Parent{



    public static void main(String[] args){
                Parent p1=new Parent();
                // Parent p2=new Parent(); // It is default we can only access within package.
                // Parent p3=new Parent(); // It is private we can only access within class.
                Parent p4=new Parent();


                p1.m1();
                // p2.m2();
                // p3.m3();
                p4.m4();

    }
}