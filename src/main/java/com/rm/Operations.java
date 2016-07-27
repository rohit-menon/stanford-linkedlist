/**
 * 
 */
package com.rm;

import com.rm.model.Node;

/**
 * @author rohitmenon
 *
 */
public class Operations<T> {

	public int length(Node<T> head) {
		int result = 0;
		Node<T> current = head;

		while (current != null) {
			result += 1;
			current = current.getNext();
		}

		return result;
	}

	public Node<T> addNodeAtHead(Node<T> head, T value) {
		Node<T> newNode = new Node<T>(value);

		newNode.setNext(head);
		head = newNode;

		return head;
	}

	public void printList(Node<T> head) {
		Node<T> current = head;

		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
	}

	public int countOccurences(Node<T> head, T value) {
		int count = 0;
		Node<T> current = head;

		while (current != null) {
			if (current.getValue().equals(value)) {
				count++;
			}
			current = current.getNext();
		}

		return count;
	}

}
