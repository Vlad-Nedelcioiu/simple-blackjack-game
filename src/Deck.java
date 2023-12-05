import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards;

    public Deck(){
        createDeck();
        shuffleDeck();
    }
    private void createDeck(){
        cards = new ArrayList<>();
        String[] type = {"Hearts","Clubs","Spades","Diamonds"};
        String[] number = {"1","2","3","4","5","6","7","8","9","10","A","J","Q","K"};

        for(String t : type){
            for(String n : number){
                cards.add(new Card(t,n));
            }
        }
    }

    private void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty");
        }
        return cards.remove(0);
    }

    @Override
    public String toString() {
        return "Deck" + "cards = " + cards;
    }
}
