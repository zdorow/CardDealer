package card;
/*
Programmer: Zachary Dorow
Programming Project 8.7
Object Oriented Programming I
Deck of Cards Excercise 
 */
public class CardMain {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
                
	   while (deck.getTotalCards()!= 0 )
	   {
                   String MyCard = deck.dealCard();
                   System.out.println( "Card#:" + (deck.getTotalCards() + 1));                   
		   System.out.println(MyCard);
                   switch(MyCard)
                   {
                       //Spades
                        case "Ace of Spades ♤" :
                           System.out.println("🂡");
                           break;
                        case "2 of Spades ♤" :
                           System.out.println("🂢");
                           break;
                        case "3 of Spades ♤" :
                           System.out.println("🂣");
                           break;
                        case "4 of Spades ♤" :
                           System.out.println("🂤");
                           break;
                        case "5 of Spades ♤" :
                           System.out.println("🂥");
                           break;
                        case "6 of Spades ♤" :
                           System.out.println("🂦");
                           break;
                        case "7 of Spades ♤" :
                           System.out.println("🂧");
                           break;
                        case "8 of Spades ♤" :
                           System.out.println("🂨");
                           break;
                        case "9 of Spades ♤" :
                           System.out.println("🂩");
                           break;
                        case "10 of Spades ♤" :
                           System.out.println("🂪");
                           break;
                        case "Jack of Spades ♤" :
                           System.out.println("🂫");
                           break;
                        case "Queen of Spades ♤" :
                           System.out.println("🂭");
                           break;
                        case "King of Spades ♤" :
                           System.out.println("🂮");
                           break;
                        //Hearts
                        case "Ace of Hearts ♡" :
                           System.out.println("🂱");
                           break;
                        case "2 of Hearts ♡" :
                           System.out.println("🂢");
                           break;
                        case "3 of Hearts ♡" :
                           System.out.println("🂣");
                           break;
                        case "4 of Hearts ♡" :
                           System.out.println("🂤");
                           break;
                        case "5 of Hearts ♡" :
                           System.out.println("🂥");
                           break;
                        case "6 of Hearts ♡" :
                           System.out.println("🂦");
                           break;
                        case "7 of Hearts ♡" :
                           System.out.println("🂧");
                           break;
                        case "8 of Hearts ♡" :
                           System.out.println("🂨");
                           break;
                        case "9 of Hearts ♡" :
                           System.out.println("🂩");
                           break;
                        case "10 of Hearts ♡" :
                           System.out.println("🂪");
                           break;
                        case "Jack of Hearts ♡" :
                           System.out.println("🂫");
                           break;
                        case "Queen of Hearts ♡" :
                           System.out.println("🂭");
                           break;
                        case "King of Hearts ♡" :
                           System.out.println("🂮");
                           break;
                        //Diamonds
                        case "Ace of Diamonds ♢" :
                           System.out.println("🃁");
                           break;
                        case "2 of Diamonds ♢" :
                           System.out.println("🂢");
                           break;
                        case "3 of Diamonds ♢" :
                           System.out.println("🂣");
                           break;
                        case "4 of Diamonds ♢" :
                           System.out.println("🂤");
                           break;
                        case "5 of Diamonds ♢" :
                           System.out.println("🂥");
                           break;
                        case "6 of Diamonds ♢" :
                           System.out.println("🂦");
                           break;
                        case "7 of Diamonds ♢" :
                           System.out.println("🂧");
                           break;
                        case "8 of Diamonds ♢" :
                           System.out.println("🂨");
                           break;
                        case "9 of Diamonds ♢" :
                           System.out.println("🂩");
                           break;
                        case "10 of Diamonds ♢" :
                           System.out.println("🂪");
                           break;
                        case "Jack of Diamonds ♢" :
                           System.out.println("🂫");
                           break;
                        case "Queen of Diamonds ♢" :
                           System.out.println("🂭");
                           break;
                        case "King of Diamonds ♢" :
                           System.out.println("🂮");
                           break;
                        //Clubs
                        case "Ace of Clubs ♧" :
                           System.out.println("🃁");
                           break;
                        case "2 of Clubs ♧" :
                           System.out.println("🂢");
                           break;
                        case "3 of Clubs ♧" :
                           System.out.println("🂣");
                           break;
                        case "4 of Clubs ♧" :
                           System.out.println("🂤");
                           break;
                        case "5 of Clubs ♧" :
                           System.out.println("🂥");
                           break;
                        case "6 of Clubs ♧" :
                           System.out.println("🂦");
                           break;
                        case "7 of Clubs ♧" :
                           System.out.println("🂧");
                           break;
                        case "8 of Clubs ♧" :
                           System.out.println("🂨");
                           break;
                        case "9 of Clubs ♧" :
                           System.out.println("🂩");
                           break;
                        case "10 of Clubs ♧" :
                           System.out.println("🂪");
                           break;
                        case "Jack of Clubs ♧" :
                           System.out.println("🂫");
                           break;
                        case "Queen of Clubs ♧" :
                           System.out.println("🂭");
                           break;
                        case "King of Clubs ♧" :
                           System.out.println("🂮");
                           break;
                        default:
                            break;                          
            
                           }
	   }
	}
}
