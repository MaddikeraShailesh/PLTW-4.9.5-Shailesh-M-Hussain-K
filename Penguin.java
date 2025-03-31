// Penguin.java
/*
 * Activity 4.9.2
 */
public class Penguin extends Animal
{
  public Penguin() {
    System.out.println("A penguin is being created.");
  }

  @Override
  public void speak() {
    chirp();  // Penguin's speak method calls chirp()
  }

  public void chirp() {
    System.out.println("The penguin chirps.");
  }
}
