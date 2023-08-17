interface Laptop{

    public void copy();
    public void paste();
    public void cut();
    public void keyboard();
    public void save();

}   
class HP implements Laptop{
   
        public void copy(){
            System.out.println("HP copy code");
        }
         public void paste(){
            System.out.println("HP paste code");
        }
         public void cut(){
            System.out.println("HP cut code");
        }
         public void keyboard(){
            System.out.println("HP keyboard code");
        }
         public void save(){
            System.out.println("HP save code");
        }
         public static void main(String[] args){
        HP hp=new HP();
        hp.copy();
        hp.paste();
        hp.cut();
        hp.keyboard();
        hp.save();

         }


}

class Dell implements Laptop{
   
        public void copy(){
            System.out.println("Dell copy code");
        }
         public void paste(){
            System.out.println("Dell paste code");
        }
         public void cut(){
            System.out.println("Dell cut code");
        }
         public void keyboard(){
            System.out.println("Dell keyboard code");
        }
         public void save(){
            System.out.println("Dell save code");
        }
         public static void main(String[] args){
        Dell dell=new Dell();
        dell.copy();
        dell.paste();
        dell.cut();
        dell.keyboard();
        dell.save();

         }


}

