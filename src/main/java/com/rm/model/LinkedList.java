/**
 * 
 */
package com.rm.model;

/**
 * @author rohitmenon
 *
 */
public class LinkedList<T> {

	Node<T> head_;

	public LinkedList() {
		head_ = null;
	}

	public LinkedList(Node<T> head) {
		this.head_ = head;
	}

	public Node<T> getHead() {
		return head_;
	}

	public void setHead(Node<T> head) {
		this.head_ = head;
	}

}
