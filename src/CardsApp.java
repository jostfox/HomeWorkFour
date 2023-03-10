import java.util.Scanner;

public class CardsApp {

    public static void main(String[] args) {

        final int cardsForPlayer = 5;
        int players;
        final int numberOfCards = Suits.values().length * Rank.values().length;
        final Scanner sc = new Scanner(System.in);
        String[] deck = new String[numberOfCards];

        while (true) {
            System.out.println("Enter the number of players: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (players == 0) {
                    System.out.println("The game has been terminated.");
                    break;
                } else if (players < 0) {
                    System.out.println("The number of players cannot be less than 0");
                } else if (cardsForPlayer * players <= numberOfCards) {
                    break;
                } else {
                    System.out.println("Too many players!");
                }
            }
        }
        sc.close();

        Deck.DeckInitialization(deck);
        Deck.DeckShuffling(deck, numberOfCards);
        Deck.ShuffledDeckDisplayed(players, cardsForPlayer, deck);
    }
}

