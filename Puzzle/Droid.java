public class Droid{

int xPosition;
int yPosition;

public Droid(int xPos, int yPos)
{
  xPosition = xPos;
  yPosition = yPos;
}

public void moveXPos(int change)
{
  xPosition = xPosition+change;
}

public void moveYPos(int change)
{
  yPosition = yPosition+change;
}

}
