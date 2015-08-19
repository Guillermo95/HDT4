import java.util.Iterator;

public class DoublyLinkedList<E> extends AbstractList<E>{
protected int count;
protected DoublyLinkedNode<E> head;
protected DoublyLinkedNode<E> tail;

public DoublyLinkedList()
// post: constructs an empty list
{
   head = null;
   tail = null;
   count = 0;
}


public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
{
   // construct a new element, making it head
   head = new DoublyLinkedNode<E>(value, head, null);
   // fix tail, if necessary
   if (tail == null) tail = head;
   count++;
}


public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
{
   // construct new element
   tail = new DoublyLinkedNode<E>(value, null, tail);
   // fix up head
   if (head == null) head = tail;
   count++;
}


public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
{
	DoublyLinkedNode<E> temp = tail;
	tail = tail.previous();
	if (tail == null) {
	head = null;
	} else {
	tail.setNext(null);
	}
	count--;
	return temp.value();
   //return null;
}


@Override
public int size() {
	// TODO Auto-generated method stub
	return count;
}


@Override
public void clear() {
	// TODO Auto-generated method stub
	
}


@Override
public E getFirst() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public E getLast() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public E removeFirst() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public E remove(E value) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void add(E value) {
	// TODO Auto-generated method stub
	
}


@Override
public E remove() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public E get() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public int indexOf(E value) {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public int lastIndexOf(E value) {
	// TODO Auto-generated method stub
	return 0;
}


@Override
public E get(int i) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public E set(int i, E o) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void add(int i, E o) {
	// TODO Auto-generated method stub
	
}


@Override
public E remove(int i) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public Iterator<E> iterator() {
	// TODO Auto-generated method stub
	return null;
}
}