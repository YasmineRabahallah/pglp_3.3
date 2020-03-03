package fr.uvsq.exercice3;
/**
 * 
 * @author Hamila
 *
 */
public class Position {
	private int x ;
	private int y ;
	public Position (int x , int y ){
		this.x=x;
		this.y=y;
	}
/**
 * 
 * @param newx position x pour avancer
 */
	public void changeX(int newx){
		this.x += newx ;
		}
/**
 * 
 * @param newy position y pour avancer
 */
	public void changeY(int newy){
		this.y += newy ;
		}
	
/**
 * 
 * @return la position x 
 */
	public int getX() {
		return this.x;
	}
	/**
	 * 
	 * @return la position y
	 */
	public int getY() {
		return this.y;
	}
	

}
