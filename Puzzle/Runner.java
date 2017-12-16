public class Runner
{
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
  }
}
