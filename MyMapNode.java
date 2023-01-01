package com.hashMapDay15;

public class MyMapNode <K,V> implements Node<K> {

	K key;
	V value;
	Node<K> next;
	
	public MyMapNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public K getkey() {
		return key;
	}

	@Override
	public void setkey(K key) {
		this.key = key;
	}

	@Override
	public Node<K> getnext() {
		return next;
	}
	public void setNext(Node<K> next) {
		this.next = next;
	}


	@Override
	public String toString() {
		return "MyMapNode [key=" + key + ", value=" + value + ", next=" + next + "]";
	}

	
	
}
