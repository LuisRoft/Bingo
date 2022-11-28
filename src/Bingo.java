import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bingo {
    public void startGame() {
        RandomBall ball = new RandomBall();
        Table tabla = new Table();


        List<Integer> balls = new ArrayList<>();;
        int randomBall = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Press enter to start: \n");
        input.nextLine();
        tabla.printTable();

        while (balls.size() != 90) {
            randomBall = ball.generateRandomBall();
            if (!balls.contains(randomBall)) {
                balls.add(randomBall);
                System.out.println("La bola es: " + randomBall);
                System.out.print("Press enter to continue: \n");
                input.nextLine();
                tabla.printTable();
            }
        }
    }

}
