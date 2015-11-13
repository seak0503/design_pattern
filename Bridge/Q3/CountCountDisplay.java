public class CountCountDisplay extends CountDisplay {
    public CountCountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiMultiDisplay(int times) {
        for (int i = 0; i < times; i++) {
            multiDisplay(i);
        }
    }
}