import java.util.Random;

public class RondomCountDisplay extends Display {
    public RondomCountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void randomDisplay(int times) {
        Random rnd = new Random();
        int ran = rnd.nextInt(times);

        open();
        for (int i = 0; i < ran; i++) {
            print ();
        }
        close();
    }
}