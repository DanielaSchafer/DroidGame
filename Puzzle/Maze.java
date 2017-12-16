public class Maze{

private Wall[] walls;
private PhysicalBarrier[] barriers;

public Maze(Wall[] w, PhysicalBarrier[] b)
{
  walls = w;
  barriers = b;
}

public Wall[] getWalls()
{
  return walls;
}

public PhysicalBarrier[] getBarriers()
{
  return barriers;
}
}
