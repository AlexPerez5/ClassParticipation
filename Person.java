public class Person{
  //objects have both attributes (properties) & methods (behaviors)
  //Class is a blueprint for objects

  //attributes--AKA variables
  private String name;
  private String email;
  private String phoneNumber;

  //constructor to assign values to my variables
  public Person(String personName, String personEmail, String personNumber)
  {
    name = personName;
    email = personEmail;
    phoneNumber = personNumber;
  }

  //method named print
  public void print()
  {
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
    System.out.println("Phone Number: " + phoneNumber);
  }
}