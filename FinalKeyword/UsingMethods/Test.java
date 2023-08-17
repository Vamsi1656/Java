// Final method is inherited but you cannot override it.

class Test{
     final void wish(){
        System.out.println("Hello");
    }
    
   
}

class Test1 extends Test{

     public static void main(String[] args){
       Test1 t1=new Test1();
       t1.wish();
       
    }
}