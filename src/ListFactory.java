
public class ListFactory<E> {
	public List<E> getList(int opcion){
		switch(opcion){
		case 1:
			return new SinglyLinkedList<E>(); 
		case 2:
			return new DoublyLinkedList<E>();
		default:
			return new CircularList<E>();
	}
}
}
