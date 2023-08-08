// foreach: For each is used to iterate the arrays
// Syntax: for( : ){}

class Test{

    public static void main(String[] args){

       int[] ids={101,102,103,104};
       String[]    enames={"Nani","Virat","Pallavi","Vamsi"};
       for(int id:ids){
         System.out.println(id);
       }
       for(String ename:enames){
         System.out.println(ename);
       }
      
    }
}