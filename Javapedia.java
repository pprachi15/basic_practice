import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int figure = scan.nextInt();         
        String[][] array = new String[figure][3];
        scan.nextLine();
         for (int i=0; i < array.length; i++) {

            System.out.println("\n\tFigure " + (i+1)); 
            System.out.print("\t - Name: ");
            array[i][0] = scan.next();
            System.out.print("\t - Date of birth: ");
            array[i][1] = scan.next();
            System.out.print("\t - Occupation: ");
            array[i][2] = scan.next();
            System.out.print("\n");
        }
        
        
        System.out.println("These are the values you stored:"); 
        print2DArray(array); 

        System.out.print("\nWho do you want information on? ");
        String name = scan.next();
        for(int i = 0; i<array.length; i++)
        {
        if(array[i][0].equals(name))
        {
         System.out.println("\tName: " + array[i][0]);
         System.out.println("\tDate of birth: " + array[i][1]);
         System.out.println("\tOccupation: " + array[i][2]);
        }
        }
        else{
        System.out.println("No-one in the system");
        }

        
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        scan.close();
    }

     public static void print2DArray(String[][]array)
     {
       for(int i = 0; i<array.length; i++)
       {
         System.out.println("\t");
         for(int j=0; j< array[i].length; j++)
         {
         System.out.println(array[i][j]+ " ");
         }
       }
       System.out.println("\n");
     }

}
