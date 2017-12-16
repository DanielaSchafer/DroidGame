Wall wall1= new Wall (720,20, 120);
PhysicalBarrier

Wall[] w = {wall1};
Maze level1 = new Maze (w,b);


void setup()
{
  size(1050,600);
  background(0);
  drawWalls();
  drawGrid();


}

void drawGrid()
{
  stroke (255,255,255);
  for (int i = 720; i<=1040; i=i+40)
  {
    line(i,20,i,580);
  }
  for (int i = 20; i<600; i=i+40)
  {
    line (720, i, 1040, i);
  }
}

void drawWalls()//redo to work with wall array instead of individual walls
{
  fill(140);
  for(int i = wall1.getYPos(); i<wall1.getYPos() + wall1.getLength(); i=i+40)
  {
    rect (wall1.getXPos(), i, 40,40);
  }
}
