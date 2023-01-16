public class Person
{
  private String name;
  private int age;
  private double height;
  private double weight;
  private String passport;
  private String nationality;
  
  public Person(String name, int age, double height, double weight, String passport, String nationality)
  {
     this.name = name;
     this.age = age;
     this.height = height;
     this.weight = weight;
     this. passport = passport;
     this.nationality = nationality;
  }
  
  public String getName()
  {
    return this.name;
  }
  public int getAge()
  {
    return this.age;
  }
  public double getHeight()
  {
    return this.height;
  }
  public double getWeight()
  {
    return this.weight;
  }
  public String getPassport()
  {
    return this.passport;
  }
  public String getNationality()
  {
    return this.nationality;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  public void setAge(int age)
  {
    this.age = age;
  }
  public void setHeight(double height)
  {
    this.height = height;
  }
  public void setWeight(double weight)
  {
    this.weight = weight;
  }
  public void setPassport(String passport)
  {
    this.passport = passport;
  }
  public void setNationality(String nationality)
  {
    this.nationality = nationality;
  }

}