interface Laptop{


    public void copy();
    public void paste();
    public void cut();
    public void keyboard();
}

abstract class Test{

    public static void copy(){
        System.out.println("Copy code");
    }
     public static void paste(){
        System.out.println("Paste code");
    }
     public abstract void cut();
     public abstract void keyboard();
    public static void main(String args[]){
           copy();
           paste();
    }
}
abstract class  Testone extends Test{
        public static void main(String[] args){

            copy();
            paste();
        }

}