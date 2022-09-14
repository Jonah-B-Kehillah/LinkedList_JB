/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonah.linkedlist;

/**
 *
 * @author jonah
 */
public class Node {
	
	private Node prev;
	private int value;
	private Node next;
	
	Node(int _value) {
		value = _value;
	}
	
	public void setPrev(Node _node)  {this.prev  = _node; }
	public void setValue(int _value) {this.value = _value;}
	public void setNext(Node _node)  {this.next  = _node; }
	
	public Node getPrev() {return this.prev ;}
	public int getValue() {return this.value;}
	public Node getNext() {return this.next ;}
	
	public String toString() {
		if(this.next==null) return Integer.toString(this.value);
		return this.value + " " + next.toString();
	}
	
}
