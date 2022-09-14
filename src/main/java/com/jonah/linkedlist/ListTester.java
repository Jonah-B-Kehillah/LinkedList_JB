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
public class ListTester {
	public static void main(String[] args){
		
		System.out.println("Hello, world!");
		
		if(testConstructor()) pass++; else fail++;
		if(testSetter()) pass++; else fail++;
		
		if(testSearch()) pass++; else fail++;
		if(testSearchNE1()) pass++; else fail++;
		if(testSearchNE2()) pass++; else fail++;
		if(testSearchNE3()) pass++; else fail++;
		
		if(testDelete1()) pass++; else fail++;
		if(testDelete2()) pass++; else fail++;
		if(testDelete3()) pass++; else fail++;
		if(testDelete4()) pass++; else fail++;
		
		System.out.println(String.format("Tests passed: %d, Tests failed: %d", pass, fail));
		
	}
	
	static int pass = 0;
	static int fail = 0;
	
	public static boolean testConstructor(){
		Node fe = new Node(3);
		return fe.getValue() == 3;
	}
	public static boolean testSetter(){
		Node fe = new Node(3);
		Node se = new Node(4);
		fe.setNext(se);
		return fe.getNext()==se;
	}
	
	public static boolean testSearch(){
		LinkedList fl = new LinkedList();
		return fl.search(3) == null;
	}
	public static boolean testSearchNE1(){
		LinkedList fl = new LinkedList();
		Node ne = new Node(3);
		fl.insert(ne);
		return fl.search(3) == ne;
	}
	public static boolean testSearchNE2(){
		LinkedList fl = new LinkedList();
		Node ne = new Node(3);
		Node ne_ = new Node(4);
		fl.insert(ne);
		fl.insert(ne_);
		return fl.search(3) == ne;
	}
	public static boolean testSearchNE3(){
		LinkedList fl = new LinkedList();
		Node ne = new Node(3);
		Node ne_ = new Node(4);
		fl.insert(ne);
		fl.insert(ne_);
		return fl.search(4) == ne_;
	}
	
	public static boolean testDelete1() {
		LinkedList fl = new LinkedList();
		fl.insert(new Node(3));
		fl.insert(new Node(2));
		fl.insert(new Node(1));
		fl.delete(2);
		LinkedList sl = new LinkedList();
		sl.insert(new Node(3));
		sl.insert(new Node(1));
		return fl.toString().equals(sl.toString());
	}
	public static boolean testDelete2() {
		LinkedList fl = new LinkedList();
		fl.insert(new Node(3));
		fl.insert(new Node(2));
		fl.insert(new Node(1));
		fl.delete(3);
//		System.out.println(fl);
		LinkedList sl = new LinkedList();
		sl.insert(new Node(2));
		sl.insert(new Node(1));
		return fl.toString().equals(sl.toString());
	}
	public static boolean testDelete3() {
		LinkedList fl = new LinkedList();
		fl.insert(new Node(3));
		fl.insert(new Node(2));
		fl.insert(new Node(1));
		fl.delete(1);
		LinkedList sl = new LinkedList();
		sl.insert(new Node(3));
		sl.insert(new Node(2));
		return fl.toString().equals(sl.toString());
	}
	public static boolean testDelete4() {
		LinkedList fl = new LinkedList();
		fl.insert(new Node(3));
		fl.delete(3);
		return fl.toString().equals("");
	}
	
}
