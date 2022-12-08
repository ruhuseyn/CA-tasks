public class Question5 {

    public static void foo5(){

        int[] array = {19, 10, 5, 25, 13};
        int max = array[1];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Array en boyuk elementi: " + max);
    }
}
