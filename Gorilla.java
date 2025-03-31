// Gorilla.java
/*
 * Activity 4.9.2
 */
public class Gorilla extends Animal
{
  public Gorilla() {
    System.out.println("A gorilla is being created.");
  }

  @Override
  public void speak() {
    grunt();  // Gorilla's speak method calls grunt()
  }

  public void grunt() {
    System.out.println("The gorilla grunts.");
  }
}
