public class Main extends Thread {
    public Main() {
    }
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.note);
    }
    public static void main(String[] args) {
        new Main().start();
        new Main().start();
        new Main().start();
    }
}