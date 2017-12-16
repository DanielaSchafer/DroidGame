public class Wall extends Obstacle
{
  private int length;

  public Wall(){}

  public Wall(int xPos, int yPos, int len)
  {
    super();
    thickness = length;
  }

  public boolean isBlockedByWall(int xPos, int yPos)
  {
    if(xPosition == xPos || yPosition == yPos)
      return true;
    else
      return false;
  }

  public int getLength()
  {
    return length;
  }

  pubilc String toString()
  {
    return("x: "+ xPosition+" y: "+yPosition+ " length "+length);
  }
}
