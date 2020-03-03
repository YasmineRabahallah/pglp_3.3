package fr.uvsq.exercice3;
/**
 * 
 * @author Hamila
 *
 */
public class Robot {
 public  Position position ;
 public Direction direction ;
 /**
  * 
  * @param position la position de robot
  * @param direction la direction de robot
  */
 public Robot (Position position ,Direction direction ){
	 this.direction=direction;
	 this.position= position ;
 }
 /**
  * 
  * @return position 
  */
 public Position getposition(){
	 return this.position ;
 }
 /**
  * 
  * @return direction 
  */
 public Direction getDirection(){
	 return this.direction ;
 }
 
   
}
