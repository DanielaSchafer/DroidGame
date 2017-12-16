ArrayList<Tools> list = new ArrayList<Tools>();
ArrayList<Integer> loops = new ArrayList<Integer>();
Keyboard state = Keyboard.NO_KEYBORAD;
int input;

void setup(){
  //sets base background
  size(1050, 720);
  noStroke();
  fill(50,50,50);
  rect(700, 0, 350,720);
  fill(80,80,80);
  rect(0,0,700, 720);


  //droid
  fill(230,230,230);
  //door rect
  rect(-50,100,250,620);
  fill(80,80,80);
  //cut the door ellipse
  ellipse(75,90,300,80);
  fill(230,230,230);
  //add to door ellipse
  // ellipse(25, 500,300,80);
   //main body rect
  rect(150,100,450,620);
  //top
  ellipse(375, 100, 450, 350);
  //inside
  fill(200,200,200);
  rect(165,120,420,620);
  //inside top shading
  fill(185,185,185);
  ellipse(375,120,420,100);
  //toolbar

fill(150,150,150);
rect(25,565,650,130,10);

  fill(165,177,204);
  stroke(96,106,161);
  strokeWeight(3);
  //rect(25,565,50,50,10);
  rect(40,580,100,100,10);
  rect(170,580,100,100,10);
  rect(300,580,100,100,10);
  rect(430,580,100,100,10);
  rect(560,580,100,100,10);

  //forward logo
  line(85,606,85,660);
  line(95,606,95,660);
  line(70,620,90,600);
  line(110,620,90,600);

  //turnleft logo
  noFill();
  rect(195,605,50,50,0,20,0,0);
  rect(195,615,40,40,0,15,0,0);
  fill(165,177,204);
  noStroke();
//  stroke(165,177,204);
  rect(180,617,40,80,0,15,0,0);

}

void draw(){

}

void mouseClicked(){
  int[] pos = {mouseX, mouseY};
  if((40<pos[0])&&(pos[0]<140)&&(580<pos[1])&&(pos[1]<680)){ //forward has been clicked
    list.add(Tools.tFORWARD);
  }
  if((170<pos[0])&&(pos[0]<270)&&(580<pos[1])&&(pos[1]<680)){ //left has been clicked
    list.add(Tools.tLEFT);
  }
  if((300<pos[0])&&(pos[0]<400)&&(580<pos[1])&&(pos[1]<680)){ //right has been clicked
    list.add(Tools.tRIGHT);
  }
  if((430<pos[0])&&(pos[0]<530)&&(580<pos[1])&&(pos[1]<680)){ //shoot has been clicked
    System.out.println("shoot");
  }
  if((560<pos[0])&&(pos[0]<660)&&(580<pos[1])&&(pos[1]<680)){ //loop has been clicked
    if(list.get(list.size()-1) == Tools.tLOOP)
      loops.get(loops.size()-1) =   loops.get(loops.size()-1) +1;
    else
    {
    list.add(Tools.tLOOP);
    loops.add(1);
    }
  }

  }


//  if(start button)
//    Runner.ParseFull(list);
}
