// It denotes a Constant (or) It is used to restrict the user.
// It is applicable to Variables.
// In variables we cannot change the value when we using final keyword.

class Test{

    final int a=10;
    void m1(){

     a=20;
    }
     public static void main(String[] args){
           Test t1=new Test();
           t1.m1();
}

}


