//hello
public class Runner
{

  private Droid droid;
  private int startX;
  private int startY;

  public Runner(Droid d, int x, int y) {
    droid = d;
    startX = x;
    startY = y;
  }


  //array to hold the commands
  //change positon of the droid based on the commands

  //Takes in a tool and changes position/direction of the droid
  public void parseTool(Tools currTool) {
    if (currTool == Tools.tHOME) {
      droid.setPosition(startX, startY);
      droid.changeDirection(Direction.NORTH);
    } else if (currTool == Tools.tFORWARD) {
      println("forward");
      if (droid.getDirection()==Direction.EAST && droid.isFacingIntoWall(w) == false)
        droid.moveXPos(40);
      else if (droid.getDirection()==Direction.NORTH && droid.isFacingIntoWall(w) == false)
        droid.moveYPos(-40);
      else if (droid.getDirection()==Direction.SOUTH && droid.isFacingIntoWall(w) == false)
        droid.moveYPos(40);
      else if (droid.getDirection()==Direction.WEST && droid.isFacingIntoWall(w) == false)
        droid.moveXPos(-40);
      else if (droid.isFacingIntoWall(w))
      {
        resetGame();
        ranIntoWallErrorText();
        return;
      }
      redrawDroid(droid);
    } else if (currTool == Tools.tLEFT) {
      println("left");
      if (droid.getDirection()==Direction.EAST)
        droid.changeDirection(Direction.NORTH);
      else if (droid.getDirection()==Direction.NORTH)
        droid.changeDirection(Direction.WEST);
      else if (droid.getDirection()==Direction.SOUTH)
        droid.changeDirection(Direction.EAST);
      else if (droid.getDirection()==Direction.WEST)
        droid.changeDirection(Direction.SOUTH);
      redrawDroid(droid);
    } else if (currTool == Tools.tRIGHT) {
      println("Right");
      if (droid.getDirection()==Direction.EAST)
        droid.changeDirection(Direction.SOUTH);
      else if (droid.getDirection()==Direction.NORTH)
        droid.changeDirection(Direction.EAST);
      else if (droid.getDirection()==Direction.SOUTH)
        droid.changeDirection(Direction.WEST);
      else if (droid.getDirection()==Direction.WEST)
        droid.changeDirection(Direction.NORTH);
      redrawDroid(droid);
    }
  }

  void resetGame()
  {
    droid.setPosition(startX, startY);
    droid.changeDirection(Direction.NORTH);
    reset();
    redrawDroid(droid);
  }

  //takes in an arraylist of tools and changes direction/position of droid
  public void parseFull(ArrayList<Tools> t, ArrayList<Integer> loops)
  {
    int loopIndex = 0;
    for (int i = 0; i<t.size(); i++) {
      if (t.get(i) == Tools.tLOOP) {
        if (loops.size()>0) {
          for (int j = 0; j<loops.get(loopIndex); j++) {
            if ((i+1)>t.size()-1) {
              resetGame();
              noStroke();
              loopErrorText();
              return;
            }
            parseTool(t.get(i+1));
            if (loops.size() == 0)
              return;
          }
          loopIndex++;
        }
        i++;
      } else
        parseTool(t.get(i));
    }
  }
}
