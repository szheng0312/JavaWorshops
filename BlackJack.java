import java.util.Scanner;
import java.util.ArrayList;

public class BlackJack{
    public static class Cards{
        String rawValue;
        String cardSuit;
        int cardNum;
        Cards(String raw){
            this.rawValue = raw;
            this.cardSuit = rawValue.substring(0, 1);
            this.cardNum = Integer.parseInt(rawValue.substring(1)); 
        }
       
        public String cardName(){
            String masterSuit = "";
            if (cardSuit.equals("C")){
                masterSuit = "Clubs";
            } else if (cardSuit.equals("S")){
                masterSuit = "Spades";
            } else if (cardSuit.equals("H")){
                masterSuit = "Hearts";
            } else if (cardSuit.equals("D")){
                masterSuit = "Diamonds";
            } 

            String finalValue;
            if (cardNum == 1){
                finalValue = "Ace";
            } else if (cardNum == 11){
                finalValue = "Jack";
            } else if (cardNum == 12){
                finalValue = "Queen";
            } else if (cardNum == 13){
                finalValue = "King";
            } else{
                finalValue = cardNum + "";
            }

            return (finalValue + " of " + masterSuit);
        }
        public int cardValue(){
            int value = cardNum;
            if (value > 10){
                value = 10;
            }
            return value;
        }
    }
    public static class Dealer{
        String dCard1;
        String dCard2;
        Cards dealerCard;
        Cards dealerCard2;
        Dealer(String c1, String c2){
            this.dCard1 = c1;
            this.dCard2 = c2;
            this.dealerCard = new Cards(dCard1);
            this.dealerCard2 = new Cards(dCard2);
        }
        
        public String dealerCards(){
            String nameCards = "The dealer had " + dealerCard.cardName() + " and " + dealerCard2.cardName();
            return nameCards;
        }   
        public int dealerValue(){
            int valueCards = dealerCard.cardValue() + dealerCard2.cardValue();
            return valueCards;
        }
        
    }
    public static class Player{
        String pCard1;
        String pCard2;
        Cards playerCard;
        Cards playerCard2;
        int valueCards;
        Player(String card1, String card2){
            this.pCard1 = card1;
            this.pCard2 = card2;
            this.playerCard = new Cards(pCard1);
            this.playerCard2 = new Cards(pCard2);
            this.valueCards = playerCard.cardValue() + playerCard2.cardValue();
        }
       
        public String playerCards(){
            String nameCards = "You have " + playerCard.cardName() + " and " + playerCard2.cardName();
            return nameCards;
        }   
        public int playerValue(){
            return valueCards;
        }
        public void addCard(String newCard){
            Cards another = new Cards(newCard);
            valueCards += another.cardValue();
            System.out.println("You just got " + another.cardName());
        }
        
    }
    public static String getCard(ArrayList<String> cardList){
        int randomNum = (int)(Math.random() * cardList.size());
        String chosenCard = cardList.get(randomNum);
        cardList.remove(randomNum);
        return chosenCard;
    }

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int victories = 0;
        while (true){
            ArrayList<String> cardArray = new ArrayList<String>();  
            for (int i = 0; i < 4; i++){
                String suit = "D";
                if (i == 1){
                   suit = "S";
                } else if (i == 2){
                    suit = "H";
                } else if (i == 3){
                    suit = "C";
                }
                for (int j = 1; j < 14; j++){
                    String card = suit + j;
                    cardArray.add(card);
                }
            }
            Dealer dealer1 = new Dealer(getCard(cardArray), getCard(cardArray));
            Player player1 = new Player(getCard(cardArray), getCard(cardArray));
            System.out.println(player1.playerCards());
            System.out.println("Would you like to hit or stand?");
            String ans = input.next();
            while (ans.equals("hit")){
                player1.addCard(getCard(cardArray));
                if (player1.valueCards > 21){
                    System.out.println("The sum of your hand went over 21! You lost!");
                    System.out.println(dealer1.dealerCards());
                    break;
                } else if (player1.valueCards == 21){
                    System.out.println("The sum of your hand is 21! You won!");
                    System.out.println(dealer1.dealerCards());
                    victories ++;
                    break;
                }
                System.out.println("Would you like to hit or stand?");
                ans = input.next();
            } 
            if (player1.playerValue() < 21 && player1.playerValue() > dealer1.dealerValue()){
                System.out.println("Congrats, you won!");
                System.out.println(dealer1.dealerCards());
                victories ++;
            } else if (player1.playerValue() < dealer1.dealerValue()){
                System.out.println("You lost...");
                System.out.println(dealer1.dealerCards());
            } else if (player1.playerValue() == dealer1.dealerValue()){
                System.out.println("You tied!");
                System.out.println(dealer1.dealerCards());
            }
                
            
            System.out.println("Would you like to keep playing? Y for yes, N for no.");
            String ans2 = input.next();
            if (ans2.equals("Y") || ans2.equals("y")){
                continue;
            } else {
                break;
            }   
        }
        System.out.println("Thank you for playing!");
        System.out.println("You won " + victories + " games!");
    }
}

