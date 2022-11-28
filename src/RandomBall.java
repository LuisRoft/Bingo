import java.util.Random;

public class RandomBall {
    Random random = new Random();
    public int generateRandomBall() {
        return random.nextInt(90);
    }
}