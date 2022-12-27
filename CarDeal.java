import java.util.Scanner;
public class CarDeal
{
  public static void main (String[] args)
  {
     
     System.out.println("************************* Welcome to java dealership! *************************");
     dealing();
  }
  
  public static void dealing()
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose option 'A' to buy a car.");
    System.out.println("Choose option 'B' to sell a car.");
    String option =  sc.next();
    switch(option)
    {
      case "A": 
      System.out.println("Do you have a license? Type'Y' for yes and 'N' for no.");
      String choose =  sc.next();
      System.out.println("What is your credit score?");
      int score = sc.nextInt();
      System.out.println("Do you have an insurance? Type'Y' for yes and 'N' for no.");
      String insurance =  sc.next();
      if(choose.equals("Y") && score > 700 && insurance.equals("Y"))
      {
        System.out.println("Congratulations! you are eligible to buy a car.");
        System.out.println("\nWhich car woud you like to buy?");
        System.out.println("\nPlease select a valid option: ");
        System.out.println("\nOption 1: Honda $20,000 \n\nOption 2: Toyota $25,000 \n\nOption 3: Dodge $40,000");
        String chooseCar = sc.next();
        switch(chooseCar)
        {
        case "1":
        System.out.println("\nOOH!! Honda is a Cool Choice, would you like to pay with check or card?");
        break;
        case "2": 
        System.out.println("\nOOhhH!! Toyota is an awesome Choice, would you like to pay with check or card?");
        break;
        case "3": 
        System.out.println("\nOOooOOoo!! Dodge is a sexy Choice, would you like to pay with check or card?");
        break;
        }
        String payment = sc.next();
        System.out.println("How much amount do you have in your Bank?");
        int number = sc.nextInt();
        if(payment.equals("Card") && number > 20000)
        {
          System.out.println("PLease enter your card number: ");
          long num = sc.nextLong();
          System.out.println("PLease enter your card expiry date: ");
          int num1 = sc.nextInt();
          System.out.println("PLease enter your card CVV code: ");
          int num2 = sc.nextInt();
          System.out.println("Thank you for your payment. Your car will Arrive within 5 business days! ");
        }
        else if(payment.equals("Check")&& number > 20000)
        {
          System.out.println("We have booked your car");
          System.out.println("Please mail the check to the following mailing address: ");
          System.out.println("2022 Cadillac Drive, Sacramento, CA, 95825");
          System.out.println("You will receive your car within 5-business days when the payment is received!");
        }
        else
        {
          System.out.println("Sorry! your funds are not enough to buy thi car right now!");
        }
        
      }
      else
      {
       System.out.println("Sorry! you are not eligible to buy a car.");
      }
      break;
      
      case "B":
      System.out.println("Does the car has an accident history? Type'Y' for yes and 'N' for no.");
      String choice =  sc.next();
      System.out.println("What is car's mileage?");
      int mileage = sc.nextInt();
      System.out.println("Do you have an insurance? Type'Y' for yes and 'N' for no.");
      String insurances =  sc.next();
      System.out.println("How old is the car?");
      int old = sc.nextInt();
      System.out.println("How much money would you demand for this car?");
      int money = sc.nextInt();
      if(choice.equals("N") && mileage < 7000 && insurances.equals("Y") && old < 10 && money < 50000)
      {
       System.out.println("Congratulations! you are eligible to sell a car.");
       System.out.println("\nWe will list your car on our website. \n\nYour address will be used by our employee who will come and pick your car. \n\nThe check will be mailed to the same mailing address \n\nPlease enter your mailing address below: ");
       String address =  sc.next();
       System.out.println("\nPlease allow 5 business days to our agents to pick your car.");
       System.out.println("Thank you so much for doing business with us. \nHave a great day!");
      }
      else
      System.out.println("Sorry! We won't be able to sell your car on our website.");
      break;
    }
  }    
}