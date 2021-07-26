class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        for(int i = citations.length-1; i >= 0; i--){
            int cnt1 = 0;
            int cnt2 = 0;
            for(int j = 0; j < citations.length; j++){
                if(citations[j] >= i)
                    cnt1++;
                if(citations[j] <= i)
                    cnt2++;
            }
            if(i<=cnt1 && i>=cnt2){
                 answer = i;
                 break;
            }
        }    
        return answer;
    }
}
