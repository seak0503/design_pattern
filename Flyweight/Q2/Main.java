public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }
        BigString bs;
        bs = new BigString(args[0], false);
        usedMemory();
        bs.print();
        bs.removeUnshared();

        bs = new BigString(args[0], true);
        usedMemory();
        bs.print();
        bs.removeShared();
    }
    public static void usedMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用メモリ = " + used);
    }
}