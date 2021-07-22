package programmers;

import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long min = 0;
        long max = (long)times[times.length - 1] * n;
        long mid = max;
        while(min <= max) {        	
        	long total = 0;
    		mid = (min + max) / 2;

        	for(int i = 0 ; i < times.length; i++) {        		
        		total += mid / times[i];        		
        	}
        	if(total >= n) {	// ���غ��� �� ���� �˻��ϸ�, �ð��� �ٿ��� �� ���� �˻��ؾ���        	
        		max = mid - 1;
                answer = mid;

        	}
        	if(total < n) {	// ���غ��� �� ���� �˻��ϸ�, �ð��� �÷��� �� ���� �˻��ؾ���
        		min = mid + 1;
        	}
        }
        return answer;
    }
}

public class Immigration {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] times = new int[] {7,10};
		System.out.println(sol.solution(6, times));		
	}
}
