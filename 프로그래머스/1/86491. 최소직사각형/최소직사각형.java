import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i = 0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        int w_max = 1;
        int h_max = 1;
        for(int i = 0; i<sizes.length; i++){
            if(w_max <= sizes[i][0]){
                w_max = sizes[i][0];
            }
            if(h_max <= sizes[i][1]){
                h_max = sizes[i][1];
            }
        }
        answer = w_max * h_max;
        return answer;
    }
}