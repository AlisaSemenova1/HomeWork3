public class BuckwheatReserves {
    public static void main(String[] args) {
        int sum = 0;
        for (int buckwheat = 100; buckwheat >= 0; buckwheat -= 6) {
            int sumMonth = 100 * buckwheat;
            sum = sum + sumMonth;
        }
        System.out.println(sum + " нужно будет Василию, чтобы оплатить хранение 100 кг гречки.");


        int sum1 = 0;
        int buckwheat1 = 0;
        for (int month = 1; month <= 20; month++) {
            buckwheat1 += 6;
            sum1 += buckwheat1 * 100;
        }

        System.out.println(sum1 + " нужно будет заплатить Василию за 20 месяцев (со звёздочкой.)");


    }

}