class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(true){
            int get = (n/a) * b;
            n = n%a + get;
            answer += get;
            if(n<a) break;
        } 
        return answer;
    }
}