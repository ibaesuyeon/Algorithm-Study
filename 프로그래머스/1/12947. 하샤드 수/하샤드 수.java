class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int origin_x = x;
        int sum = 0;
        while(true){
            if(x<10){
                sum += x;
                break;
            }
            sum += x%10;
            x = x/10;
        }
        if(origin_x%sum == 0){
            answer = true;
        }
        return answer;
    }
}