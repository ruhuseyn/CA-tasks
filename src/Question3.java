import java.util.Scanner;

public class Question3 {

    public static void foo3(){

        int number =4675;
        int cem = 0;
        int qaliq = 0;

        while(number>0){
            qaliq = number% 10;
            number/=10;
            boolean isPrimeNumber = true;
            for(int i = 2;i<qaliq;qaliq++){
                if(qaliq %i ==0){
                    isPrimeNumber = false;
                }
            }
            if(isPrimeNumber==true){
                cem+=qaliq;
            }
        }
        System.out.println(cem);
    }
}
