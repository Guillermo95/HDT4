
public class StackFactory<E> {
	public Stack<E> getStack(int opcion1, int opcion2){
		switch(opcion1){
		case 1:
			return new StackVector<E>(); 
		case 2:
			return new StackArrayList<E>();
		default:
			return new StackList<E>(opcion2);
	}
}
}
