abstract class Demo{

   public abstract int cal_age();
}

class Demo1 extends Demo{

    public int cal_age(){


    return 21;
    }
}

 class Demo2{
        public static void main(String[] args){

            int age=new Demo1().cal_age();
            System.out.println(age);
        }

}