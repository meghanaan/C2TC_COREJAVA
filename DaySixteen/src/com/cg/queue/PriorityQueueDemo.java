package com.cg.queue;
import java.util.Queue;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq = new PriorityQueue<>();
		pq.add("coreJava");//in which order does the priority queue?
		pq.add("React");
		pq.add("hTML");
		pq.add("Angular");
		
		System.out.println(pq);
		System.out.println(pq.size());
		System.out.println(pq.contains("Html"));
		
		Iterator<String> iterator =pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(pq.peek());
		System.out.println(pq.poll());
	}
	

}
	//queue: FIFO
	//Dequeue: double ended queue
	//It allows both insert and delete option
