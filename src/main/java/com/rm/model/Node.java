package com.rm.model;

/**
 * 
 * @author rohitmenon
 *
 * @param <T>
 */
public class Node<T> {

	private T value_;
	private Node<T> next_;

	public Node() {
		next_ = null;
	}

	public Node(T value) {
		value_ = value;
	}

	public T getValue() {
		return value_;
	}

	public void setValue(T value) {
		this.value_ = value;
	}

	public Node<T> getNext() {
		return next_;
	}

	public void setNext(Node<T> next) {
		this.next_ = next;
	}

	@Override
	public String toString() {
		return "Node [value=" + value_ + "]";
	}

}
