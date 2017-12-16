public class Wall extends Obstacle
{

  private int xStart;
  private int yStart;
  private int length;

  public Wall(int xPos, int yPos, int len)
  {
    xStart = xPos;
    yStart = yPos;
    thickness = length;
  }

  public boolean isBlockedByWall(int xPos, int yPos)
  {
    if(xPosition == xPos || yPosition == yPos)
      return true;
    else
      return false;
  }
}
