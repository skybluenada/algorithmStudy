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
        	if(cnt > n) {	// 기준보다 더 많이 검사하면, 시간을 줄여서 더 적게 검사해야함        	
        		System.out.println("1");		
        		max = time;
        		time = (min + max) / 2;
        	}
        	if(cnt < n) {	// 기준보다 더 적게 검사하면, 시간을 늘려서 더 많이 검사해야함
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
