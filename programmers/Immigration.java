package programmers;

import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        int min = 1;
        int max = times[times.length - 1] * n;
        int time = max;
        while(true) {        	
            int cnt = 0;
        	for(int i = 0 ; i < times.length; i++) {        		
        		cnt += time / times[i];        		
        		System.out.println(cnt + " ' " + times[i]);
        	}
        	if(cnt > n) {	// ���غ��� �� ���� �˻��ϸ�, �ð��� �ٿ��� �� ���� �˻��ؾ���        	
        		System.out.println("1");		
        		max = time;
        		time = (min + max) / 2;
        	}
        	if(cnt < n) {	// ���غ��� �� ���� �˻��ϸ�, �ð��� �÷��� �� ���� �˻��ؾ���
        		System.out.println("2");		
        		min = time;
        		time = (min + max) / 2;
        	}
        	if(cnt == n)
                return time;
        }

    }
}

public class Immigration {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] times = new int[] {7,10};
		System.out.println(sol.solution(6, times));		
	}
}
