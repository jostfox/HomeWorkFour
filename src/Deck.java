import java.util.Random;

public class Deck {

    public static void DeckInitialization(String[] deck) {
        for (int i = 0; i < Rank.values().length; i++) {
            for (int j = 0; j < Suits.values().length; j++) {
                deck[Suits.values().length * i + j] = Rank.values()[i] + " " + Suits.values()[j];
            }
        }
    }

    public static void DeckShuffling(String[] deck, int numberOfCards) {
        final Random random = new Random();
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }

    public static void ShuffledDeckDisplayed(int players, int cardforplayers, String[] deck) {
        for (int i = 0; i < players * cardforplayers; i++) {
            System.out.println(deck[i]);
            if (i % cardforplayers == cardforplayers - 1) {
                System.out.println();
            }
        }
    }
}
