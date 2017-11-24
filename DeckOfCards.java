package card;
import java.util.Random;
/*
Programmer: Zachary Dorow
Programming Project 8.7
Object Oriented Programming I
Deck of Cards Excercise 
 */
public class DeckOfCards {
	private final Card[] cards;
	int count = 1;

	DeckOfCards()
	{
		count = 52;
		cards = new Card[52];
		int x = 0;
		for (int a=0; a<=3; a++)
		{
                    for (int b=0; b<=12; b++)
			 {
			   cards[x] = new Card(a, b);
			   x++;
			 }
		}
	}
        

public Card shuffle()
	{
		Random generator = new Random();
		int cardIndex = 0;
		do {
			cardIndex = generator.nextInt( 52 );

		} while (cards[cardIndex] == null);

		count--;
		Card temp = cards[cardIndex];
		cards[cardIndex]= null;
		return temp;
	}

public String dealCard()
{
    Card MyCard = shuffle();
    return MyCard.toString();
}

    public int getTotalCards()
	{
                return count;
	}
} 