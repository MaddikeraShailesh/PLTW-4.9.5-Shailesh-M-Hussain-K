/**
 * Activity 4.9.4
 */
public class Hook extends LakeObject
{
  private int strength;

  public Hook()
  {
      super();
      strength = 55;
      setCost(15);
  }

  /*---------- accessor ----------*/
  public int getStrength()
  {
    return strength;
  }

    @Override
    public String say() {
        return "You now have a hook!";
    }
}