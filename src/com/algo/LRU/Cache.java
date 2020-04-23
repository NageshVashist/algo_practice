package com.algo.LRU;

import java.util.HashMap;

public class Cache {

	private HashMap<String, Node> m;
	private Node head;
	private Node tail;
	private int size;

	public Cache(int size) {

		m = new HashMap<>();
		head = new Node(null, null, null, null);
		tail = new Node(null, null, head, null);
		head.nxt = tail;
		this.size = size;

	}

	public static void main(String[] args) {

		Cache lru = new Cache(5);
		lru.put("a", "a");
		lru.put("b", "b");
		lru.put("c", "c");
		lru.put("d", "d");
		lru.put("e", "e");
		lru.put("f", "f");
		lru.put("g", "g");
		lru.put("h", "h");
		lru.put("i", "i");
		
		
		System.out.println(lru.get("i"));
		System.out.println(lru.get("h"));
		System.out.println(lru.get("e"));
		System.out.println(lru.get("f"));
		System.out.println(lru.get("g"));
		System.out.println(lru.head);
		
	}

	public void put(String k, String v) {
		Node n = new Node(k, v, null, null);
		addNode(n);
	}

	public String get(String k) {
		Node n = m.get(k);
		removeNode(n);
		addNode(n);

		return n.val;
	}

	private void addNode(Node n) {
		if (m.size() == size) {
			removeNode(tail.priv);
		}
		Node nd = head.nxt;
		n.nxt = nd;
		nd.priv = n;
		head.nxt = n;
		n.priv = head;

		m.put(n.key, n);
	}

	private void removeNode(Node n) {
		Node nxt = n.nxt;
		Node pre = n.priv;
		pre.nxt = nxt;
		nxt.priv = pre;

		m.remove(n.key);
	}

}
