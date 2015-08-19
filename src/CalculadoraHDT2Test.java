import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraHDT2Test {
	

	
	@Test
	public void testCalcularVector() {
		CalculadoraHDT2 ctest = new CalculadoraHDT2(1,1);
		String stest = "2 3 * 3 - 3 / 5 + 2 * 9 - 2 - 5 * 5 +";
		ctest.setString(stest);
		ctest.meterVector();
		assertEquals("La cadena se lee correctamente",true, ctest.calcularVector());
	}
	
	
	public void testGetResultado(){
		int itest = 10;
		CalculadoraHDT2 ctest = new CalculadoraHDT2(1,1);
		String stest = "2 3 * 3 - 3 / 5 + 2 * 9 - 2 - 5 * 5 +";
		ctest.setString(stest);
		ctest.meterVector();
		ctest.calcularVector();
		assertEquals(itest, ctest.getResultado());
	}

}
