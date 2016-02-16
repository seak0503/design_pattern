public class Main {
    public static void main(String[] args) {
        String[] strings;
        strings = new String[3];
        strings[0] = "abcde";
        strings[1] = "fghij";
        strings[2] = "klmno";
        strings[0] = null;
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);
    }
}