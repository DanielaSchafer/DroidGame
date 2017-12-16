public class Runner
{
  private Tools t;

//array to hold the commands
//change positon of the droid based on the commands



public static parseTool(ArrayList<Tool> tools)
{
  for(int i = 0; i<tools.size(); i++)
  {
  switch(t)
  		{
  		case HOME:
        droid.setPosition(20, 20);
        direction = SOUTH;

      case FORWARD:
        if(getDirection=EAST)
          droid.moveXPos(40);
        else if(getDirection=NORTH)
          droid.moveYPos(-40);
        else if(getDirection=SOUTH)
          droid.moveYPos(40);
        else if(getDirection=WEST)
          droid.moveXPos(-40);

      case LEFT:
        if(getDirection=EAST)
          direction = NORTH;
        else if(getDirection=NORTH)
          direction = WEST;
        else if(getDirection=SOUTH)
          direction = EAST;
        else if(getDirection=WEST)
          direction = SOUTH;

      case RIGHT:
       if(getDirection=EAST)
         direction = SOUTH;
       else if(getDirection=NORTH)
         direction = EAST;
       else if(getDirection=SOUTH)
         direction = WEST;
       else if(getDirection=WEST)
         direction = NORTH;

      case LOOP:
        parseTool(tools.get(i+1));
        parseTool(tools.get(i+1));
      }
  }
}
