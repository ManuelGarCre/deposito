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
		fail("No implementado aun");
	}

	@Test
	void testConsumir() {
		tank = new DepositoCombustible(90.0, 35.0);
		tank.consumir(20.0);
		tank.fill(200.0);
		tank.consumir(10.0);
		assertEquals(80.0, tank.getDepositoNivel());
	}

}
