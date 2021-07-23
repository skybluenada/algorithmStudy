package programmers;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 크루스칼 알고리즘 이용
 */
public class IslandConnection {
	public static int[] parent;

	public static void main(String[] args) {
		int[][] costs = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };
		System.out.println(solution(4, costs));
	}

	public static void union(int x, int y) {
		x = find(x);
		y = find(y);
		if (x != y) {
			parent[y] = x;
		}
	}

	public static int find(int x) {
		if (parent[x] == x) {
			return x;
		}
		return parent[x] = find(parent[x]);
	}


	private static int solution(int n, int[][] costs) {
		Arrays.sort(costs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});
		parent = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}

		int answer = 0;
		for (int i = 0; i < costs.length; i++) {
			int x = find(costs[i][0]);
			int y = find(costs[i][1]);
			if (x != y) {
				parent[y] = find(x);
				answer += costs[i][2];
			}
		}
		return answer;
	}
}