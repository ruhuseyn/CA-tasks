public class Question6 {

    public static void foo6() {

        int number = 4673;
        int firstNumber = number;
        int secondNumber = number;
        int qaliq1 = 0;
        int qaliq2 = 0;
        int count = 0;
        boolean repetition = false;

        while (number > 0) {
            number /= 10;
            count++;
        }
        for (int i = 0; i < count; i++) {
            qaliq1 = firstNumber % 10;
            firstNumber /= 10;
            secondNumber /= 10;
            for (int j = 0; j < count; j++) {
                qaliq2 = secondNumber % 10;
                secondNumber /= 10;
                if (qaliq1 == qaliq2) {
                    repetition = true;
                }
            }
        }
        System.out.println(repetition);
    }
}
