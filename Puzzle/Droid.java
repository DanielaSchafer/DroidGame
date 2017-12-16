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

}
