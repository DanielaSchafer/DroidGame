public class Runner
{
  private Tools t;

//array to hold the commands
//change positon of the droid based on the commands

public static parseTool(Tools currTool){
  switch(t){
    case HOME:
      droid.setPosition(20, 20);
      droid.changeDirection(SOUTH);
    i++;

    case FORWARD:
      if(droid.getDirection==EAST)
        droid.moveXPos(40);
      else if(droid.getDirection==NORTH)
        droid.moveYPos(-40);
      else if(droid.getDirection==SOUTH)
        droid.moveYPos(40);
      else if(droid.getDirection==WEST)
        droid.moveXPos(-40);
      i++;

    case LEFT:
      if(droid.getDirection==EAST)
        droid.changeDirection(NORTH);
      else if(droid.getDirection==NORTH)
        droid.changeDirection(WEST);
      else if(droid.getDirection==SOUTH)
        droid.changeDirection(EAST);
      else if(droid.getDirection==WEST)
        droid.changeDirection(SOUTH);
      i++;

    case RIGHT:
      if(droid.getDirection==EAST)
        droid.changeDirection(SOUTH);
      else if(droid.getDirection==NORTH)
        droid.changeDirection(EAST);
      else if(droid.getDirection==SOUTH)
        droid.changeDirection(WEST);
      else if(droid.getDirection==WEST)
        droid.changeDirection(NORTH);
      i++;
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

      }
  }
}
