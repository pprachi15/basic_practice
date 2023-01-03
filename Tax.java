import java.util.Arrays;
public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[10];
        
        for(int i=0; i<price.length; i++)
        {
          afterTax[i] = price[i]*1.13;
        }
        
        System.out.println("The original prices for the items are: " + Arrays.toString(price));
        System.out.println("The After Tax prices for the items are: " + Arrays.toString(afterTax));
        /** Task 1: 
         * 
         *  Create a new array afterTax with the same length as price
         * 
         */

         /** Task 2:
          * 
          *  Update each element in afterTax to be: price + 13% * price.
          *
          */

         /** Task 3:
          * 
          * Print the following messages:
          *     The original prices are: <original prices>
          *     The prices after tax are: <after tax prices>
          *
          */

    }
}