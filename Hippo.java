// Hippo.java
/*
 * Activity 4.9.2
 */
public class Hippo extends Animal
{
  public Hippo() {
    System.out.println("A hippo is being created.");
  }

  @Override
  public void speak() {
    grunt();  // Hippo's speak method calls grunt()
  }

  public void grunt() {
    System.out.println("The hippo grunts.");
  }
}
