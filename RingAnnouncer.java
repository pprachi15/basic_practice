public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int win = 0;
        int lose = 0;
        for(int i=0; i<record.length; i++)
        {
            if (record[i].equals("WIN"))
            {
                win++;
            }
            else if(record[i].equals("LOSS"))
            {
                lose++;
            }
            else
            {
                System.out.println("nothing happens");
            }

        }
        System.out.println("\nWith a professional record of " + win + " wins and " +lose+ " losses");
        System.out.println("He is the pride of oracle: Java Fury!");  

    }
}
