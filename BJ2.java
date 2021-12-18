import java.util.Scanner;
import java.util.ArrayList;



public class BJ2 {
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
    public static String getCard(ArrayList<String> cardList){
        int randomNum = (int)(Math.random() * cardList.size());
        String chosenCard = cardList.get(randomNum);
        cardList.remove(randomNum);
        return chosenCard;
    }

    public static void main(String[] arg){
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
                String card1 = suit + Integer.toString(j);
                Cards card = new Cards(card1);
                
                String output = card.cardName();
               
                cardArray.add(output);
            }
        }
        System.out.println(cardArray);
    }
    
    
    }

}