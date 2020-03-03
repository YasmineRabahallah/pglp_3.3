package fr.uvsq.exercice3;

public class Robot {
 public  Position position ;
 public Direction direction ;
 public Robot (Position position ,Direction direction ){
	 this.direction=direction;
	 this.position= position ;
 }
 public Position getposition(){
	 return this.position ;
 }
 public Direction getDirection(){
	 return this.direction ;
 }
 
   
}
