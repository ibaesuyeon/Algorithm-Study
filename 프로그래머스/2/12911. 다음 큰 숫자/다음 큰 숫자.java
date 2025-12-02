class Solution {
    public int solution(int n) {
        int answer = 0;
        int n_cnt = Integer.bitCount(n);
        
        for(int i = n+1; i<1000001; i++){
            if(Integer.bitCount(i) == n_cnt){
                answer = i; 
                break;
            }
        }
        return answer;
    }
}