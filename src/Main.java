public class Main {
    public static void main(String[] args) {
        int bonusMilesTicket = 13676;
        int price = 20;

        if (bonusMilesTicket < 0) {
            bonusMilesTicket = 0;
        }
        int MilesNumber = bonusMilesTicket / price;
        System.out.println(MilesNumber);
    }
}