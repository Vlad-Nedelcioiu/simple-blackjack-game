import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();

        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();

        playerHand.addCards(deck.drawCard());
        dealerHand.addCards(deck.drawCard());
        playerHand.addCards(deck.drawCard());
        dealerHand.addCards(deck.drawCard());

        while(true){

            System.out.println("Your cards: " + playerHand + " Score: " + playerHand.calculateScore());
            System.out.println("Dealers card: " + dealerHand);

            if (playerHand.calculateScore() > 21) {
                System.out.println("Over 21 ! You lose");
                break;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Hit or stay?");
            String cmd = scanner.nextLine().toLowerCase();

            if (cmd.equals("hit")) {
                playerHand.addCards(deck.drawCard());
            } else if (cmd.equals("stay")) {

                while (dealerHand.calculateScore() < 18) {
                    dealerHand.addCards(deck.drawCard());
                }

                System.out.println("Your hand: " + playerHand + "Score: " + playerHand.calculateScore());
                System.out.println("Dealer's hand: " + dealerHand + "Score: " + dealerHand.calculateScore());

                if (dealerHand.calculateScore() > 21 || playerHand.calculateScore() > dealerHand.calculateScore()) {
                    System.out.println("You win!");
                } else if (playerHand.calculateScore() == dealerHand.calculateScore()) {
                    System.out.println("Tie!");
                } else {
                    System.out.println("You lose");
                }
                break;

            } else {
                System.out.println("Please enter hit or stand");
            }
        }

    }
}