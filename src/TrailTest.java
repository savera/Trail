import static org.junit.Assert.*;


import org.junit.Test;

import junit.framework.TestCase;

public class TrailTest extends TestCase{

	@Test
	public void testIsLevelTrailSegment(){
		int[] markers = {0, 160, 100, 60, 45, 50, 20, 75, 75, 70, 80, 120, 130};
		Trail trail  = new Trail(markers);
		assertTrue(trail.isLevelTrailSegment(7, 10));
	}
	
	//public void testNonLevelTrailSegment(){
	//	int[] markers = {50, 10, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		//Trail trail  = new Trail(markers);
		//assertFalse(trail.isLevelTrailSegment(2, 12));
	//}
	
	
	//public void testIsDifficult(){
		//int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		//Trail trail  = new Trail(markers);
		//assertTrue(trail.isDifficult());
	//}
	
	@Test
	public void testIsNotDifficult(){
		int[] markers = {30, 50, 40, 100, 20, 35, 60, 60, 60};
		 Trail trail = new Trail(markers);
		assertFalse(trail.isDifficult());
	}

}
