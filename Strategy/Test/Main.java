import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Random random = new Random(seed1);
        System.out.println(random.nextInt(seed2));
    }
}