public class StrangeSum {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i = i + 4) {
            int a = i;
            int b = a + 1;
            int c = b + 1;
            int d = c + 1;

            sum = a - b + c - d;
        }
        System.out.println("Сумма : " + sum);
    }

}


