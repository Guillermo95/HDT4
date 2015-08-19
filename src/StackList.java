

public class StackList<E> extends AbstractStack<E>{
	protected List<E> data;
	
	public StackList(int opcion)
	{
		ListFactory<E> lfactory = new ListFactory<E>();
		data = lfactory.getList(opcion);
	}


	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		try{
			data = (SinglyLinkedList<E>) data;
			data.addFirst(item);
		}
		catch(Exception e){
			data.addLast(item);
		}
		
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		try{
			data = (SinglyLinkedList<E>) data;
			return data.removeFirst();
		}
		catch(Exception e){
			return data.removeLast();
		}
	}

	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
}
