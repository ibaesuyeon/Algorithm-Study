class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i<schedules.length; i++){
            int day = startday;
            int score = 0;
            for(int j = 0; j<7; j++){    
                // 제 시간에 도착했으며
                if(convertTime(timelogs[i][j]) <= convertTime(schedules[i])+10){ 
                    if(day%7 != 6 && day%7 != 0) // 주말이 아닌경우
                        score++; // 출근일 수
                }
                day++;
            }
            if(score == 5){
                answer++;
            }
        }
        return answer;
    }
    public int convertTime(int time){
        int h = time/100;
        int m = time%100;
        return h*60 + m;
    }
}