package sp_collect;

import java.util.LinkedList;
import java.util.Queue;

public class Ex_Queue {

	public static void main(String[] args) {
		
		// 큐는 인터페이스
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("송길동");
		System.out.println(queue.peek());
		queue.offer("홍길동");
		System.out.println(queue.peek());
		queue.offer("박길동");
		System.out.println(queue.peek());
		queue.offer("김길동");
		System.out.println(queue.peek());
		
		System.out.println("--------------");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
