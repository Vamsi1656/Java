class Demo1{


    public static void main(String[] args){

        System.out.println(args);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println(args[0]+args[1]+args[2]+args[3]); 

        // To avoid this concatination we use wrapper classes(Type Casting).
         int a= Integer.parseInt(args[0]);
         int b= Integer.parseInt(args[1]);
         int c= Integer.parseInt(args[2]);
         int d= Integer.parseInt(args[3]);
       
        System.out.println(a+b+c+d);
        




    }
}