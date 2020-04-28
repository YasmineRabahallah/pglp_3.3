package fr.uvsq.exercice3;

import java.util.ArrayList;

/**
 * class  Robots.
 * @author rabahallah yasmine.
 *
 */
public class Robots {
  /**
   * listRobots liste des robots.
   */

  private ArrayList<Robot> listRobots;

  /**
   * constructeur Robots.
   */

  public Robots() {
    listRobots = new ArrayList<Robot>();
  }
  /**
   * methode pour ajouter un robot dans la liste.
   * @param robot ajouter un robot. 
   */

  public void addRobot(Robot robot) {
    this.listRobots.add(robot);
  }

  /**
   * methode pour avancer tous les robots.
   */

  public void avanceTout() {
    for (Robot robot: listRobots) {
      if (robot instanceof RobotDynamique) {
        ((RobotDynamique) robot).avance();
      }
    }
  }
}
