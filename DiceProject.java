/*
Rules: 
1. User will pick three numbers.
2. User will roll the dice three times.
3. User wins if the sums of numbers picked by user is greater than the sum of numbers appreared when the dice rolled.
4. and the diffrence between the number is less than three.
*/

import java.util.Scanner;

public class DiceProject
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Please choose numbers only between 1 & 6.");
    System.out.println("Choose your 1st number: ");
    int num1 = sc.nextInt();
    System.out.println("Choose your 2nd number: ");
    int num2 = sc.nextInt();
    System.out.println("Choose your 3rd number: ");
    int num3 = sc.nextInt();
    int sum = num1 + num2+ num3;
    System.out.println("The sum of your chosen numbers is: " + sum);
    if (num1 < 1 || num2 < 1 || num3 < 1)
    {
      System.out.println("Sorry you can not choose numbers less than 1. Please choose valid option.");
      System.exit(0);
    }
    else if (num1 > 6 || num2 > 6 || num3 > 6)
    {
     System.out.println("Sorry you can not choose numbers greater than 6. Please choose valid option."); 
     System.exit(0);
    }
    
    sc.close();
    
    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();
    
    System.out.println("\nFirst random number: \n" + roll1);
    System.out.println("Second random number: \n" + roll2);
    System.out.println("Third random number: \n" + roll3);
    int sum1 = roll1 + roll2 + roll3;
    System.out.println("The sum of random numbers by Dice is: " + sum1);
    
    if(sum > sum1 && (sum - sum1) < 3)
    {
     System.out.println("Congratulations! You Won!");
    }
    else
    {
      System.out.println("Sorry! You Lose!");
    }
  }
  
  public static int rollDice()
  {
     double randomNumber = Math.random()*6;
     randomNumber += 1;
     return (int)randomNumber;
  }
  
  }