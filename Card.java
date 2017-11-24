package card;
/*
Programmer: Zachary Dorow
Programming Project 8.7
Object Oriented Programming I
Deck of Cards Excercise 
 */
public class Card
{
	private final int rank;
	private final int suit;

	private static final String[] suits = { "Spades ♤", "Hearts ♡", "Diamonds ♢", "Clubs ♧"};
	private static final String[] ranks  = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };


	Card(int suit, int rank)
	{
		this.rank=rank;
		this.suit=suit;
	}

	public @Override String toString()
	{
		  return ranks[rank] + " of " + suits[suit];
	}

	public int getRank() {
		 return rank;
	}

	public int getSuit() {
		return suit;
	}

}
