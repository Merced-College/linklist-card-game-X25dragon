package card.java;

public class Card {
    // Instance variables
    private String cardSuit;
    private String cardName;
    private int cardValue;
    private String cardPic;

    // Default constructor
    public Card() {
        this.cardName = "King";
        this.cardValue = 10;
    }

    // Constructor with card name and value
    public Card(String name, int value) {
        this.cardName = name;
        this.cardValue = value;
    }

    // Constructor with all attributes
    public Card(String suit, String name, int value, String pic) {
        this.cardSuit = suit;
        this.cardName = name;
        this.cardValue = value;
        this.cardPic = pic;
    }

    // Getter methods
    public String getCardName() {
        return cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardPic() {
        return cardPic;
    }

    // Setter methods
    public void setCardName(String newCardName) {
        this.cardName = newCardName;
    }

    public void setCardValue(int newCardValue) {
        this.cardValue = newCardValue;
    }

    public void setCardSuit(String newCardSuit) {
        this.cardSuit = newCardSuit;
    }

    public void setCardPic(String newCardPic) {
        this.cardPic = newCardPic;
    }

    // Method to compare cards
    private int suitRank() {
        switch (cardSuit) {
            case "Spades":
                return 4;
            case "Hearts":
                return 3;
            case "Diamonds":
                return 2;
            case "Clubs":
                return 1;
            default:
                return 0;
        }
    }

    public int compareTo(Card otherCard) {
        if (this.cardValue != otherCard.cardValue) {
            return this.cardValue - otherCard.cardValue;
        } else {
            return this.suitRank() - otherCard.suitRank();
        }
    }

    // toString method
    @Override
    public String toString() {
        return cardName + " of " + cardSuit + " (Value: " + cardValue + ", Picture: " + cardPic + ")";
    }
}
