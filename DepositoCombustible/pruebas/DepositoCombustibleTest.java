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
	void testGetDepositoMax() {
		fail("No implementado aun");
	}

	@Test
	void testEstaVacio() {
		tank = new DepositoCombustible(60.0, -23.0);
		tank.fill(50);
		tank.consumir(20);
		assertFalse(tank.estaVacio());
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
