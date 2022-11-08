public class StrangeSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            boolean a = i % 2 == 0;
            int b = a ? -1 : 1;
            sum += b * i;
        }
        System.out.println("Сумма : " + sum);
    }

}


