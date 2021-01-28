import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card card;
    private Card card1;
    private Player player1;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(SuitType.HEART, RankType.JACK);
        card1 = new Card(SuitType.HEART, RankType.ACE);
        player1 = new Player("Teddy Castro");

    }

    @Test
    public void testDeckStartsEmpty() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void testAddCardToDeck() {
        deck.addCardToDeck(card);
        assertEquals(1, deck.countCards());
    }

    @Test
    public void canPopulateDeck() {
        deck.populateDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canDealACard(){
        deck.populateDeck();
        deck.dealACard(player1);
        assertEquals(51, deck.countCards());
    }
}




