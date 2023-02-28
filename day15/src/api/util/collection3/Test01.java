package api.util.collection3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		//Queue vs Stack
		//- 사용법이 정해져 있는 Collection
		//- Queue는 FIFO(First-In-First-Out, 선입선출) 형태의 저장소
		//- Stack은 LIFO(Last-In-First-Out, 후입선출) 형태의 저장소
		
		Stack<Integer> stack = new Stack<>();
		stack.push(10);//10번글 읽음
		stack.push(12);//12번글 읽음
		stack.push(17);//17번글 읽음
		stack.push(20);//20번글 읽음
		stack.push(25);//25번글 읽음
		
		//System.out.println(stack.peek());//가장 최신 데이터 확인
		
		System.out.println(stack.pop());//가장 최신 데이터 확인 + 삭제
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("-----------------");
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);//맨뒤에 10 줄세우기
		queue.add(12);//맨뒤에 12 줄세우기
		queue.add(17);//맨뒤에 17 줄세우기
		queue.add(20);//맨뒤에 20 줄세우기
		queue.add(25);//맨뒤에 25 줄세우기
		
		//System.out.println(queue.peek());//확인만

		System.out.println(queue.poll());//확인 + 추출
		System.out.println(queue.poll());//확인 + 추출
		System.out.println(queue.poll());//확인 + 추출
		System.out.println(queue.poll());//확인 + 추출
		System.out.println(queue.poll());//확인 + 추출
		System.out.println(queue.poll());//확인 + 추출
		
	}
}













