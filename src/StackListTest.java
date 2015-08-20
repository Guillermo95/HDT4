
import static org.junit.Assert.*;

import org.junit.Test;

public class StackListTest {

	@Test
	public void testPush(){
		Stack<String> stack = new StackList<String>(2);
		String s = "correct";
		stack.push(s);
		String aux = stack.pop();
		if(!aux.equals(s))
			fail();
	}
	
	@Test
	public void testPop() {
		Stack<String> stack = new StackList<String>(2);
		String s = "correct";
		stack.push(s);
		if (!stack.pop().equals(s))
			fail();
	}

	@Test
	public void testEmpty() {
		Stack<String> stack = new StackList<String>(2);
		assertEquals(true,stack.empty());
	}
}
