public class StandardOutputBuilder extends Builder {
    public void makeTitle(String title) {
        System.out.println("==============================");
        System.out.println("『" + title + "』");
        System.out.println("");
    }
    public void makeString(String str) {
        System.out.println('■' + str);
        System.out.println("");
    }
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("　・" + items[i]);
        }
        System.out.println("");
    }
    public void close() {
        System.out.println("==============================");
    }
}