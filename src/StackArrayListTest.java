

import static org.junit.Assert.*;

import org.junit.Test;

public class StackArrayListTest {

	@Test
	public void testPush() {
		Stack<String> stack = new StackArrayList<String>();
		String s = "correct";
		stack.push(s);
		if (!stack.peek().equals(s))
			fail();
	}

	@Test
	public void testPop() {
		Stack<String> stack = new StackArrayList<String>();
		String s = "correct";
		stack.push(s);
		if (!stack.pop().equals(s))
			fail();
	}

	@Test
	public void testPeek() {
		Stack<String> stack = new StackArrayList<String>();
		String s1 = "c1";
		String s2 = "c2";
		stack.push(s1);
		stack.push(s2);
		if (!stack.peek().equals(s2))
			fail();
	}

	@Test
	public void testSize() {
		Stack<String> stack = new StackArrayList<String>();
		String s1 = "c1";
		String s2 = "c2";
		stack.push(s1);
		stack.push(s2);
		if (stack.size() != 2)
			fail();
	}

	@Test
	public void testEmpty() {
		Stack<String> stack = new StackArrayList<String>();
		assertEquals(true,stack.empty());
	}

}
