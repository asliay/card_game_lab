import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> allTheCards;

    public Deck(){
        this.allTheCards = new ArrayList<>();
    }

    public ArrayList<Card> getAllTheCards() {
        return allTheCards;
    }

    public int countCards() {
        return this.allTheCards.size();
    }

    public void addCardToDeck(Card card){
        this.allTheCards.add(card);
    }
    //each card object has a suit and a rank
    //fill the deck arraylist with 52 card objects
    //for each suit the should one of each rank (13 cards)
    public void populateDeck(){
        for(SuitType suit : SuitType.values() ){
            for (RankType rank : RankType.values()){
                Card card = new Card(suit, rank);
                this.addCardToDeck(card);
            }
        }
        this.shuffleDeck();
    }

    public void shuffleDeck(){
        Collections.shuffle(allTheCards);
    }

    public void dealACard(Player player){
        Card cardForPlayer = allTheCards.remove(0);
              player.getHand().add(cardForPlayer);
    }
}
