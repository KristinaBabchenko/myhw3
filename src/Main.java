// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account, bonus, replenish;

        account = 100;
        replenish=1000;
        bonus=replenish/100;

        if (replenish >= 1000) {
            account = replenish+account+bonus;
        }
            else {
               account=replenish+account;}
        {
            System.out.println(account+ "_рублей.");
        }


    }
}