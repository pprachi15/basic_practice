import java.util.Scanner;
public class RockPaperScissor
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Hello! Welcome to the Rock-Paper-Scissor Game! \n Good Luck! ");
    System.out.println("------------------------------------------------");
   
    System.out.println(" Are you ready? Type 'Yes' or 'No': ");
    String type = sc.next();
    if(type.equals("yes"))
    {
    System.out.println(" Please choose one option: ");
    System.out.println(" Roooooocccccckkkkk------Pappppeeeerrrr------Scisssoorrrrr....");
    String choose = sc.next();
    String computerChoice = computerChoice();
     if(choose.equals("rock") || choose.equals("paper") || choose.equals("scissors"))
     {
     System.out.println(" You Choose: " + choose + "\n Computer Choose: " + computerChoice);
     String result = result(choose, computerChoice);
     }
     else
     {
       System.out.println("Your choice is invalid, please restart the game!");
     }
    }
    else
    {
     System.out.println(" No worries! We will play sometime later:)"); 
    }
    sc.close();
  }
    
  
  public static String computerChoice()
  {
     double random = Math.random()*3;
     int integer = (int) random;
     
     switch(integer)
     {
       case 0:
       return "rock";
       case 1:
       return "paper";
       case 2:
       return "scissors";
       default: return "";
     }
  }
  
  public static String result(String choose, String computerChoice)
  {
    String result = "";
    
    if(choose.equals("rock") && computerChoice.equals("scissors"))
    {
      System.out.println("You Win!!!");
    }
    
    else if(choose.equals("rock") && computerChoice.equals("paper"))
    {
      System.out.println("You Lose!!!");
    }
   
    else if(choose.equals("paper") && computerChoice.equals("scissors"))
    {
      System.out.println("You Lose!!!");
    }
    
    else if(choose.equals("paper") && computerChoice.equals("rock"))
    {
      System.out.println("You Win!!!");
    }
    
    else if(choose.equals("scissors") && computerChoice.equals("rock"))
    {
      System.out.println("You Lose!!!");
    }
        
    else if(choose.equals("scissors") && computerChoice.equals("paper"))
    {
      System.out.println("You Win!!!");
    }
    
    else if(choose.equals(computerChoice))
    {
      System.out.println("It's a Tie!!!");
    }
    
    else
    {
      System.out.println("Invalid Option");
    }
    return result;
     
  }

}