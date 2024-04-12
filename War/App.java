package War;
public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player A");
        Player player2 = new Player("Player B");

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            System.out.print("Player A ");
            player1Card.describe();
            System.out.print("Player B ");
            Card player2Card = player2.flip();
            player2Card.describe();
            System.out.println();

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println("Player A wins this round");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.println("Player B wins this round");
            } else {
                System.out.println("This round is a draw");
            }
            System.out.println();
            System.out.printf("Player A score = %d\n", player1.getScore());
            System.out.printf("Player B score = %d\n", player2.getScore());
            System.out.println();
        }

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player A wins the whole game");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player B wins the whole game");
        } else {
            System.out.println("War ends in a draw");
        }
    }
}
