class Test{
            
       int a=100;  // Instance variable is declared outside the method and inside the class.
                   // It is not declared as static.
    public static void main(String[] args){
               
            Test t1=new Test();   // If you want declared instance variable in main method,
                                  // we need to create object using new keyword.
            Test t2=new Test();   // We can create multiple objects.
                                  // Variable is varied from object to object.
                                  // Each object have there own copy(different copy)
̣            System.out.println(t1.a);
            System.out.println(t2.a);

      }
}