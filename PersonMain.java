public class PersonMain
{
  public static void main(String[] args)
  {
    Person num1 = new Person("Eva", 20, 5.5, 140.5, "ABCD123", "Indian");
    Person num2 = new Person("Eddy", 21, 6.0, 155.5, "ABCD333", "Indian");
    num2.setPassport("ABCD321");
    
    System.out.println("Name: " + num1.getName() + "\nAge: " + num1.getAge() + "\nHeight: " + num1.getHeight() + "\nWeight: " + num1.getWeight() + "\nPassport Number: " + num1.getPassport() + "\nNationality: " + num1.getNationality());
    System.out.println("\n\nName: " + num2.getName() + "\nAge: " + num2.getAge() + "\nHeight: " + num2.getHeight() + "\nWeight: " + num2.getWeight() + "\nPassport Number: " + num2.getPassport() + "\nNationality: " + num2.getNationality());
  }
}