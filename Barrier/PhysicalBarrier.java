public class PhysicalBarrier extends Obstacle
{
  public PhysicalBarrier (int x, int y)
  {
    super(x,y);
  }


  public boolean canGetThroughBarrier(boolean isShot)
  {
    if(isShot)
    return true;
    else
    return false;
  }

  public boolean isInContactWithBarrier(boolean isShot, int xPos, int yPos)
  {
    if(xPos == yPos)
    {
      return true;
    }
    return false;
  }
}
