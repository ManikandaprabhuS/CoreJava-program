package day8.hashExamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FIFODemo {

	public static void main(String[] args) {
		Queue<Integer> fifoQueue = new LinkedList<>();
		fifoQueue.add(300);
		fifoQueue.add(500);
		fifoQueue.add(900);
		fifoQueue.add(100);
		Iterator<Integer> itr = fifoQueue.iterator();
		System.out.println("Elements in fifiQueue");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("First element is removed");
		fifoQueue.remove();
		System.out.println("Elments after removal");
		Iterator<Integer> itr2 = fifoQueue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
