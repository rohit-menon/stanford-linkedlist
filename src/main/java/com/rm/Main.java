/**
 * 
 */
package com.rm;

import com.rm.model.LinkedList;
import com.rm.model.Node;

/**
 * @author rohitmenon
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		Node<Integer> node = new Node<Integer>(1);
		linkedList.setHead(node);

		Operations<Integer> operations = new Operations<Integer>();
		linkedList.setHead(operations.addNodeAtHead(linkedList.getHead(), 2));
		linkedList.setHead(operations.addNodeAtHead(linkedList.getHead(), 3));
		linkedList.setHead(operations.addNodeAtHead(linkedList.getHead(), 2));

		System.out.println("Lenght of linked list: "
				+ operations.length(linkedList.getHead()));

		operations.printList(linkedList.getHead());

		System.out.println("Occurences of value 2: "
				+ operations.countOccurences(linkedList.getHead(), 2));

	}

}
