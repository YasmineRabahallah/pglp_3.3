package fr.uvsq.exercice3;

/**
 * class Position.
 * @author rabahalah yasmine.
 *
 */

public class Position {

  /**
   * int posX position sur l'axe x.
   */

  private int posX;
  /**
   * int posY position sue l'axe y.
   */
  private int posY;
  /**
   * constructeur Position.
   * @param posX position sur l'axe x.
   * @param posY position sur l'axe y.
   */

  public Position(int posX,int posY) {
    this.posX = posX;
    this.posY = posY;
  }
  /**
   * methode pour changer la position sur l'axe x.
   * @param newx position x pour avancer.
   */

  public void changeX(int newx) {
    this.posX += newx;
  }
  /**
   * methode pour changer la position sur l'axe y.
   * @param newy position y pour avancer.
   */

  public void changeY(int newy) {
    this.posY += newy;
  }

  /**
   * methode pour retouner la position sur l'axe x.
   * @return la position x .
   */
  public int getX() {
    return this.posX;
  }
  /**
   * methode pour retourner la position sur l'axe y.
   * @return la position y.
   */

  public int getY() {
    return this.posY;
  }


}
