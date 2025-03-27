/*
 * Activity 4.9.5
 */
public class Boot extends LakeObject
{

    public Boot() {
        super();
        setCost(0); // Boots are free
    }

     @Override
    public boolean wasCaught(Hook h) {
        return true; // Always caught
    }

     @Override
    public String say() {
        return "You caught a boot!";
    }

}