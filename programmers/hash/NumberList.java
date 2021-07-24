package programmers.hash;

import java.util.*;

// 답은 맞지만,
// 효율성 테스트 실패 내일 다시!
public class NumberList {
	public static void main(String[] args) {
		
	}
    static boolean solution(String[] phone_book) {
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

}
