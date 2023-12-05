import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> handCards = new ArrayList<Card>();

    public void addCards(Card card){
        handCards.add(card);
    }

    public int calculateScore(){
        int score = 0;

        for(Card card : handCards){
                switch (card.number){
                    case  "1","2","3","4","5","6","7","8","9","10" -> score += Integer.parseInt(card.number);
                    case "A","J","Q","K" -> score += 10;
            }
        }
        return score;
    }

    @Override
    public String toString() {
        return handCards.toString();
    }
}
