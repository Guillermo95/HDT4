
public abstract class AbstractStack<E> implements Stack<E>{
	public AbstractStack()
	   // post: does nothing
	   {
	   }

	   public boolean empty()
	   // post: returns true iff list has no elements
	   {
	      return size() == 0;
	   }
}
