public class CreditService {
    public int X(int period, int credit, double percent) {
        int resolt;
        double A = percent / 100;
        double X = A / 12;
        double ratio = X + (X / (Math.pow(1 + X, period) - 1));
        double payment = credit * ratio;
        return (int) payment;
    }
}
