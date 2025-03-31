// Elephant.java
/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
  public Elephant() {
    System.out.println("An elephant is being created.");
  }

  public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Elephant parameterized constructor called.");
  }

  public void trumpet() {
    System.out.println("The elephant trumpets!");
  }

  @Override
  public void speak() {
    trumpet();  // Elephant's speak method calls trumpet()
  }
}
