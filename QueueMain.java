package StackAndQueue;

import LinkedList.Node;

public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		Queue Queue=new Queue();
		Queue.enqueue(myFirstNode);
		Queue.enqueue(mySecondNode);
		Queue.enqueue(myThirdNode);
		Queue.printQueue();
		}

	}