import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;
    public RandomStrategy() {
        random = new Random();
    }
    public Hand nextHand() {
        Hand prevHand = Hand.getHand(random.nextInt(3));
        return prevHand;
    }
    public void study (boolean win) {}
}