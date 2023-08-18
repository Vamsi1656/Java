interface House{

    public void usingBricks();
    public void usingIron();
    public void usingCement();
}
class Contractor implements House{

    public void usingBricks(){

        System.out.println("First using Bricks");
    }
    public void usingIron(){

        System.out.println("Second using Iron");
    }
    public void usingCement(){

        System.out.println("Third using Cement");
    }
    public void usingSand(){
        System.out.println("Fourth using Sand");
    }

    public static void main(String args[]){

        Contractor c1=new Contractor();
        c1.usingBricks();
        c1.usingIron();
        c1.usingCement();
        c1.usingSand();
    }
}