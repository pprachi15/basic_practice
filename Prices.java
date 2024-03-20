import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        double[][] array1 = {
            {12.99, 8.99, 9.99, 10.49, 11.99}+
            {0.99, 1.99, 2.49, 1.49, 2.99 }+
            {8.99, 7.99, 9.49, 9.99, 10.99}
        }
        
        System.out.println("Baking: " + Arrays.toString(array1[0]) + "Beverages: " + Arrays.toString(array1[1]) + "Cereals: " + Arrays.toString(array1[2])); 
    }
}