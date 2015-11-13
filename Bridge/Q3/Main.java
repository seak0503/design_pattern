public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new DecoDisplayImpl('<', '*', '>'));
        CountCountDisplay d2 = new CountCountDisplay(new DecoDisplayImpl('<', '*', '>'));
        d1.display();
        d2.multiMultiDisplay(5);
    }
}