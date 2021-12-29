package sp_collect;

import java.util.Stack;

public class Ex_Stack {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("노길동");
		System.out.println(stack.peek());
		stack.push("도길동");
		System.out.println(stack.peek());
		stack.push("라길동");
		System.out.println(stack.peek());
		stack.push("호길동");
		System.out.println(stack.peek());
		
		System.out.println("-----------------------------");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
