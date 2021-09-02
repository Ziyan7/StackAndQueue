package StackAndQueue;

import LinkedList.INode;
import LinkedList.LinkedList;

public class Stack {
	private final LinkedList<Integer> LinkedList;
	public Stack()
	{
		LinkedList=new LinkedList<Integer>();
	}
	
	/**
	 * method to add an element into the stack
	 * @param data which is to be added to stack
	 */
	public void push(INode<Integer> data)
	{
		LinkedList.append(data);
	}
	
	// method to print elements of the stack
	public void printStack()
	{
		LinkedList.printNodes();
	}

}