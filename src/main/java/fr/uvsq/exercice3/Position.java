package fr.uvsq.exercice3;

public class Position {
	private int x ;
	private int y ;
	public Position (int x , int y ){
		this.x=x;
		this.y=y;
	}
	public void changeX(int newx){
		this.x += newx ;
		}
	public void changeY(int newy){
		this.y += newy ;
		}
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	

}
