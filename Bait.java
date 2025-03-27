/*
 * Activity 4.9.5
 */
public class Bait extends LakeObject
{
    public Bait() {
        super();
        setCost(10); // Set bait cost to 10
    }

     @Override
    public String say() {
        return "You now have bait!";
    }
}