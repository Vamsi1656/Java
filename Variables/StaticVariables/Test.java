class Test{
           
    static int a=100; // A variable is declared as static is called static variable.
                      // Variable is not varied from object to object.
                      // We can create single copy of the static variable and share it among all the objects.

    public static void main(String[] args){
             // We can the static variable in three forms.They are: 
             System.out.println(a);  // Through Directly
             Test a1=new Test();     // Creating Object
             System.out.println(a1.a);
            
             System.out.println(Test.a); // Using class name
             
 
    }
}

