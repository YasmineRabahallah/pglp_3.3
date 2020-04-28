package fr.uvsq.exercice3;

/**
 * class RobotDynamique.
 * @author rabahallah yasmine.
 *
 */

public class RobotDynamique extends Robot  {
  /**
   * constructeur RobotDynamique.
   * @param position position de robot dynamique.
   * @param direction direction de robot dynamique.
   */

  public RobotDynamique(Position position, Direction direction) {
    super(position, direction);
  }

  /**
   * methode avance pour avancer le rebot.
   */

  public void avance() {
    switch (this.getDirection()) {
      case NORD:this.getposition().changeY(1);
      break;
      case EST:this.getposition().changeX(1);
      break;
      case OUEST:this.getposition().changeX(-1);
      break;
      case SUD:this.getposition().changeY(-1);
      break;  
      default:break;
    }
  }
  
  /**
   * methode pour tourner le rebot.
   */

  public void tourne() {
    switch (this.getDirection()) {
      case NORD:this.direction = Direction.EST;
      break;
      case EST:this.direction = Direction.SUD;
      break;
      case OUEST:this.direction = Direction.NORD;
      break;
      case SUD:this.direction = Direction.OUEST;
      break;
      default:break;
    }
  }

}
