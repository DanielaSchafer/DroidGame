//hello
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
      println("forward");
      if (droid.getDirection()==Direction.EAST)
        droid.moveXPos(40);
      else if (droid.getDirection()==Direction.NORTH)
        droid.moveYPos(-40);
      else if (droid.getDirection()==Direction.SOUTH)
        droid.moveYPos(40);
      else if (droid.getDirection()==Direction.WEST)
        droid.moveXPos(-40);
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
    }
  }

//takes in an arraylist of tools and changes direction/position of droid
  public void parseFull(ArrayList<Tools> t, ArrayList<Integer> loops)
  {
    int loopIndex = 0;
    for (int i = 0; i<t.size(); i++) {
      if (t.get(i) == Tools.tLOOP) {
        if(loops.size()>0){
        for(int j = 1; j<loops.get(loopIndex); j++){
          parseTool(t.get(i+1));
        }
        loopIndex++;}
        i++;
      } else
        parseTool(t.get(i));
    }
}
}
