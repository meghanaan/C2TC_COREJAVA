package com.cg.queue;
import java.util.Queue;
import java.util.LinkedList;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q= new LinkedList<>();
		for(int i=0;i<5;i++)
		q.add(i);
		System.out.println(q);
		
		int removable =q.remove();
		System.out.println(removable);
		
		System.out.println(q);//Permanent removal
		
		//head of queue
		int head = q.peek();
		System.out.println(head);//retrieving the first element
		
		int delete = q.poll();
		System.out.println(delete);//deleting the first element
		
		System.out.println(q.size());
	}

}
