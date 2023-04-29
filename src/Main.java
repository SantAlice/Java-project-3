public class Main {
    public static void main(String[] args) {
        int onAccount = 824;
        int refill = 1200;
        if (onAccount + refill > 1000) {
            int bonus = (refill / 100);
            System.out.println(bonus + onAccount + refill);
            System.out.println(bonus);

        } else {
            int bonus = 0;
            System.out.println(bonus);
            System.out.println(onAccount+refill);
        }
    }
}
