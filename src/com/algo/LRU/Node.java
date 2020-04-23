package com.algo.LRU;

public class Node {
 String val;
 Node priv;
 Node nxt;
 String key;
public Node(String key,String val, Node priv, Node nxt) {
	this.val = val;
	this.key=key;
	this.priv = priv;
	this.nxt = nxt;
}



}
