package fr.uvsq.exercice3;

public class Position {
	private int x ;
	private int y ;
	public Position (int x , int y ){
		this.x=x;
		this.y=x;
	}
	public void change_position(int newx , int newy){
		this.x += newx ;
		this.y += newy ;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	

}
