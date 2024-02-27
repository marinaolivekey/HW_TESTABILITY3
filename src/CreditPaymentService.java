public class CreditPaymentService {

    public int calculate(int sumCredit, double percent, int year) {
        int months = year * 12;
        double monthsPercent = percent / 12 / 100;

        double k = (monthsPercent * Math.pow(1 + monthsPercent, months)) / (Math.pow(1 + monthsPercent, months) - 1);
        int payment = (int) (sumCredit * k);

        return payment;
    }
    //формула тут  https://sovcombank.ru/blog/krediti/kak-rasschitat-annuitetnii-platezh
}
