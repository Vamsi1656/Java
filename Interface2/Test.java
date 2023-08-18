interface Mobile{


    public void camera();
    public void calculator();
    public void google();
    public void messages();

    default void Apps(){
        System.out.println("Apps are Available");
    }
    static void security(){
         System.out.println("Security is available");
    }
}

class Oneplus{

    public void camera(){
        System.out.println("Oneplus Camera is Available");
    }
    public void calculator(){
        System.out.println("Oneplus Calculator is Available");
    }
    public void google(){
        System.out.println("Oneplus Google is Available");
    }
    public void messages(){
        System.out.println("Oneplus Messages is Available");
    }

    public void Apps(){
        System.out.println("Oneplus Apps are available");
    }
    
}


class Redmi{

    public void camera(){
        System.out.println("Redmi Camera is Available");
    }
    public void calculator(){
        System.out.println("Redmi Calculator is Available");
    }
    public void google(){
        System.out.println("Redmi Google is Available");
    }
    public void messages(){
        System.out.println("Redmi Messages is Available");
    }
   
}

class All{
        public static void main(String[] args){
        Oneplus oneplus=new Oneplus();
        oneplus.camera();
        oneplus.calculator();
        oneplus.google();
        oneplus.messages();
        oneplus.Apps();

        Mobile.security();

         Redmi redmi=new Redmi();
        redmi.camera();
        redmi.calculator();
        redmi.google();
        redmi.messages();

        Mobile.security();
    }
    
}