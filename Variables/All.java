class All{
      
      static int a=100;// Static variable
      int b=50; // Instance varible

    public static void main(String[] args){

        int c=150; // we can say local variable

            All t1=new All();
            All t2=new All();

        System.out.println(a+t1.b+c);

        // Update the values

        t1.b=1;
        t2.b=2;
        a=200;
        System.out.println(a+t1.b+c+t2.b);





    }
}