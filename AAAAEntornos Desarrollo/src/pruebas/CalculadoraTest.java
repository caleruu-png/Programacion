package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	//@Test
	//void testCalculadora() {
	//fail("Not yet implemented");
	//}

	@Test
	void testSuma() {
	Calculadora c= new Calculadora(20,10);
	assertEquals(30, c.suma(),0);
	//fail("Not yet implemented");
	}

	@Test
	void testResta() {
	Calculadora c= new Calculadora(20,10);
	assertEquals(10, c.resta(),0);
	//fail("Not yet implemented");
	}

	@Test
	void testMultiplica() {
	Calculadora c= new Calculadora(20,10);
	assertEquals(200, c.multiplica(),0);
	//fail("Not yet implemented");
	}

	@Test
	void testDivide() {
	Calculadora c= new Calculadora(20,10);
	assertEquals(2, c.divide2(),0);
	//fail("Not yet implemented");
	}

}
