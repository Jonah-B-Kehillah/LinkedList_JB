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
public class Node<AnyClass> {
	
	public AnyClass value;
	private Node next;
	
	Node(AnyClass _value) {
		value = _value;
	}
	
}
