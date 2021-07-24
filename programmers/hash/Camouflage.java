package programmers.hash;

import java.util.*;  

public class Camouflage {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(sol.solution(clothes));
	}
	
}
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++){
            if(map.get(clothes[i][1]) == null){
                map.put(clothes[i][1], 2);                
            }
            else{
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }
        }
        for(String keys: map.keySet()){
            answer *= map.get(keys);
        }
        return answer - 1;
    }
}
