 // In class it stops the inheritance.
 
 final class Test{
      static void  m1(){
            System.out.println("Hello");
        }
        
    
}
 class Test1 extends Test{
    public static void main(String[] args){
            Test t1=new Test();
            t1.m1();
    }
 }