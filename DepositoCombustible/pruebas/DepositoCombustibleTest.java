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
		tank = new DepositoCombustible(40.0,50.0);
		double devuelto = tank.getDepositoNivel();
		double esperado = 40.0;
		assertEquals(esperado, devuelto);
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
		tank = new DepositoCombustible(60.0, -23.0);
		tank.fill(50);
		tank.consumir(20);
		assertFalse(tank.estaVacio());
	}

	@Test
	void testEstaLleno() {
		tank = new DepositoCombustible(40.0, 80.0);
		tank.fill(20.0);
		tank.fill(50.0);
		assertTrue(tank.estaLleno());
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
