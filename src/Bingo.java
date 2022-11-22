import java.util.Scanner;

public class Bingo {
    public void startGame() {
        RandomBall ball = new RandomBall();
        Table tabla = new Table();


        int[] balls = new int [90];

        Scanner input = new Scanner(System.in);

        int i = 0;
        int number = 0;
        while(true){
            do {
                tabla.printTable();
                number = ball.generateRandomBall();
                balls[i] = number;
                System.out.println("El numero de la bola es: "+ 6);
                System.out.print("Press Enter to continue: \n");
                input.nextLine();
                i ++;

            } while (balls[i] != number);
        }
    }

}
