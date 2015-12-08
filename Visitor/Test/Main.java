class Main {
    public static void main(String[] args) {
        String s1 = "test.html";
        String s2 = ".html";

        if (s1.indexOf(s2) != -1) {
            System.out.println("見つかりました");
        } else {
            System.out.println("見つかりませんでした");
        }
    }
}