package pack1;
public class Test{
 
        public static void m1(){

            System.out.println("I am going to Home today");
        }
           static void m2(){

            System.out.println("I am going to Home today evening 7pm");
        }
        //  private static void m3(){

        //     System.out.println("I am going to Home today by Bus");
        // } It is private method which is accesed within the class
         protected static void m4(){

            System.out.println("I came back on 17th");
         }

         public static void main(String[] args){
                m1();
                m2();
                // m3();
                m4();

    }
}

class TestOne{
    
            public static void m5(){
            System.out.println("Bye Prends");

            }
            
            public static void m6(){
            System.out.println("See You Soon");

            }

    public static void main(String[] args){
                Test t1=new Test();
                Test t2=new Test();
                        t1. m1();
                        t2. m2();
                        // t2. m3();
                        t2. m4();
                       m5();
                       m6();
    }

}