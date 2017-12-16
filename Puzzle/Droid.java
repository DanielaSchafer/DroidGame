public class Droid{

private int xPosition;
private int yPosition;
private Direction d;

public Droid(int xPos, int yPos)
{
  xPosition = xPos;
  yPosition = yPos;
  d = Direction.EAST;
}

public void moveXPos(int change)
{
  xPosition = xPosition+change;
}

public void changeDirection(Direction dir)
{
  d = Direction.dir;
}

public Direction getDirection()
{
  return d;
}

public void moveYPos(int change)
{
  yPosition = yPosition+change;
}

public void setDirection

}
