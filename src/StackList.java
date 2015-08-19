

public class StackList<E> extends AbstractStack<E>{
	protected List<E> data;
	
	public StackList(int opcion)
	// post: constructs a new, empty stack
	{
		switch(opcion){
		case 1:
			data = new SinglyLinkedList<E>(); 
			break;
		case 2:
			data = new DoublyLinkedList<E>();
			break;
		default:
			data = new CircularList<E>();
		}

	}
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.addFirst(item);
	}

	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.removeFirst();
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
