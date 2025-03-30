public class FactorPrinter {

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Factors of 10:");
        printFactors(10);   // 1, 2, 5, 10

        System.out.println("\nFactors of 15:");
        printFactors(15);   // 1, 3, 5, 15

        System.out.println("\nFactors of 21:");
        printFactors(21);   // 1, 3, 7, 21

        System.out.println("\nFactors of 1:");
        printFactors(1);    // 1

        System.out.println("\nFactors of -5:");
        printFactors(-5);   // Invalid Value

        System.out.println("\nFactors of 28:");
        printFactors(28);   // 1, 2, 4, 7, 14, 28
    }
}
