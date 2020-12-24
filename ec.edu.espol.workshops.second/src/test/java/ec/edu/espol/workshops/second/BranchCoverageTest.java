package ec.edu.espol.workshops.second;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class BranchCoverageTest {
	int prime;

	@Test
	public void sc1Main() {
		prime = CarInsurance.calcularPrime(25, 'M', 'N', 'Y');
		assertEquals(500, prime);
    }
    
      
    @Test
	public void sc1CarInsurance() {
		prime = CarInsurance.calcularPrime(18, 'm', 'Y', 'd');
		assertEquals(-1, prime);	
	}

		
	@Test
	public void sc2CarInsurance() {
		prime = CarInsurance.calcularPrime(19, 'A', 'Y', 'Y');
		assertEquals(-1, prime);	
	}
	
	@Test
	public void sc3CarInsurance() {
		prime = CarInsurance.calcularPrime(20, 'F', 's', 'Y');
		assertEquals(-1, prime);	
	}

	@Test
	public void sc4CarInsurance() {
		prime = CarInsurance.calcularPrime(18, 'm', 'N', 'Y');
		assertEquals(2000, prime);	
	}

	@Test
	public void sc5CarInsurance() {
		prime = CarInsurance.calcularPrime(64, 'F', 'N', 'Y');
		assertEquals(300, prime);	
	}

	@Test
	public void sc6CarInsurance() {
		prime = CarInsurance.calcularPrime(60, 'f', 'n', 'Y');
		assertEquals(300, prime);	
	}

	@Test
	public void sc7CarInsurance() {
		prime = CarInsurance.calcularPrime(18, 'm', 'Y', 'd');
		assertEquals(-1, prime);	
	}
	
	//test id 4
		@Test
		public void MetodoGetSet() {
			CarInsurance prime = new CarInsurance(16, 'm', 'Y', 'n');
			prime.setAgeClient(18);
			prime.setGenClient('m');
			prime.setMarriedStatus('n');
			prime.setLicenseClient('y');
			assertEquals(prime.getAgeClient(), 18);
			assertEquals(prime.getGenClient(),'m');
			assertEquals(prime.getMarriedStatus(), 'n');
			assertEquals(prime.getLicenseClient(), 'y');
		}
		
		@Test
		public void sc8CarInsurance() {
			CarInsurance car1 = new CarInsurance(16, 'm', 'Y', 'n');
			assertEquals(false, car1.validarPolitica());	
		}
		
		@Test
		public void sc9CarInsurance() {
			CarInsurance car1 = new CarInsurance(16, 'm', 'Y', 'y');
			assertEquals(false, car1.validarPolitica());	
		}
		
		@Test
		public void sc10CarInsurance() {
			CarInsurance car1 = new CarInsurance(20, 'm', 'Y', 'y');
			assertEquals(true, car1.validarPolitica());	
		}
		
		@Test
		public void sc11CarInsurance() {
			CarInsurance car1 = new CarInsurance(20, 'm', 'Y', 'p');
			assertEquals(false, car1.validarPolitica());	
		}
		
		@Test
		public void sc51CarInsurance() {
			prime = CarInsurance.calcularPrime(64, 'm', 'N', 'Y');
			assertEquals(400, prime);	
		}

		@Test
		public void sc52CarInsurance() {
			CarInsurance car1 = new CarInsurance(90, 'm', 'Y', 'p');
			assertEquals(false, car1.validarPolitica());	
		}
		
		@Test
		public void sc53CarInsurance() {
			prime = CarInsurance.calcularPrime(30, 'm', 'N', 'Y');
			assertEquals(500, prime);	
		}

}