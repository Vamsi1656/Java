// Default Access Modifier: If we cannot specify any modifier it is treated as a Default access modifier.
// Default Access Modifier is used within the package and within the class.

package pack;
     class Test{

    static void m1(){
        System.out.println("Hello,GE");
    }

    public static void main(String[] args){
                m1();

    }
}


// class A{

//       static void m2(){
//                 System.out.println("Hello,Hii");
//         }
//     public static void main(String[] args){
//           m2();
//         Test t1=new Test();
//         t1.m1();
//     }
// }