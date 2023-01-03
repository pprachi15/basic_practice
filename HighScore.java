public class HighScore {
    public static void main(String[] args) {
         int highScore = 0;
         int[] random = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),};
         for(int i=0; i<random.length; i++)
         {
          System.out.print(random[i] + "  ");
          if(random[i]>highScore)
          {
            highScore = random[i];
          }
         
         }
         System.out.println("\nThe highest score is: " + highScore);
       
    }
    
    public static int randomNumber()
    {
       int num = (int) (Math.random()*50000);
       return num;
    }
   }
