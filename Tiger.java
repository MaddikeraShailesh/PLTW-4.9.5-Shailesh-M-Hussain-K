// Tiger.java
/*
 * Activity 4.9.2
 */
public class Tiger extends Animal
{
  public Tiger() {
    System.out.println("A tiger is being created.");
  }

  public Tiger(String food, boolean nocturnal, double aveLifeSpan) {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Tiger parameterized constructor called.");
  }

  public void swim() {
    System.out.println("The tiger swims.");
  }

  public void huntAlone() {
    System.out.println("The tiger hunts alone.");
  }

  public void roar() {
    System.out.println("The tiger roars!");
  }

  public void growl() {
    System.out.println("The tiger growls.");
  }

  @Override
  public void speak() {
    roar();  // Tiger's speak method calls roar()
  }
}
