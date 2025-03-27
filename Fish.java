/*
 * Activity 4.9.5
 */
public class Fish extends LakeObject
{
    @Override
    public int getCost() {
        return super.getWeight() * super.getCost();  // Price per pound
    }

     @Override
    public String say() {
        return "You caught a fish!";
    }
}