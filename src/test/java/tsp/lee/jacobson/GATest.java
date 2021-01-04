package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	City c1 = new City(1,1);
	City c2 = new City(6,2);
	City c3 = new City(6,6);
	
	
	Population pop;
	
	@Test
	/**
	 * Given evolvePopulation
	 * When elitism is true
	 * Then first element of newPopulation is the best
	 */
	public void evolvePopulation_elitism_FisrtElemestBest() {
		TourManager.addCity(c1);
		TourManager.addCity(c2);
		TourManager.addCity(c3);
		
		Tour t1 = new Tour();
		t1.setCity(0, c1);
		t1.setCity(1, c2);
		t1.setCity(2, c3);
		
		Tour t2 = new Tour();
		t2.setCity(0, c3);
		t2.setCity(1, c1);
		t2.setCity(2, c2);
		
		Tour t3 = new Tour();
		t3.setCity(0, c1);
		t3.setCity(1, c3);
		t3.setCity(3, c2);
		
		pop = new Population(3, false);
		pop.saveTour(0, t1);
		pop.saveTour(1, t2);
		pop.saveTour(2, t3);
		
		Population newPop = GA.evolvePopulation(pop);

		
		int expected = pop.populationSize();
		int actual = newPop.populationSize();
		
		assertEquals(expected, actual);
		
	}

}
