package fr.uvsq.exercice3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRobots {
	@Test
	public void Test() {
		
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.NORD);
		RobotDynamique d2 = new RobotDynamique(new Position (-2,3),Direction.EST);
		RoboStatique s = new  RoboStatique (new Position (7,-17),Direction.EST);
		Robots r = new Robots();
		r.addRobot(d) ;
		r.addRobot(d2);
		r.addRobot(s);
		r.avanceTout();
		assertEquals(4,d.getposition().getY(),0);
		assertEquals(-17,s.getposition().getY(),0);
		assertEquals(7,s.getposition().getX(),0);
		}
public void Test2() {
		
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.SUD);
		RoboStatique s = new  RoboStatique (new Position (12,0),Direction.OUEST);
		Robots r = new Robots();
		r.addRobot(d) ;
		r.addRobot(s);
		r.avanceTout();
		assertEquals(4,d.getposition().getY(),0);
		assertEquals(0,s.getposition().getY(),0);
		assertEquals(12,s.getposition().getX(),0);
		}
	
}
