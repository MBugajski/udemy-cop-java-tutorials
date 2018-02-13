import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
	public static void main(String[] args) {
		// <--(head)ooooooooooooooooooooooooo(tail)<-- (first in, first out).
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		
		try {
			q1.add(10);
			q1.add(0);
			q1.add(5);
			q1.add(2);
		} catch (IllegalStateException e) {
			System.out.println("Tried to ass too many irems to the queue.");
		}
		
		System.out.println("Head of the queue is: " + q1.element());
		
		for (int i : q1 ) {
			System.out.println(i);
		}
		
		for (int i : q1) {
			Integer value = q1.remove();
			System.out.println("Removed from queue: " + value);
		}
		
		
		/////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Q2 peek: " + q2.peek());
		
		try {
			q2.offer(11);
			q2.offer(1);
			q2.offer(6);
			if (q2.offer(7) == false) {
				System.out.println("Couldn't add to the queue");
			}
		} catch (IllegalStateException e) {
			System.out.println("Tried to ass too many irems to the queue.");
		}
		
		System.out.println("Head of the queue is: " + q2.element());
		
		for (int i : q2 ) {
			System.out.println(i);
		}
		
		System.out.println("Q2 poll: " + q2.poll());
		System.out.println("Q2 poll: " + q2.poll());
		System.out.println("Q2 poll: " + q2.poll());
		
	}
}
