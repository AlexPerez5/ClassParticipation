class Main {
  public static void main(String[] args) {
    //Let's work with classes, methods, & instance variables!!
    //Please open a new Repl to follow along

    //create person1 object from the Person class
    //person1 object has access to whatever my Person class has access to
    Person person1 = new Person("Alex", "alexander.perez@patelhs.org", "813-333-333");
    //create person2 object from the Person class
    //person2 object has access to whatever my Person class has access to
    Person person2 = new Person("Julian", "julian@patelhs.org", "813-888-8888");

    person1.print();
    person2.print();
  }
}