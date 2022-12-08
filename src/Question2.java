public class Question2 {

    public static void foo2(){
        int number = 6473;
        int lastNumber = number;
        int count = 0;

        while(number>0){
            number/=10;
            count++;
        }
        switch(count){
            case 1:
                System.out.println(lastNumber + "-teklik");
                break;
            case 2:
                System.out.println(lastNumber +"-onluq");
                break;
            case 3:
                System.out.println(lastNumber + "-yuzluk");
                break;
            case 4:
                System.out.println(lastNumber + "-minlik");
                break;
            default:
                System.out.println("Daha asagi mertebeli eded daxil edin...");
        }
    }
}
