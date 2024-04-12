package War;
import java.util.ArrayList;
import java.util.List;

class Player {
    private List<Card> hand = new ArrayList<>();
    private int score;
    private String name;

    public Player() {
        score = 0;
    }

    public Player(String newNames) {
        name = newNames;
        score = 0;
    }

    public void describe() {
        System.out.printf("Player %s has these cards:\n", name);
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
