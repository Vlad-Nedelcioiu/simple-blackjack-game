public class Card {
    String type;
    String number;

    public Card(String type, String number) {
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card = " + type + " number = " + number;
    }
}
