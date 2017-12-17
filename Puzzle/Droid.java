public class Droid{

private int xPosition;
private int yPosition;
private Direction d;

public Droid(int xPos, int yPos, Direction dir)
{
  xPosition = xPos;
  yPosition = yPos;
  d = dir;
}

public int getDroidX()
{
  return xPosition;
}
public int getDroidY()
{
  return (yPosition);
}
public void moveXPos(int change)
{
  xPosition = xPosition+change;
}

public void changeDirection(Direction dir)
{
  d = dir;
}

public Direction getDirection()
{
  return d;
}

public void moveYPos(int change)
{
  yPosition = yPosition+change;
}

public void setPosition(int x, int y)
{
  xPosition = x;
  yPosition =y;
}

public boolean isFacingIntoWall(Wall[] walls){
  int[] newpoint = {xPosition, yPosition};
  if(d.equals(Direction.NORTH))
    newpoint[1] -= 40;
  else if(d.equals(Direction.SOUTH))
    newpoint[1] +=40;
  else if(d.equals(Direction.EAST))
    newpoint[0] += 40;
  else if(d.equals(Direction.WEST))
    newpoint[0] -=40;

  for(int i=0; i<walls.length; i++){
    int[] corner = new int[2];
    if(!walls[i].getDirection()){
      corner[0] = walls[i].getXPos()+walls[i].getLength();
      corner[1] = walls[i].getYPos()+40;
    }
    else{
      corner[0] = walls[i].getXPos()+40;
      corner[1] = walls[i].getYPos()+walls[i].getLength();
    }
    if((newpoint[0]>walls[i].getXPos())&&(newpoint[0]<corner[0])&&(newpoint[1]>walls[i].getYPos())&&(newpoint[1]<corner[1]))
    {
      println(true);
      return true;
    }
  }
  println(false);
  return false;
}

public boolean checkIfSuccess()//at the end of the game, call this method to see if you succeeded
{
  if(xPosition==1020 && yPosition == 640)
  {
    return true;
  }
  else
  {
    return false;
  }

}

}
