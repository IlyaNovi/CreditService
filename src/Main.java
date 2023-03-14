public class Main {
    public static void main(String[] args) {
        CreditService service = new CreditService();
        int paymant = service.X(36, 1_000_000, 9.99);

        System.out.println(paymant);
    }
}
