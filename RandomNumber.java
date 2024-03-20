public class RandomNumber {
    public static void main(String[] args) {
        int[][] array = new int[100][10];
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array[i].length; j++)
            {
              array[i][j] = randomNumbers();
            }
        }
        print2DArray(array);

        
    }
    public static int randomNumbers() {
        int number = (int)((Math.random())*99)+1;
        return number; 
    }

    public static void print2DArray(int[][] array) {
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        
    }
}
