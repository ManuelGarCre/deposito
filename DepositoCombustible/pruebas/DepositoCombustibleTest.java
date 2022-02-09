import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DepositoCombustibleTest {

	private DepositoCombustible tank;

	@AfterEach
	void tearDown() throws Exception {
		tank = null;
	}

	@Test
	void testGetDepositoNivel() {
		fail("No implementado aun");
	}

	@Test
	void testGetDepositoMax() {
		tank = new DepositoCombustible(30.0,20.0);
		double esperado = 30.0;
		double actual = tank.getDepositoMax();
		assertEquals(esperado,actual);
	}

	@Test
	void testEstaVacio() {
		fail("No implementado aun");
	}

	@Test
	void testEstaLleno() {
		fail("No implementado aun");
	}

	@Test
	void testFill() {
		fail("No implementado aun");
	}

	@Test
	void testConsumir() {
		fail("No implementado aun");
	}

}
