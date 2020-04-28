package fr.uvsq.exercice3;

/**
 * class Robot.
 * @author rabahallah yasmine.
 *
 */

public class Robot {
  public  Position position;
  public Direction direction;

  /**
   * constructeur Robot.
   * @param position du robot.
   * @param direction du robot.
   */

  public Robot(Position position,Direction direction) {
    this.direction = direction;
    this.position = position;
  }

  /**
   * methode pour retourner la position du robot.
   * @return position. 
   */

  public Position getposition() {
    return this.position;
  }

  /**
   * methode pour retourner la direction du robot.
   * @return direction. 
   */

  public Direction getDirection() {
    return this.direction;
  }
  
}
