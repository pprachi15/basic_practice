import java.util.Scanner;
public class quiz
{
  public static void main (String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("******************************* Welcome to the Mathematics IQ test. *******************************");
    System.out.println("Here are the rules: \nYou will be asked 5 Questions, given 3 options per each question. \nEach question is of 4 points.");
    System.out.println("If your score is less than 12, you must take MATH 12 classes. \nOtherwise you are eligible to directly enroll in MATH 100!");
    System.out.println("Please enter your name: ");
    String name = sc.next();
    System.out.println(name + ", please press 's' to start the quiz: ");
    String s = sc.next();
    if(s.equals("s"))
    {
      System.out.println("Question 1: What is the full form of REF?");
      System.out.println("\n1. Reduced Row Echleon Form \n\n2. Row Echleon Form \n\n3. Row Each Farm");
      int option = sc.nextInt();
      int score = 0;
      switch(option)
      {
        case 1:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
        case 2:
        System.out.println("Correct! You get 4 points for this question");
        score = score+4;
        break;
        case 3:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
        
      }
      System.out.println("\nQuestion 2: What is the full form of RREF?");
      System.out.println("\n1. Reduced Row Echleon Form \n\n2. Row Echleon Form \n\n3. Row Each Farm");
      int option1 = sc.nextInt();
      switch(option1)
      {
        case 1:
        System.out.println("Correct! You get 4 points for this question");
        score = score+4;
        break;
        case 2:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
        case 3:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
      }

      System.out.println("\nQuestion 3: What kind of algebra would you learn in MATH 100?");
      System.out.println("\n1. Geomatry \n\n2. Linear \n\n3. Trigonomatry");
      int option2 = sc.nextInt();
      switch(option2)
      {
        case 1:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
        case 2:
        System.out.println("Correct! You get 4 points for this question");
        score = score+4;
        break;
        case 3:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
      }

      System.out.println("\nQuestion 4: What does L.D. stands for?");
      System.out.println("\n1. Line Domestic \n\n2. Linear Dependance \n\n3. Line Dependance");
      int option3 = sc.nextInt();
      switch(option3)
      {
        case 1:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
        case 2:
        System.out.println("Correct! You get 4 points for this question");
        score = score+4;
        break;
        case 3:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
      }
      
      System.out.println("\nQuestion 5: What does L.I. stand for?");
      System.out.println("\n1. Line insane \n\n2. Linear Independance \n\n3. Line Independance");
      int option4 = sc.nextInt();
      switch(option4)
      {
        case 1:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
        case 2:
        System.out.println("Correct! You get 4 points for this question");
        score = score+4;
        break;
        case 3:
        System.out.println("Incorrect! You get 0 points for this question");
        break;
      }

     System.out.println("\n\nYou have comepleted the quiz.");
     System.out.println("Your total score is: " + score);
     if(score>=12)
     {
        System.out.println("Congratulations! "+name+ ", you can now enroll in MATH 100.");
     }
     else
     {
        System.out.println("Sorry! " +name+ ", you still need to brush up your concepts, please take MATH 12 to learn the basics.");
     }

    }
else
    {
        System.out.println("Your choice is invalid, please restart the quiz to see if you are eligible for MATH 100.");   
    }
 }
}