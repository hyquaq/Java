class Node<E> {
	private E element;
	private Node<E> next;

	Node() {
		element = null;
		next = null;
	}

	Node(E data) {
		this(data, null);
	}

	Node(E data, Node<E> next) {
		this.element = data;
		this.next = next;
	}

	public E getElement() {
		return element;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
}