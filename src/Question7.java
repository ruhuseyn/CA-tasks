public class Question7 {

    public static void foo7() {

        for (int i = 0; i < 1000; i++) {
            int cem = 0;
            int number = i;
            while (number > 0) {
                cem += number % 10;
                number /= 10;
            }
            if (cem % 3 == 0 && i % 10 != 3) {
                System.out.println(i);
            }


        }
    }
}
