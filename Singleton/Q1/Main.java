public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        int obj1 = TicketMaker.getNextTicketNumber();
        int obj2 = TicketMaker.getNextTicketNumber();
        System.out.println("obj1のチケット番号は " + obj1 + " です。");
        System.out.println("obj2のチケット番号は " + obj2 + " です。");
    }
}