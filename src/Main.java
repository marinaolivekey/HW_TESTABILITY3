public class Main {
    public static void main(String[] args) {
        CreditPaymentService calc = new CreditPaymentService();

        int payment = calc.calculate(1_000_000, 9.99, 1);
        System.out.println(payment);

    }
}
