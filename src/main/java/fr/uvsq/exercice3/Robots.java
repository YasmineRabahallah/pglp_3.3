package fr.uvsq.exercice3;

import java.util.ArrayList;

public class Robots {
	
    private ArrayList<Robot> listRobots;
   
    public Robots() {
        listRobots = new ArrayList<Robot>();
    }
  
    public void addRobot(Robot robot) {
      this.listRobots.add(robot);
    }
   
    public void avanceTout() {

        for (Robot robot: listRobots) {
     	   if(robot instanceof RobotDynamique) {
    				((RobotDynamique) robot).avance();
    			}
       }
}
}
