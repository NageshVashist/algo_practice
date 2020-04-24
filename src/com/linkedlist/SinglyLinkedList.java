package com.linkedlist;

public class SinglyLinkedList {
	Node head;

	public SinglyLinkedList() {
		head = new Node(null, null);
	}

	public void add(Node n) {
		Node c = head;
		while (c.nxt != null) {
			c = c.nxt;
		}
		c.nxt = n;
	}

	public void remove(Node r) {
		if (r.nxt == null) {
			r = null;
			return;
		}
		Node nxt = r.nxt;
		r.val = nxt.val;
		r.nxt = nxt.nxt;

	}

	public Node findMiddle() {
		Node c = head;
		Node m = head;
		int l = 0;
		while (c.nxt != null) {
			l++;
			if (l % 2 == 0) {
				m = m.nxt;
			}
			c = c.nxt;

		}
		if (l % 2 == 1) {
			m = m.nxt;
		}
		return m;
	}
	
	public Node FindLastnthNode(int i) {
		Node c = head;
		Node m = head;
		int l = 1;
		while (c.nxt != null) {
			l++;
			if (l > i) {
				m = m.nxt;
			}
			c = c.nxt;

		}
		
		return m;
	}

	static class Node {
		String val;
		Node nxt;

		public Node(String val, Node nxt) {
			this.val = val;
			this.nxt = nxt;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nxt == null) ? 0 : nxt.hashCode());
			result = prime * result + ((val == null) ? 0 : val.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (nxt == null) {
				if (other.nxt != null)
					return false;
			} else if (!nxt.equals(other.nxt))
				return false;
			if (val == null) {
				if (other.val != null)
					return false;
			} else if (!val.equals(other.val))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Node [val=" + val +"]";
		}
		
		

	}
}
