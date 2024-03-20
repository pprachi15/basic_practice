import java.util.Scanner;
import java.util.Arrays;
public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**  Task 1: 
         *   1. Ask the user: How many pizza toppings do you want?. 
         *   2. Then, pick up the result using Scanner.
         */
         
        System.out.println("How many pizza toppings do you want?");
        int topping = scan.nextInt();
        System.out.println("Great please enter your topping here: ");
        String[] toppings = new String[topping];
        for(int i =0; i<topping; i++)
        {
          toppings[i] = scan.next();
        }
        //String[] array = new String[toppings.length];
        System.out.print("you chose:" + Arrays.toString(toppings) + ", ");
        System.out.print("Correct? ");
        String type = scan.next();
        System.out.println("\nGreat, Your order is confirmed! \nyou will be enjoying your pizza in no time:)");


        
        // Task 2 – Create the array here

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.   
         * 
         */

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *  
         *  See the workbook article for more detail  
         * 
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *  
         *  See the workbook article for more detail   
         * 
         */

        /** Task 6 –  Confirm the order
         *  
         *  See the workbook article for more detail  
         * 
         */

        scan.close();


         
    }
}
