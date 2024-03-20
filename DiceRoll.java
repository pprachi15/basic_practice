import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
      int dice1 = rollDice();
      Scanner scan = new Scanner(System.in);
      System.out.println("Let's play Rolling Java. Type anything to start.");
      String anything = scan.nextLine();
      System.out.println("Great, here are the rules:\n- If you roll a 6 the game stops.\n- If you roll a 4 nothing happens.\n- When your chosen value and dice's random value eqauls, you earn 2 points.\nYou must collect at least 6 points to win. \nEnter anything to roll:");
      String anything1 = scan.nextLine(); 

       int score = 0;
       while(true)
       {
         System.out.println("Please Enter a random value between 1-6: ");
         int value = scan.nextInt();
         dice1 = rollDice();
         System.out.println("the dice's value is: " + dice1);
         if(value == dice1)
         {
           System.out.println("You number and dice's number match");
           score += 2;
         }
         else if(value == 6)
         {
          System.out.println("The game ends here. see you next time!");
          break;
         }
         else if(value == 4)
         {
          System.out.println("No points assigned! roll again.");
         }
         else
         {
           score ++;
         }

       }
       System.out.println("Your total score is: " + score);
       
       if(score >= 6)
       {
        System.out.println("You Win!");
       }
       else{
        System.out.println("You Lose!");
       }
        
    }
  public static int rollDice() 
  {
    int randomNumber = (int) ((Math.random()*6)+1);
    return randomNumber;  
  } 
  
  
}
