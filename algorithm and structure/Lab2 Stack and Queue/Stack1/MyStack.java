class MyStack<E> implements StackInterface<E> {

	private Node<E> top;
	private int numNode;

	MyStack() {
		top = null;
		numNode = 0;
	}


	@Override
	public void push(E item) {
		Node<E> copy = top;
		top = new Node<E>(item);

		top.setNext(copy);
	}

	@Override
	public E pop() {
		Node<E> copyTop = top;
		top = top.getNext();
		return copyTop.getElement();
	}

	@Override
	public int size() {
		return numNode;
	}

	@Override
	public boolean contains(Object item) {
		return false;
	}

	@Override
	public void print() {
		System.out.println("method print");
		Node<E> temp = top;
		while (temp != null) {
			System.out.print(top.getElement() + "->> ");
			temp = temp.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return numNode == 0;
	}

	@Override
	public E getPeek() {
		if (isEmpty()) {
			return null;
		}
		return top.getElement();
	}
}