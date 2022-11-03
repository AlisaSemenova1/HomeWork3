public class SimpleNumber {
    public static void main(String[] args) {
        {
            int number = 11;
            if (number == 1 | number == 0) {
                System.out.println("Число " + number + " не является ни простым, ни составным");
                return;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Число " + number + " составное");
                    return;
                }
            }
            System.out.println("Число " + number + " простое");
        }

    }
}





