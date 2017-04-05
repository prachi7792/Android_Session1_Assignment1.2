package com.acadgild.javaassignment.core;

public class Evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10, c, d, e;
		b = (a--) - (--a);
		c = a--;
		d = a >> 2;
		e = a & b;
		System.out.println("A: " + a ); 
		System.out.println("B:  " + b);
		System.out.println("C: " + c );
		System.out.println("D:  " + d);
		System.out.println("E: "+" "+e);

	}

}
