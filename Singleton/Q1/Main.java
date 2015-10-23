public class Main extends Thread {
    TicketMaker instance;
    public Main(TicketMaker instance) {
        this.instance = instance;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + instance.getNextTicketNumber());
        }
    }
    public static void main(String[] args) {
        TicketMaker instance = TicketMaker.getInstance();
        new Main(instance).start();
        new Main(instance).start();
        new Main(instance).start();
        new Main(instance).start();
        new Main(instance).start();
    }
}