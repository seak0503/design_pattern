import java.util.Random;

public class RondomCountDisplay extends CountDisplay {
    private Random random = new Random();
    public RondomCountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));
    }
}