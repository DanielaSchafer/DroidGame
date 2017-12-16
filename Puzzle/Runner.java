
public class Runner
{

  Droid droid = new Droid(50, 50, Direction.NORTH);



  //array to hold the commands
  //change positon of the droid based on the commands

//Takes in a tool and changes position/direction of the droid
  public void parseTool(Tools currTool) {
    if (currTool == Tools.tHOME) {
      droid.setPosition(20, 20);
      droid.changeDirection(Direction.SOUTH);
    } else if (currTool == Tools.tFORWARD) {
      if (droid.getDirection()==Direction.EAST)
        droid.moveXPos(40);
      else if (droid.getDirection()==Direction.NORTH)
        droid.moveYPos(-40);
      else if (droid.getDirection()==Direction.SOUTH)
        droid.moveYPos(40);
      else if (droid.getDirection()==Direction.WEST)
        droid.moveXPos(-40);
    } else if (currTool == Tools.tLEFT) {
      if (droid.getDirection()==Direction.EAST)
        droid.changeDirection(Direction.NORTH);
      else if (droid.getDirection()==Direction.NORTH)
        droid.changeDirection(Direction.WEST);
      else if (droid.getDirection()==Direction.SOUTH)
        droid.changeDirection(Direction.EAST);
      else if (droid.getDirection()==Direction.WEST)
        droid.changeDirection(Direction.SOUTH);
    } else if (currTool == Tools.tRIGHT) {
      if (droid.getDirection()==Direction.EAST)
        droid.changeDirection(Direction.SOUTH);
      else if (droid.getDirection()==Direction.NORTH)
        droid.changeDirection(Direction.EAST);
      else if (droid.getDirection()==Direction.SOUTH)
        droid.changeDirection(Direction.WEST);
      else if (droid.getDirection()==Direction.WEST)
        droid.changeDirection(Direction.NORTH);
    }
  }

//takes in an arraylist of tools and changes direction/position of droid
  public void parseFull(ArrayList<Tools> t)
  {
    for (int i = 0; i<t.size(); i++) {
      if (t.get(i) == Tools.tLOOP) {
        parseTool(t.get(i+1));
        i++;
      } else
        parseTool(t.get(i));
    }
  }
}
