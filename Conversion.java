public class Conversion {
    public static void main(String[] args) {
        double day = 33;          //temperature at noon in fahrenheit.
        double eve = 46;       //temperature during the evening in fahrenheit
        double night = 88;      //temperature at midnight in fahrenheit 
        
        printTemperatures(day);
        printTemperatures(eve);
        printTemperatures(night);
    }
    
    public static double fahrenheitToCelsius(double fahrenheit)
    {
      return (fahrenheit-32)*5/9;
    }

    public static void printTemperatures(double fahrenheit)
    {
       System.out.println("The temprature of the day in fahrenheit is " +fahrenheit+ " and in celcius is " + fahrenheitToCelsius(fahrenheit) );
    }
    
 }
   
   
   