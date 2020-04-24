package com.indivisual.activity;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CollectionProg1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> myQueue=new PriorityQueue<Integer>();  
		myQueue.add(1);  
		myQueue.add(10);  
		myQueue.add(12);  
		myQueue.add(14);  
		myQueue.add(2);  
		System.out.println("first element:"+myQueue.element());  
		System.out.println("last element:"+myQueue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=myQueue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		

	}

}
