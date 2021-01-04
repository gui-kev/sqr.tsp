package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	/**
	 * Given distanceTo
	 * When two cities are same 
	 * Then distance = 0
	 */
	public void distanceTo_Same_0() {
		double expected = 0;
		City c1 = new City(-20,20);
		City c2 = new City(-20,20);
		
		double actual = c1.distanceTo(c2);	
		
		assertEquals(actual, expected,0);	
	}
	
	@Test
	/**
	 * Given distanceTo
	 * When two cities are different
	 * Then distance = sqrt[(x.city1-x.city2)² + (y.city1-y.city2)²]
	 */
	public void distanceTo_HorizentalyAlligned_DiffAbscices() {
		City c1 = new City(-5,1);
		City c2 = new City(18,15);
		double expected = Math.sqrt((-5-18)*(-5-18) + (1-15)*(1-15));
		
		double actual = c1.distanceTo(c2);
		
		assertEquals(actual, expected,0);	
	}
	
}
