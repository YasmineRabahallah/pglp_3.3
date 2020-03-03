package fr.uvsq.exercice3;

public class RoboStatique extends Robot {

	public RoboStatique(Position position, Direction direction) {
		super(position, direction);
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
	public void avance() {
		throw new UnsupportedOperationException();
	}
	

}
