public class Wall extends Obstacle
{
  private int length;
  private boolean vertical;
  public Wall(int x, int y,int len, boolean vert)
  {
   super(x,y);
   length = len;
   vertical =vert;
  }

  public boolean isBlockedByWall(int xPos, int yPos)
  {
    if(getXPos() == xPos || getYPos() == yPos)
      return true;
    else
      return false;
  }

  public int getLength()
  {
    return length;
  }

  public boolean getDirection()
  {
    return vertical;
  }

  public String toString()
  {
    return("x: "+ getXPos()+" y: "+getYPos()+ " length "+length);
  }
}
