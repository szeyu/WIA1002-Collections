public class PrintDigit {
    public static void main(String[] args) {
        int number = 4567;
        printDigit(number);
    }

    public static void printDigit(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            printDigit(n / 10);
            System.out.print((n % 10) + " ");
        }
    }
}
