package fr.uvsq.exercice3;


public class RobotDynamique extends Robot  {

	public RobotDynamique(Position position, Direction direction) {
		super(position, direction);
		
	}
	public void avancer(int x , int y ){
		 this.position.change_position(x, y);
		
	}
	
	public void tourne(Direction direction){
	if(direction.equals("n"))
	{
		direction = Direction.NORD ;
	}
	else if(direction.equals("e"))
	{
		direction = Direction.EST ;
	}
	else if(direction.equals("s"))
	{
		direction = Direction.SUD ;
	}
	{
		direction = Direction.OUEST ;
	}
	
	}

}
