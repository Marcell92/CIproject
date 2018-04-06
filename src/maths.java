import static org.junit.Assert.*;

import org.junit.Test;

public class maths {

	@Test
	public void addition() {

		ciMain testing = new ciMain();
		assertEquals("Actual was not Expected", 12, testing.addition(8, 4));

	}
	
	@Test
	public void subtraction() {

		ciMain testing = new ciMain();
		assertEquals("Actual was not Expected", 4, testing.subtraction(8, 4));

		}
	
	@Test
	public void multiplication() {

		ciMain testing = new ciMain();
		assertEquals("Actual was not Expected", 32, testing.multiplication(8, 4));

		}
	
	@Test
	public void division() {

		ciMain testing = new ciMain();
		assertEquals("Actual was not Expected", 2, testing.division(8, 4));

		}
	
	
	
}