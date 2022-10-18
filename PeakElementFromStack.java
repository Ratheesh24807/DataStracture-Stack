package com.Stack;

public class PeakElementFromStack {
	private class Node {

		int data;
		Node link;
	}

	Node top;

	PeakElementFromStack() {
		this.top = null;
	}

	@SuppressWarnings("unused")
	public void push(int x) {
		Node temp = new Node();
		if (temp == null) {
			System.out.print("\nHeap Overflow");
			return;
		}
		temp.data = x;

		temp.link = top;
		top = temp;
	}

	public void display() {
		if (top == null) {
			System.out.printf("\nStack Underflow");

		} else {
			Node temp = top;
			while (temp != null) {
				System.out.printf("-> %d  ", temp.data);
				temp = temp.link;
			}
		}
	}

	public static void main(String[] args) {
		PeakElementFromStack obj = new PeakElementFromStack();
		obj.push(70);
		obj.push(30);
		obj.push(56);
		obj.display();

	}
}
