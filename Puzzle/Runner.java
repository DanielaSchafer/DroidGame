
public class Runner
{
<<<<<<< HEAD

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
=======
  private Tools t;

//array to hold the commands
//change positon of the droid based on the commands

public static parseTool(Tools currTool){
    case HOME:
      droid.setPosition(20, 20);
      droid.changeDirection(SOUTH);

    case FORWARD:
      if(droid.getDirection==EAST)
        droid.moveXPos(40);
      else if(droid.getDirection==NORTH)
        droid.moveYPos(-40);
      else if(droid.getDirection==SOUTH)
        droid.moveYPos(40);
      else if(droid.getDirection==WEST)
        droid.moveXPos(-40);

    case LEFT:
      if(droid.getDirection==EAST)
        droid.changeDirection(NORTH);
      else if(droid.getDirection==NORTH)
        droid.changeDirection(WEST);
      else if(droid.getDirection==SOUTH)
        droid.changeDirection(EAST);
      else if(droid.getDirection==WEST)
        droid.changeDirection(SOUTH);

    case RIGHT:
      if(droid.getDirection==EAST)
        droid.changeDirection(SOUTH);
      else if(droid.getDirection==NORTH)
        droid.changeDirection(EAST);
      else if(droid.getDirection==SOUTH)
        droid.changeDirection(WEST);
      else if(droid.getDirection==WEST)
        droid.changeDirection(NORTH);
    }
}
public static parseFull(ArrayList<Tool> tools)
{
  int i=0;
    switch(t){
      case LOOP:
        parseTool(tools.get(i+1));
        i++;

      default:
        parseTool(t);
        i++;
      }
>>>>>>> e9ab6e0f0b589f260b885d1e6f59417ba3d221eb
  }
}
