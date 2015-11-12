public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new DecoDisplayImpl('<', '*', '>'));
        d1.display();
    }
}