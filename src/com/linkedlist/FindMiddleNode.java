package com.linkedlist;

import com.linkedlist.SinglyLinkedList.Node;

public class FindMiddleNode {
	public static void main(String[] args) {
		SinglyLinkedList l = new SinglyLinkedList();
		l.add(new Node("1", null));
		l.add(new Node("2", null));
		l.add(new Node("3", null));
		l.add(new Node("4", null));
		l.add(new Node("5", null));
		l.add(new Node("6", null));
		l.add(new Node("7", null));
		l.add(new Node("8", null));
		l.add(new Node("9", null));
		l.add(new Node("10", null));
		l.add(new Node("11", null));
		l.add(new Node("12", null));
		l.add(new Node("13", null));

		Node middle = l.findMiddle();
		Node ith = l.FindLastnthNode(2);
		System.out.println("middle:" + middle);
		System.out.println("last 3rs:" + ith);
	}

}
