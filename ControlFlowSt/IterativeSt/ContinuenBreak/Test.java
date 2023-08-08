// Print 1 2 3 5 6 7 8 9 10
class Test{


    public static void main(String[] args){
            for(int i=1; i<=10; i++){
                if(i==4){
                    continue;  // It skips the current iteration and execute the next iteration
                }
                System.out.println(i);
            }

    }
}

