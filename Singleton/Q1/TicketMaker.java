public class TicketMaker {
    private static int ticket = 1000;
    private static TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker() {
        System.out.println("チケット番号生成を開始します。");
    }
    public static int getNextTicketNumber() {
        return ticket++;
    }
}