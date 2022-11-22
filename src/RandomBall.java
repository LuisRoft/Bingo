import java.util.Random;

public class RandomBall {
    public int generateRandomBall() {
        Random random = new Random();
        return random.nextInt(90);
    }
}