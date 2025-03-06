import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {

	static GestorTienda prueba;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		prueba = new GestorTienda();
	}

	@Test
	void testCalcularDescuento() {
		assertEquals(10.0,prueba.calcularDescuento(100.0, 11));
		assertEquals(5,prueba.calcularDescuento(100.0, 5));
		assertEquals(0.0,prueba.calcularDescuento(100.0, 2));
	}

	@Test
	void testCategorizarProducto() {
		assertEquals("Económico",prueba.categorizarProducto(9));
		assertEquals("Estándar",prueba.categorizarProducto(40));
		assertEquals("Premium",prueba.categorizarProducto(100));
	}

	@Test
	void testBuscarProducto() {
		String [] resu = {"Hola", "Movil", "Patata"};
		assertEquals("Movil",prueba.buscarProducto(resu, "Movil"));
		assertNull(prueba.buscarProducto(resu, "Negro"));
	}

}
