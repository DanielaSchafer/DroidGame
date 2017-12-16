public class Wall extends Obstacle
{
  private int length;
  public Wall(int x, int y,int len)
  {
   super(x,y);
   length = len;
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

  public String toString()
  {
    return("x: "+ getXPos()+" y: "+getYPos()+ " length "+length);
  }
}
