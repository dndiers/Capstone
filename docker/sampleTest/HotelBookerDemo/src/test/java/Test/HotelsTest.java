package Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Model.Products;

public class HotelsTest {
	
	ArrayList<String> beach = new ArrayList<String>();
	ArrayList<String> city = new ArrayList<String>();
	ArrayList<String> adventure = new ArrayList<String>();
	
	@BeforeTest
public void setUp() throws Exception {	
		
		bch.add("The Residence Maldives");		
		bch.add("Baros");
		bch.add("The Beach House");
		bch.add("Cheval Blanc");
		
		cty.add("Hotel Plaza Athenee");
		cty.add("The Lucerne Hotel");
		cty.add("The Colonnade Hotel");
		cty.add("Miramar Barcelona");
		cty.add("Gramercy Park Hotel");
		
				
		advntr.add("Hostel Margouya Patagonia");
		advntr.add("Leobo Private Reserve");
		advntr.add("Bosco Alto-Salento");
		
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		cam.clear();
	}

	
	
	@Test
	public void testresultsForBeach() {
		ArrayList<String> actBeach = new ArrayList<String>();
		Hotels objHotelcusts = new Hotels();
		actBeach = objHotelcusts.results("beach");		
		assertEquals(bch, beach);		
	}
	
	@Test
	public void testresultsForCity() {
		ArrayList<String> actCity = new ArrayList<String>();
		Hotels objHotelcusts = new Hotels();
		actCity = objHotelcusts.results("city");		
		assertEquals(cty, actCity);		
	}
	
	@Test
	public void testresultsForAdventure() {
		ArrayList<String> actAdventure = new ArrayList<String>();
		Hotels objProdcusts = new Hotels();
		actAdventure = objHotelcusts.results("adventure");		
		assertEquals(adventure, actAdventure);		
	}
}
