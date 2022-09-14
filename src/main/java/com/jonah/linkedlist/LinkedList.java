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

public class LinkedList {
	
	private Node head;
	
	public LinkedList() {}
	public LinkedList(int _initValue) {
		this.head = new Node(_initValue);
	} 
	
	public Node search(int v) {
		Node x = head;
		while(x!=null && x.getValue() != v) {
			x=x.getNext();
		}
		return x;
	}
	
	public void insert(Node nn){
		nn.setNext(head);
		if(head!=null) head.setPrev(nn);
		head = nn;
		nn.setPrev(null);
	}
	
	public void delete(int i)  {delete(search(i));}
	public void delete(Node v) {
		if(v.getPrev() == null && v.getNext() == null) head = null;
		else if(v.getPrev() == null) head = v.getNext();
		else v.getPrev().setNext(v.getNext());
	}
	
	public String toString() {
		if(head != null) return head.toString();
		return "";
	}
}
