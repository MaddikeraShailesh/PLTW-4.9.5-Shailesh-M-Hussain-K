// ZooKeeperRunner.java
/*
 * Activity 4.9.2
 */
import java.util.ArrayList;

public class ZooKeeperRunner
{
  public static void main(String[] args)
  {
    // Create ArrayList to store animals
    ArrayList<Animal> zoo = new ArrayList<>();
    
    // Implicit Constructors and add to zoo
    Elephant elephant = new Elephant();
    zoo.add(elephant);
    
    Tiger tiger = new Tiger();
    zoo.add(tiger);
    
    Gorilla gorilla = new Gorilla();
    zoo.add(gorilla);
    
    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    zoo.add(giraffe);
    
    Hippo hippo = new Hippo();
    zoo.add(hippo);
    
    Penguin penguin = new Penguin();
    zoo.add(penguin);
    
    Owl owl = new Owl();
    zoo.add(owl);
    
    // Iterate through each animal in the zoo and call the speak method
    for (Animal animal : zoo) {
      hearTheAnimal(animal);
    }
    
    // Additional explicit constructor calls
    Elephant elephant2 = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant2.trumpet();
    elephant2.eat();
    elephant2.isNocturnal();
    elephant2.getLifeSpan();
    System.out.println();

    Tiger tiger2 = new Tiger("meat", true, 17.0);
    tiger2.swim();
    tiger2.huntAlone();
    tiger2.eat();
    tiger2.isNocturnal();
    tiger2.getLifeSpan();
    System.out.println();

    Tiger tiger3 = new Tiger();
    Elephant elephant3 = new Elephant();
    System.out.println();
  }

  // Method to hear the animal's sound
  public static void hearTheAnimal(Animal currentAnimal)
  {
    currentAnimal.speak();  // Call the speak method of each Animal
  }
}
