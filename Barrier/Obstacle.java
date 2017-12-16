class Obstacle
{

private int xPosition;
private int yPosition;

public Obstacle(){};

public Obstacle(int xPos, int yPos)
{
  xPosition = xPos;
  yPosition = yPos;
}

public int getXPos()
{
  return xPosition;
}

public int getYPos()
{
  return yPosition;
}

public String toString()
{
  return("x: " +xPosition+" y: "+yPosition);
}
}
