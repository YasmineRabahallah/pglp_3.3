package fr.uvsq.exercice3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotDynamqueTest {
	@Test
	public void avancerTest() {
		
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.NORD);
		d.avance();
		assertEquals(4,d.getposition().getY(),0);
		
		
	}
	@Test
	public void avancerTest2() {
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.EST);
		d.avance();
		assertEquals(3,d.getposition().getX(),0);
	}
	
	@Test
	public void avancerTest3() {
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.OUEST);
		d.avance();
		assertEquals(1,d.getposition().getX(),0);
	}
	@Test
	public void avancerTest4() {
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.SUD);
		d.avance();
		assertEquals(2,d.getposition().getY(),0);
	}
	@Test
	public void tournerTest1() {
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.SUD);
		d.tourne();
		assertEquals(Direction.OUEST,d.getDirection());
		
	}
	public void tournerTest2() {
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.EST);
		d.tourne();
		assertEquals(Direction.SUD,d.getDirection());
		
	}
	public void tournerTest3() {
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.OUEST);
		d.tourne();
		assertEquals(Direction.NORD,d.getDirection());
		
	}
	public void tournerTest4() {
		RobotDynamique d = new RobotDynamique(new Position (2,3),Direction.NORD);
		d.tourne();
		assertEquals(Direction.EST,d.getDirection());
		
	}
	
	
	

}
