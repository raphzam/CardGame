import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        GETTING INPUT

        System.out.println("Welcome!");

        do {
            System.out.println("Card value 1");
            int cardValue1 = input.nextInt();

            System.out.println("Card value 2");
            int cardValue2 = input.nextInt();

            if (cardValue1 == 0 && cardValue2 == 0) {
                System.out.println("Goodbye!");
                return; //will quit program if values entered are 0
            }

            int sum = cardValue1 + cardValue2;

            if (sum == 21){
                System.out.printf("%d*\n", sum);    //21* for getting 21
            } else {
                System.out.println(sum);
            }
        } while (true); //game runs infinitely until user enters 0 and 0


    }
}
