package StackAndQueue;

import LinkedList.INode;
import LinkedList.LinkedList;

public class Queue {
	private final LinkedList<Integer> LinkedList;
	public Queue()
	{
		LinkedList=new LinkedList<Integer>();
	}
	
	/**
	 * method to add elements to the queue
	 * @param data to be added to queue
	 */
	public void enqueue(INode<Integer> data)
	{
		LinkedList.append(data);
	}
	
	/**
	 * to remove elements from the front of the queue
	 * @return the queue
	 */
	public INode<Integer> dequeue()
	{
		return LinkedList.pop();
	}
	/**
	 * method to print elements of the stack
	 * @return nothing
	 */
	public void printQueue()
	{
		LinkedList.printNodes();
	}
}