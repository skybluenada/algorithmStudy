import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int[] tmpArray = array.clone();
//            int tmpArray = Arrays.copyOfRange(araay,commands[i][0]-1,commands[i][1]);
            Arrays.sort(tmpArray,commands[i][0]-1,commands[i][1]);
            answer[i] = tmpArray[commands[i][0] + commands[i][2] - 2];
        }
        return answer;
    }
}
