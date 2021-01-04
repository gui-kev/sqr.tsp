package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {
	
	City c1 = new City(2,3);
	City c2 = new City(2,5);
	City c3 = new City(2,6);
	
	@Test
	/**
	 * Given totalDistance
	 * When no cities
	 * Then distance = 0
	 */
	public void totalDistance_noCities_0() {
		double expected = 0;
		Tour tour = new Tour();
		tour.setCity(0, c1); 
		
		double actual = tour.getDistance();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	/**
	 * Given total distance
	 * When only one city
	 * Then distance = 0
	 */
	public void totalDistance_oneCity_0() {
		double expected = 0;
		TourManager.addCity(c1);
		Tour tour = new Tour();
		tour.setCity(0, c1); 
		
		double actual = tour.getDistance();
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	/**
	 * Given total distance
	 * When mutliple cities
	 * Then sum of the distances between each two consecutive cities (even last and first)
	 */
	public void totalDistance_multipleCities_sumOfDistances() {
		//city1 is already added
		TourManager.addCity(c2);
		TourManager.addCity(c3);
		Tour tour = new Tour();
		tour.setCity(0, c1); 
		tour.setCity(1, c2); 
		tour.setCity(2, c3); 
		
		double actual = tour.getDistance();
		double expected = 6;
		
		assertEquals(expected, actual, 0);
	}


}
