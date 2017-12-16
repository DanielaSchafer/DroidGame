public class Loop extends Tool()
{
  int [] position;
  whatever look;
  int repeats;//number of times the loop runs
  String commands="";

  public Loop (){
    super();
  }

  public Loop (int xPos; int yPos; int zPos)
  {
    super(xPos; yPos; zPos);
  }

  public void setRepeats (int repeatIn)
  {
    repeats= repeatsIn;
  }

  public void setString(ArrayList<String> commandsIn)
  {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i<commandsIn.size(); i++)
    {
      builder.append(commandsIn.get(i));
    }
    commands = builder.toString();
  }

  public String toString()
  {
    //repeats the string the number of times the loop is supposed to run
    StringBuilder builder = new StringBuilder();
    for (int i = 1; i<=repeats; i++)
    {
      builder.append(commands);
    }
    return builder.toString();
  }



}
