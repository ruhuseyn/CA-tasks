public class Question4 {

    public static void foo4(){

        int number = 121;
        int firstNumber = number;
        int qaliq = 0;
        int netice = 0;


        while(number>0){
            qaliq = number%10;
            netice = netice*10 + qaliq;
            number/=10;
        }
        if(firstNumber == netice){
            System.out.println("Eded palindromdur");
        }else{
            System.out.println("Eded palindrom deyil");
        }

    }
}
