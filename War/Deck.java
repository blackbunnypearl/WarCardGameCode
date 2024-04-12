package War;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Deck {
    private List<Card> cards = new ArrayList<>();
    private List<String> suits = Arrays.asList("Hearts", "Diamonds", "Spades", "Clubs");

    public Deck() {
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                cards.add(new Card(i, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}
