// If you apply static keyword with any method, it is known as static method.
// A static method belongs to the class rather than the object of a class.
// A static method can be invoked without the need for creating an instance of a class.
// A static method can access static data member and can change the value of it.

class Test{

    public static void m1(){

        System.out.println("Hello");

    }
    

    public static void main(String[] args){

        m1();
       
    }
}