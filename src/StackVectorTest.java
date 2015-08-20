/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Sección 30
 *Guillermo Javier de León Archila, 14022
 *José Pablo Ortega Grajeda, 14565
 *Dan Isaí Alvarez Ruano, 14628
 *Clase: StackVector
 */

import static org.junit.Assert.*;

import org.junit.Test;


public class StackVectorTest {

	@Test
	public void testPush() {
		Stack<String> stack = new StackVector<String>();
		String s = "correct";
		stack.push(s);
		if (!stack.peek().equals(s))
			fail();
	}

	@Test
	public void testPop() {
		Stack<String> stack = new StackVector<String>();
		String s = "correct";
		stack.push(s);
		if (!stack.pop().equals(s))
			fail();
	}

	@Test
	public void testPeek() {
		Stack<String> stack = new StackVector<String>();
		String s1 = "c1";
		String s2 = "c2";
		stack.push(s1);
		stack.push(s2);
		if (!stack.peek().equals(s2))
			fail();
	}

	@Test
	public void testSize() {
		Stack<String> stack = new StackVector<String>();
		String s1 = "c1";
		String s2 = "c2";
		stack.push(s1);
		stack.push(s2);
		if (stack.size() != 2)
			fail();
	}

	@Test
	public void testEmpty() {
		Stack<String> stack = new StackVector<String>();
		assertEquals(true,stack.empty());
	}

}
