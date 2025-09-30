class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int casting_time = bandage[0];
        int heal = bandage[1];
        int extra_heal = bandage[2];
        
        int hp = health;
        int total_time = attacks[attacks.length-1][0];
        int pattern = 0;
        int casting_num = 0;
        for(int t = 1; t<=total_time; t++){

            // 몬스터 공격
            if(t == attacks[pattern][0]){
                hp -= attacks[pattern][1];
                casting_num = 0; // 연속 성공 초기화
                pattern ++; // 다음 공격
                if(hp <= 0) // 죽음
                    break;
            } else { // 공격받지 않은 경우
                hp += heal; // 초당 회복
                casting_num ++; // 연속 성공 +1

                if(hp > health)
                    hp = health; // 최대 체력을 넘을 수 없음
                }
                // 추가 회복
                if(casting_num == casting_time){
                    hp += extra_heal;
                    casting_num = 0; // 연속 성공 초기화
                    if(hp > health)
                        hp = health; // 최대 체력을 넘을 수 없음
                }
        }
        if(hp <= 0) {
            hp = -1;
        }
        answer = hp;
        return answer;
    }
}