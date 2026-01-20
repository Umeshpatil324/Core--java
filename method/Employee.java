package com.method;

public class Employee {
	void mySquare() {
		int num=2;
		int square=num*num;
		System.out.println(square);	
		}


void myCube() {
	int num=2;
	int cube=num*num*num;
	System.out.println(cube);
}
void mySquare(int num ) {
	int square= num*num*num;
	System.out.println("square is "+square);
}
	
void myCube(int num) {
	int cube=num*num*num;
	System.out.println("cube is "+cube);
}
	
int mysquare() {
	int num=3;
	int square=num*num;
	return square;
}
int mycube() {
	int num=4;
	int cube=num*num*num;
	return cube;
}
void mySum() {
	int a=4;
	int b=5;
	int c=a+b;
	System.out.println(c);
}
int mysum() {
	int a=3;
	int b=6;
	int c=a+b;
	return c;
}
int mysum(int a,int b) {
	int c=a+b;
	return c;
}
void greatestNo(int a,int b) {
	if(a>b) {
	System.out.println("a is greater");
	}else
		System.out.println("b is greater");
}
void evenOdd() {
	int n=4;
	if(n%2==0) {
	System.out.println("true");
	}else
		System.out.println("odd");
	}
}