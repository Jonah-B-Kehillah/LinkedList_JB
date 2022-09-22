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

import java.util.Date;

public class ListTester {
	
	private static final int power = 24;
	
	public static void main(String[] args){
		
		LinkedList ll = new LinkedList();
		
		Date d1 = new Date();
		long t1 = d1.getTime();
		for(int i = 0; i < Math.pow(2, power); i++)
			ll.insert(new Node(i));
		Date d2 = new Date();
		long t2 = d2.getTime();
		
		System.out.println(t2-t1);
//		System.out.println(ll.search(337).getValue());
		
	}
}
