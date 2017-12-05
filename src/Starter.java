import java.util.Random;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Random random = new Random();

        int winnerNumber = random.nextInt(1000);
        Scanner scanner = new Scanner(System.in);

        int userAnswer;

       do {
               System.out.print("Podaj liczbę: ");
               userAnswer = scanner.nextInt();

               if (userAnswer > winnerNumber) {
                   System.out.println("niżej");
               } else if(userAnswer < winnerNumber) {
                   System.out.println("wyżej");
               }
       }while (userAnswer != winnerNumber);
        System.out.println("Brawo, wygrałeś!");

    }
}
