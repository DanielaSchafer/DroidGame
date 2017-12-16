
Wall wall1= new Wall (720,100, 120, true);
Wall wall2=new Wall (720, 220, 120, false);
Wall wall3=new Wall (840, 220, 120, true);
Wall wall4= new Wall (800, 100, 80, true);
Wall wall5=new Wall (800, 140, 120, false);
Wall wall6=new Wall (920, 140, 320, true);
Wall wall7 = new Wall (760, 340, 120, false);
Wall wall8= new Wall (760, 380, 160, true);
Wall wall9 = new Wall (800, 500, 200, false);
Wall wall10= new Wall (840, 420, 200, false);
Wall wall11 = new Wall (960, 500, 160, true);


PhysicalBarrier barrier1= new PhysicalBarrier(760,140);
PhysicalBarrier barrier2 = new PhysicalBarrier(880, 260);
PhysicalBarrier barrier3 = new PhysicalBarrier(1000, 620);
PhysicalBarrier barrier4 = new PhysicalBarrier(800, 420);

Wall[] w = {wall1, wall2, wall3, wall4, wall5, wall6, wall7, wall8, wall9, wall10, wall11};
PhysicalBarrier [] b = {barrier1,barrier2,barrier3};
Maze level1 = new Maze (w,b);


void setup()
{
  size(1050,600);
  background(0);
  drawWalls();
  drawBarriers();
  drawGrid();
}

void drawGrid()
{
  stroke (255,255,255);
  for (int i = 720; i<=1040; i=i+40)
  {
    line(i,100,i,660);
  }
  for (int i = 100; i<680; i=i+40)
  {
    line (720, i, 1040, i);
  }
}

void drawWalls()
{
  Wall[] allWalls = level1.getWalls();
  fill(255,255,255);
  for(int i = 0; i <allWalls.length; i++)
  {
    Wall drawnWall = allWalls[i];
    if (drawnWall.getDirection() == true)
      {
        for (int j = drawnWall.getYPos();  j<drawnWall.getYPos() + drawnWall.getLength(); j=j+40)
        {
          rect( drawnWall.getXPos(), j, 40,40);
        }
      }
      else
      {
      for (int j = drawnWall.getXPos();  j<drawnWall.getXPos() + drawnWall.getLength(); j=j+40)
        {
          rect( j, drawnWall.getYPos(), 40,40);
        }
      }
    }
  }

  void drawBarriers()
  {
    PhysicalBarrier[] allBarriers= level1.getBarriers();
    for(int i = 0; i <allBarriers.length; i++)
    {
     fill(140);
     noStroke();
     rect(allBarriers[i].getXPos()+5, allBarriers[i].getYPos()+5, 30,30);

    }


  }
