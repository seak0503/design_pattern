public class Singleton {
    private static Singleton singleton = null;
    String note;
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
            singleton.note = "これはテストです。";
        }
        return singleton;
    }
}