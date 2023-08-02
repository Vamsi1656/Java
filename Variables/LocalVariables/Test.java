class Test{

    void method(){

        int a=100;
        System.out.print(a); // The local variable is declared inside the body of the method and it doesn't access
                             // the outside of the method.
    }

    public static void main(String[] args){

            Test a1=new Test();
            a1.method();
    }
}