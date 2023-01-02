import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        String type = scan.next();
        int card1 = drawRandomCard();
        int card2 = drawRandomCard();
        System.out.println(card1);
        System.out.println(card2);
        System.out.println("You get a \n" + cardString(card1) + " \nand a \n" + cardString(card2));
        int total = Math.min(card1, 10)+ Math.min(card2, 10);
        System.out.println("Your Total is: " + total);
      
        int card3 = drawRandomCard();
        int card4 = drawRandomCard(); 
        System.out.println(card3);
        System.out.println(card4);
        int total1 = Math.min(card3, 10) + Math.min(card4, 10);
        System.out.println("\nThe dealer has \n" + cardString(card3) + " \nand a \n" + faceDown());
        System.out.println("the dealer's total is hidden");

        while(true)
        {
          String option1 = hitOrStay();
          if(option1.equals("stay"))
          {
            break;
          }
          int newCard = drawRandomCard();
          total += Math.min(newCard, 10);
          System.out.println("\nYou get a \n" + cardString(newCard));
          System.out.println("Your Updated total value is: " + total);
          
          if(total > 21)
          {
            System.out.println("You lose!");
            System.exit(0);
          }
         
        }
        
        
       System.out.println("It's dealer's turn!");
       System.out.println("The dealer's card are \n" + cardString(card3) + "\nand \n" + cardString(card4));
       
       while(total1 < 18)
       {
         int newCard =  drawRandomCard();
         total1 += Math.min(newCard, 10);
         System.out.println("Dealer gets a \n" + cardString(newCard));
         System.out.println("Dealer's total is " + total1);
       }
        
         if(total1 > 25)
         {
           System.out.println("Dealer Loses!");
           System.exit(0);
         }
         
         if(total > total1)
         {
           System.out.println("PLayer wins! Dealer Loses!");

         }
         else
         {
           System.out.println("Dealer wins! player loses!");

         }

       scan.close();
    }

    public static int drawRandomCard()
    {
       int random = (int)((Math.random()*13)+1);
       return random;
    }
        
    public static String cardString(int cardNumber)
    {
      switch(cardNumber)
      {
        case 1:
         return    "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";

        
        case 2:
         return     "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n"; 
        case 3:
         return   "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";
        case 4:
         return    "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
        
        case 5:
         return     "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";         
        
        case 6:
         return     "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";         
        
        case 7:
         return     "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

        case 8:
         return     "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
         
        case 9:
         return     "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
         
        case 10:
         return     "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";

        
        case 11:
         return     "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
        
        case 12:
         return     "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
        
        case 13:
         return     "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";

        default: return "Invalid option";        
      }
    }
    
    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
     public static String hitOrStay()
        {
          System.out.println("Do you want to Hit or Stay?");
          String response =  scan.next();
          while(!(response.equalsIgnoreCase("hit")||response.equalsIgnoreCase("stay")))
          {
           System.out.println("Please write hit or stay: ");
           response = scan.next();
          }
          return response;
        }
     }

