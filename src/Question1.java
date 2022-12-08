public class Question1 {
    public static void foo1(){
        for (int i = 0; i < 1000; i++) {
            int cem = 0;
            int number = i;
            while (number > 0) {
                cem += number % 10;
                number /= 10;
            }
            if (cem % 5 == 0 && i % 5 == 0) {
                System.out.println(i);
            }


        }
    }
}
