public class Multiples {
    public static void main(String[] args) {
        Integer count = 0;


        for (int i = 1; i < 1000; i++) {
            boolean divisbleBy3 = i % 3 == 0;
            boolean divisbleBy5 = i % 5 == 0;

            if (divisbleBy3 || divisbleBy5) {
                count++;
            }
        }

        System.out.println(count);
    }
}
