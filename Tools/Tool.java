public class interface Tool
{
	int[] position;
	whatever look; //the look, however we store it

	public Tool(){
		position = {0,0,0};
	}

	public Tool(int xPos, int yPos, int zPos){
		position = {xPos, yPos, zPos};
  }

	public whatever look(){ //returns the look

	}

	public int[] location(){
		return position;
	}

	public void changePosition(int[] newPosition){
		position = newPosition;
	}

	public abstract String whatDoes(){ //returns commands

	}
//identifies the type of tool
//what it looks like
//what it does


}
