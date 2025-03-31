// Giraffe.java
/*
 * Activity 4.9.2
 */
public class Giraffe extends Animal
{
  public Giraffe(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Giraffe parameterized constructor called.");
  }

  public void hum() {
    System.out.println("The giraffe hums.");
  }

  @Override
  public void speak() {
    hum();  // Giraffe's speak method calls hum()
  }
}
