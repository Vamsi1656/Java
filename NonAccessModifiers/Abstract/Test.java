// Abstract class is the class which is denoted by abstract keyword.
// In Abstract class we cannot do any implementation.
// Implementation is done by child class.
// Object is not created in abstract class.

abstract class Test{

            public abstract void m1();

}

class Test1 extends Test{
 
          public void  m1(){
               System.out.println("Hello");
            }

            public static void main(String[] args){

                Test t1=new Test1();
                t1.m1();
            }
}

