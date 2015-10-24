public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for (int i = 0; 3 > i; i++) {
            Triple obj = Triple.getInstance(i);
            System.out.println(i + "番目のインスタンスを取得しました");
        }
        System.out.println("End.");
    }
}