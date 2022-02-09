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
		fail("No implementado aun");
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
		tank = new DepositoCombustible(85.0,60.0);
		tank.fill(50.0);
		assertEquals(85.0,tank.getDepositoNivel());
		tank.fill(-100.0);
		assertEquals(0.0,tank.getDepositoNivel());
	}

	@Test
	void testConsumir() {
		fail("No implementado aun");
	}

}
