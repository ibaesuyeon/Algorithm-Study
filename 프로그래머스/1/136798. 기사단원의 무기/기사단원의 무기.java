class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i<=number; i++){
            int divs = getDivs(i);
            if(divs > limit){
                answer += power;
            } else {
                answer += divs;
            }
        }
        return answer;
    }
    
    public int getDivs(int num){
        int divs = 0;
        for(int i = 1; i<=num/2; i++){
            if(num%i == 0)
                divs++;
        }
        return divs+1;
    }
}