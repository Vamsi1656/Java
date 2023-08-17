abstract class Age{
    public abstract int cal_Age();  // only method declartion
}

//child class is  resposbile to provide impl
class Calc_Impl extends Age{
        public int cal_Age(){
        
        return 40;
        }
}

 class Test{
        public static void main(String[] args){
              int age =   new Calc_Impl().cal_Age();
              System.out.println(age);
        }
}