package ec.edu.espol.workshops.second;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StatementCoverageTest {
	int prime;

	@Test
	public void sc1Main() {
		prime = CarInsurance.calcularPrime(25, 'M', 'N', 'Y');
		assertEquals(500, prime);
	}
		
	@Test
	public void sc1CarInsurance() {
		prime = CarInsurance.calcularPrime(19, 'A', 'Y', 'Y');
		assertEquals(-1, prime);	
	}
	
	@Test
	public void sc2CarInsurance() {
		prime = CarInsurance.calcularPrime(20, 'F', 's', 'Y');
		assertEquals(-1, prime);	
	}

	@Test
	public void sc3CarInsurance() {
		prime = CarInsurance.calcularPrime(18, 'm', 'N', 'Y');
		assertEquals(2000, prime);	
	}

	@Test
	public void sc4CarInsurance() {
		prime = CarInsurance.calcularPrime(64, 'F', 'N', 'Y');
		assertEquals(300, prime);	
	}

	@Test
	public void sc5CarInsurance() {
		prime = CarInsurance.calcularPrime(60, 'f', 'n', 'Y');
		assertEquals(400, prime);	
	}

	@Test
	public void sc6CarInsurance() {
		prime = CarInsurance.calcularPrime(18, 'm', 'Y', 'd');
		assertEquals(-1, prime);	
	}
}