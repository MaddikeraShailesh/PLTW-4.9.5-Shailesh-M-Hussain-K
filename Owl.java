// Owl.java
/*
 * Activity 4.9.2
 */
public class Owl extends Animal
{
  public Owl() {
    System.out.println("An owl is being created.");
  }

  public Owl(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Owl parameterized constructor called.");
  }

  @Override
  public void speak() {
    hoot();  // Owl's speak method calls hoot()
  }

  public void hoot() {
    System.out.println("The owl hoots.");
  }
}
