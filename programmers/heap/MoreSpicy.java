package programmers.heap;

import java.util.PriorityQueue;

//���α׷��ӽ�
//�ڵ��׽�Ʈ ���� -> �ڵ��׽�Ʈ ����� Kit -> Heap -> �� �ʰ�

public class MoreSpicy {
	public static void main(String[] args) {
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		System.out.println(solution(scoville, K));
	}
	
	static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int s : scoville) {
			pq.add(s);
		}
		while(true) {
			if(pq.peek() >= K) {
				break;
			}
			if(pq.size() == 1) {
				if(pq.peek() < K) {
					return -1;
				}
			}
			int newFood = 0;
			newFood += pq.poll();
			newFood += (pq.poll() * 2);
			pq.add(newFood);
			answer++;
		}
		return answer;
	}
}
