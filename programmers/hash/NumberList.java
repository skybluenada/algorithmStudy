package programmers.hash;

import java.util.*;

public class NumberList {
	public static void main(String[] args) {
		String[] phoneBook1 = {"119", "97674223", "1195524421"};	// false
		String[] phoneBook2 = {"123","456","789"};					// true
		String[] phoneBook3 = {"12","123","1235","567","88"};		// false
		
		System.out.println(solution2(phoneBook1));
		System.out.println(solution2(phoneBook2));
		System.out.println(solution2(phoneBook3));
		
		System.out.println();
	}
	// 효율성 실패
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++) {
        	for(int j = i; j < phone_book.length; j++) {
        		if(phone_book[i].length() <= phone_book[j].length() && phone_book[i].equals(phone_book[j].substring(0, phone_book[i].length()))) {
        			answer = false;
        		}        		
        	}
        }
        return answer;
    }
    
    // 해쉬 이용
    public static boolean solution2(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++){
            map.put(phone_book[i],i);
        }
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 1; j < phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0,j))){
                    answer = false;
                }
            }
        }
        return answer;
    }

        

}
