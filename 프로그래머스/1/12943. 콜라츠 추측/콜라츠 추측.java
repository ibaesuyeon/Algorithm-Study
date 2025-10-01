class Solution {
    public int solution(long num) {
        int answer = 0;
        int i = 0;
        for(i = 0; i<500; i++) {
            if(num == 1){
                answer = i;
                break;
            } else if(num%2 == 0){
                num = num/2;
            } else {
                num = num*3;
                num++;
            }
        }
        if(i == 500){
            answer = -1;
        }
        return answer;
    }
}