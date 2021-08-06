package programmers.heap;

import java.util.*;

// 프로그래머스
// 코딩테스트 연습 -> 코딩테스트 고득점 Kit -> Heap -> 이중우선순위큐

public class DualPriorityQueue {
	public static void main(String[] args) {
		String[] operations = { "I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333" }; 
		// 기댓값 333, -45																												
		int[] sol = solution(operations);
		System.out.println(sol[0] + "," + sol[1]);
		String[] operations2 = { "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1" }; 
		// 기댓값 0, 0																												
		int[] sol2 = solution(operations2);
		System.out.println(sol2[0] + "," + sol2[1]);	
	}

	static int[] solution(String[] operations) {
		int[] answer = new int[2];
		Deque<Integer> dq = new ArrayDeque<>();

		for (int i = 0; i < operations.length; i++) {
			String[] splitOper = operations[i].split(" ");
			int splitOperNum = Integer.parseInt(splitOper[1]);
			if (splitOper[0].equals("I")) {
				if(!dq.isEmpty()) {
					if (dq.peekFirst() > splitOperNum) {
						dq.addFirst(splitOperNum);
					}
					if (dq.peekLast() < splitOperNum) {
						dq.addLast(splitOperNum);
					}					
				}
				else {
					dq.add(splitOperNum);
				}
			}
			if (splitOper[0].equals("D")) {
				if(!dq.isEmpty()){
					if (splitOper[1].equals("1")) {
                        dq.pollLast();
                    }
                    if (splitOper[1].equals("-1")) {
                        dq.pollFirst();
                    }                         
                }
			}
		}
		if(dq.isEmpty()) {
			answer[0] = answer[1] = 0;
		}else {
			answer[0] = dq.peekLast();
			answer[1] = dq.peekFirst();			
		}
		return answer;
	}
}
