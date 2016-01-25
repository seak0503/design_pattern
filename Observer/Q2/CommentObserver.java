public class CommentObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("CommentObserver: 通知された数は" + generator.getNumber() + "です。");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}