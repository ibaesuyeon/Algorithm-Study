class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true){
            long get = (long)(n/a) * b;
            n = n%a + (int)get;
            answer += (int)get;
            if(n<a) break;
        } 
        return answer;
    }
}