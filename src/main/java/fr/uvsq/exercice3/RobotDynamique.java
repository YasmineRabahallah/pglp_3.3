package fr.uvsq.exercice3;


public class RobotDynamique extends Robot  {
 /**
  * 
  * @param position position de robot dynamique
  * @param direction direction de robot dynamique
  */
	public RobotDynamique(Position position, Direction direction) {
		super(position, direction);
		
	}
	/**
	 * 
	 */
	public void avance() {
	    switch (this.getDirection()) {
	    case NORD:
	            this.getposition().changeY(1); break ;
	        case EST:
	        	 this.getposition().changeX(1);break ;
	        case OUEST:
	        	 this.getposition().changeX(-1);break ;
	        case SUD:
	        	 this.getposition().changeY(-1);break ;
	       

	    }
	}
	
	public void tourne() {
	    switch (this.getDirection()) {
	    case NORD:
	        this.direction = Direction.EST ;
	    case EST:
	    	this.direction = Direction.SUD ;
	    case OUEST:
	    	this.direction = Direction.NORD;
	    case SUD:
	    	this.direction = Direction.OUEST ;
	    default:
	}
	}

}
