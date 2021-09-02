package StackAndQueue;

import LinkedList.INode;
import LinkedList.Node;

public class StackMain<K> {
	public static void main(String [] args) {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		Stack Stack=new Stack();
		Stack.push(myFirstNode);
		Stack.push(mySecondNode);
		Stack.push(myThirdNode);
		Stack.printStack();		
		}
}